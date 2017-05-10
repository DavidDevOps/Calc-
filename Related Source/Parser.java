import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * 스택
 * push : 저장,삽입
 * pop : 삭제
 * peek : 마지막 스택
 */

class Parser
{
	private static char operator[] = {'+','-','*','/'};
	private static char parenthesis[] = {'(',')'};
	private String numberBuffer, inputExpression;

	private List<String> symbols = new ArrayList<String>(); //걍 리스트로 만듬 ^오^

	private Stack<String> stack = new Stack<String>(); //이거슨 스택
	
	////////////////////////////////////////////////////////////////////////////////////////////
	public Parser(String expression) { inputExpression = expression; } //생성자에 중위식 사칙연산 수식 입력
	////////////////////////////////////////////////////////////////////////////////////////////
	
	
	////////////////////////////////////////////////////////////////////////////////////////////
	//parseSymbols 메소드 : 중위식 사칙연산 수식에서 symbol 추출 : main
	public void parseSymbols()
	{
		//문자 단위
		for(char idx = 0; idx < inputExpression.length(); idx++)
		{
			//charAt : idx번째의 인수번째의 값을 받아옴
			char charInExpression = inputExpression.charAt(idx);
			
			/* 공백이 처리되기 떄문에 필요가 업어짐
			//공백 문자이면 이전 버퍼의 내용을 비움
			if(Character.isWhitespace(charInExpression)){
				handleTempBuff();
			}
			*/
			
			System.out.println("입력한 문자의 " + Integer.valueOf(idx) + "번째의 값 : " + charInExpression + " 추가 된 부분(확인용)"); // 추가 된 부분(확인용)
			
			//사칙연산 연산자이거나 괄호인 경우, 항목 추가
			if(isMathOperatorOrParenthesis(charInExpression))
			{
				handleTempBuff();
				symbols.add(String.valueOf(charInExpression));
			}
			
			//숫자인 경우, 숫자 버퍼에 추가
			else if(Character.isDigit(charInExpression)) // isDigit(인수) : 인수로 받은 숫자가 0~9 인지 확인해주는 함수
			{
				if(numberBuffer == null) numberBuffer = String.valueOf(charInExpression); 
				else numberBuffer += charInExpression;
			}
		}
		handleTempBuff();
	}
	
