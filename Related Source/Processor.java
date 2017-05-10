import java.util.Scanner;

class Processor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); //계산 입력
		String expression = sc.nextLine(); //사칙연산 수식 입력
		
		if(expression.trim().isEmpty()) //어무것도 입력하지 않았거나 공백만 입력했을 경우, 메세제 출력
			System.out.print("아무것도 입력하지 않았습니다.");
		else //정상적으로 됬을때 연산
			runParser(expression.replace(" ", "")); // replace(인수1, 인수2) : 인수1의 문자를 인수2의 문자로 변경 : 입력이 성공적으로 되었을 경우 공백은 필요가 없어지므로 공백 삭제를 위해
		
		sc.close(); //스캐너 닫음
	}
	
	//runParser : 사칙연산 수식을 계산함
	static void runParser(String expression)
	{
		Parser parser = new Parser(expression);
		parser.parseSymbols(); 
		parser.toPostfix(); 
		
		double result = parser.calculate(); // 계산 : int -> double

		System.out.println(result); //계산 결과 출력
	}
}