	//handleTempBuff 메소드 : 새로운 symbol을 찾은 경우, 임시 버퍼의 내용을 항목 목록에 추가 : parseSymbols()
	private void handleTempBuff()
	{
		if(numberBuffer!=null)
		{
			System.out.println("handleTempBuff() 실행 : " + numberBuffer + " 추가 된 부분(확인용)"); // 추가 된 부분(확인용)
			symbols.add(numberBuffer);
			numberBuffer = null;
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	
	
	////////////////////////////////////////////////////////////////////////////////////////////
	//toPostfix 메소드 : 중위식을 후위식으로 변환 : main p.s 제일 빡치는 함수
	public void toPostfix()
	{
		List<String> postfixExpression = new ArrayList<String>();
		
		for(String symbol : symbols)
		{
			char firstCharofColumn = symbol.charAt(0);
			
			// 피연산자(숫자)이면, 피연산자를 후위식에 추가
			if(!isMathOperatorOrParenthesis(firstCharofColumn)){
				postfixExpression.add(symbol);
			}
			
			//좌괄호이면 스택에 추가
			else if('(' == firstCharofColumn){
				stack.push(symbol);
			}
			
			//우괄호이면, 좌괄호 (가 나올때까지 스택에서 꺼냄
			else if(')' == firstCharofColumn)
			{
				//스택의 최상위 값이 (가 아니면 반복
				while(!"(".equals(stack.peek())){
					postfixExpression.add(stack.pop());
				}
				
				stack.pop();
			}
			
			//연산자이면, 스택에 있는 더 높은 우선순위 연산자 처리
			else
			{
				//스택이 비어 있거나 스택에 최상위에 좌괄호가 들어 있으면, 연산자를 스택에 추가
				if(stack.isEmpty() || "(".equals(stack.peek())){
					System.out.println("연산자 스택 추가 : " + symbol + " 추가 된 부분(확인용)"); // 추가 된 부분(확인용)
					stack.push(symbol);
				}
				
				//연산자의 우선순위가 스택의 최상위에 있는 연산자보다 높으면 스택에 추가
				else if(priority(symbol) > priority(stack.peek())){
					stack.push(symbol);
				}
				
				//연산자의 우선순의가 스택의 최상위에 있는 연산자와 같으면 처리
				//예를 들어 좌측에서 우측으로 연산하는 경우 스택의 최상위 연산자를 꺼내고, 연산자를 스택에 추가함)
				else if(priority(symbol) == priority(stack.peek()))
				{
					postfixExpression.add(stack.pop());
					stack.push(symbol);
				}
				
				//새로운 연산자의 우선순위가 스택의 최상위에 있는 연산자보다 낮으면
				//스택의 최상위 연산자를 꺼내고, 새로운 연산자를 스택에 추가함
				else{
					while(!stack.isEmpty() && priority(symbol) <= priority(stack.peek())){
						postfixExpression.add(stack.pop());
					}
					stack.push(symbol);
				}
			}
		}
		
		//후위식에 스택에 남은 연산자들을 추가
		while(!stack.isEmpty()){
			postfixExpression.add(stack.pop());
		}
		
		//덮어쓴다! ^오^
		symbols = postfixExpression;
	}
	
	//priority 메소드 : 연산자 우선순의를 반환한다. : toPostfix()
	private int priority(String symbol)
	{
		int priority = 0;
		switch(symbol)
		{
			case "*":
			case "/":
				priority = 2; // 2 : 선
				break;
				
			case "+":
			case "-":
				priority = 1; // 1 : 후
				break;
		}
		
		return priority;
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	
	
	////////////////////////////////////////////////////////////////////////////////////////////
	//calculate 메소드 : 후위식 계산을 수행하고 결과값 반환 : main
	public double calculate() // return 타입 : int -> double 
	{
		//후위식 기호(symbol) 순차적으로 처리
		for(String symbol : symbols)
		{
			char firstChofSymbol = symbol.charAt(0);
			
			//사칙연산 연산자일 경우
			if(isOperator(firstChofSymbol))
			{
				System.out.println("firstChofSymbol 실행 : " + firstChofSymbol + " 추가 된 부분(확인용)"); // 추가 된 부분(확인용)
				try { // 숫자가 아닌 값이 들어갈 수 있기 때문에 예외 처리
					double secondOper = Double.valueOf(stack.pop()); // int -> double, Integer -> Double
					System.out.println("secondOper : " + secondOper + " 추가 된 부분(확인용)"); // 추가 된 부분(확인용)
					double firstOper = Double.valueOf(stack.pop()); // int -> double, Integer -> Double
					System.out.println("firstOper : " + firstOper + " 추가 된 부분(확인용)"); // 추가 된 부분(확인용)
					
					double result = 0; // int -> double, Integer -> Double
					
					switch(firstChofSymbol)
					{
						case '+':
							result = firstOper + secondOper;
							break;
							
						case '-':
							result = firstOper - secondOper;
							break;
							
						case '*':
							result = firstOper * secondOper;
							break;
							
						case '/':
							result = firstOper / secondOper;
							break;
					}
					//연산 결과를 다시 스택에 담음
					stack.push(String.valueOf(result));
				} catch(Exception e) { // 예외처리의 catch 부분
					System.out.println("피연산자 값에 숫자가 아닌 값이 들어가 있습니다. 추가 된 부분(명시용)"); // 추가 된 부분(명시용)
					return 0; // 스택에 결과가 남지 않게 되므로 0을 반환해 넘긴다.
				}
			}
			//피연산자인 경우엔 스택에 담음
			else{
				stack.push(symbol);
			}
		}
		
		//모든 처리가 끝나면, 결과 값이 스택에 남아 있다.
		return Double.valueOf(stack.pop()); // Integer -> Double
	}
	
	private boolean isOperator(char inputChar)
	{
		for(char op : operator) {
			if(inputChar == op) {
				return true;
			}
		}
		return false;
	}
	////////////////////////////////////////////////////////////////////////////////////////////

	
	////////////////////////////////////////////////////////////////////////////////////////////
	//생략 : 연산자인지 괄호인지 검사 : parseSymbols(), toPostfix()
	private boolean isMathOperatorOrParenthesis(char inputChar)
	{
		for(char op : operator) {
			if(inputChar == op) {
				return true;
			}
		}
		for(char brace : parenthesis) {
			if(inputChar == brace) {
				return true;
			}
		}
		return false;
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	
	
	////////////////////////////////////////////////////////////////////////////////////////////	
	//print 메소드 : 출력한다. ^오^ : none
	/*
	public void print()
	{
		for(String symbol : symbols){
			System.out.println(symbol + " ");
		}
		System.out.println();
	}
	*/
}