package com.calculator.calc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Normal extends SherlockFragment {

	View v;
	TextView inputTV, resultTV;
	int leftBraceCount = 0, rightBraceCount = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.normal, container, false);

		inputTV = (TextView)v.findViewById(R.id.inputTV);
		resultTV = (TextView)v.findViewById(R.id.resultTV);

		v.findViewById(R.id.erase).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num0).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num1).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num2).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num3).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num4).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num5).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num6).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num7).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num8).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num9).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.eraseAll).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.div).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.mult).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.min).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.plus).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.equal).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.leftBrace).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.rightBrace).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.dot).setOnClickListener(new ButtonListener());

		return v;
	}

	class ButtonListener implements OnClickListener {
		public void onClick(View v) {
			switch (v.getId()) {
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				case R.id.num0: // 0
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("0");
					break;
				case R.id.num1: // 1
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("1");
					break;
				case R.id.num2: // 2
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("2");
					break;
				case R.id.num3: // 3
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("3");
					break;
				case R.id.num4: // 4
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("4");
					break;
				case R.id.num5: // 5
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("5");
					break;
				case R.id.num6: // 6
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("6");
					break;
				case R.id.num7: // 7
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("7");
					break;
				case R.id.num8: // 8
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("8");
					break;
				case R.id.num9: // 9
					alreadyExistResult();
                    if(inputTV.getText().toString().endsWith(")"))
                        inputTV.append("*");

					inputTV.append("9");
					break;
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				// 지우기
				case R.id.erase:
					if(inputTV.getText().toString().length() != 0) { // 입력 값이 이미 있을 때
                        if(inputTV.getText().toString().endsWith("(")) leftBraceCount--;
                        else if (inputTV.getText().toString().endsWith(")")) rightBraceCount--;

                        inputTV.setText(inputTV.getText().toString().substring(0 , inputTV.getText().toString().length() - 1));

						resultTV.setText("");
					}
					break;

				case R.id.eraseAll:
					inputTV.setText("");
					resultTV.setText("");
					leftBraceCount = 0; rightBraceCount = 0;
					break;

				// 점
				case R.id.dot:
					if(inputTV.getText().toString().length() != 0) { // 입력 값이 이미 있을 때
						if(!checkOperator(inputTV.getText().toString()) && !inputTV.getText().toString().endsWith(".") && !checkBrace(inputTV.getText().toString()))  {
							String[] inputSplit = inputTV.getText().toString().split("(?<=[(-+*/)])|(?=[(-+*/)])");
							for(int i = 0; i < inputSplit.length; i++) {
								if(!inputSplit[i].equals("+") && !inputSplit[i].equals("-") && !inputSplit[i].equals("*") && !inputSplit[i].equals("/") && !inputSplit[i].equals("(") && !inputSplit[i].equals(")") ) {
									if(!inputSplit[i].contains(".")) {
										inputTV.append(".");
										break;
									}
								}
							}
						}
					}
					break;

				case R.id.leftBrace:
					alreadyExistResult();
                    if(inputTV.getText().toString().length() != 0) {
                        if(inputTV.getText().toString().endsWith(")")) inputTV.append("*");
                        if(Character.isDigit(inputTV.getText().toString().charAt(inputTV.getText().toString().length()-1))) inputTV.append("*");
                    }

					leftBraceCount++;
					inputTV.append("(");
					break;

				case R.id.rightBrace:
					alreadyExistResult();

					rightBraceCount++;
					inputTV.append(")");
					break;

				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				case R.id.plus: // +
					if(inputTV.getText().toString().length() != 0) { // inputTV의 값의 길이가 0이 아닐 때
						// inputTV의 값의 끝이 +, -, *, /이 아니고 .과 괄호"()"이 아니면 출력한다.
						if(!checkOperator(inputTV.getText().toString()) && !inputTV.getText().toString().endsWith(".") && !checkBrace(inputTV.getText().toString()))
							inputTV.append("+");
					}
					break;
				case R.id.min: // -
					if(inputTV.getText().toString().length() != 0) { // inputTV의 값의 길이가 0이 아닐 때
						// inputTV의 값의 끝이 +, -, *, /이 아니고 .과 괄호"()"이 아니면 출력한다.
						if(!checkOperator(inputTV.getText().toString()) && !inputTV.getText().toString().endsWith(".") && !checkBrace(inputTV.getText().toString()))
							inputTV.append("-");
					}
					break;
				case R.id.mult: // *
					if(inputTV.getText().toString().length() != 0) { // inputTV의 값의 길이가 0이 아닐 때
						// inputTV의 값의 끝이 +, -, *, /이 아니고 .과 괄호"()"이 아니면 출력한다.
						if(!checkOperator(inputTV.getText().toString()) && !inputTV.getText().toString().endsWith(".") && !checkBrace(inputTV.getText().toString()))
							inputTV.append("*");
					}
					break;
				case R.id.div: // /
					if(inputTV.getText().toString().length() != 0) { // inputTV의 값의 길이가 0이 아닐 때
						// inputTV의 값의 끝이 +, -, *, /이 아니고 .과 괄호"()"이 아니면 출력한다.
						if(!checkOperator(inputTV.getText().toString()) && !inputTV.getText().toString().endsWith(".") && !checkBrace(inputTV.getText().toString()))
							inputTV.append("/");
					}
					break;
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				case R.id.equal:
					if(leftBraceCount == rightBraceCount) {
						Parser parser = new Parser(inputTV.getText().toString());

						float result = parser.calculate();

                        DecimalFormat df = new DecimalFormat("#,###.######");
                        String temp = df.format(result);

						resultTV.setText(temp);
					}
					else
						resultTV.setText("괄호의 갯수를 맞춰주세요.");
					break;
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		private boolean checkOperator(String value) {
			if(value.endsWith("+") || value.endsWith("-") || value.endsWith("*") || value.endsWith("/"))
				return true;

			return false;
		}

		private boolean checkBrace(String value) {
			if(value.endsWith("(")/*|| value.endsWith(")")*/)
				return true;

			return false;
		}

		private void alreadyExistResult() {
			if(resultTV.getText().toString().length() != 0) { // 결과 값이 이미 있을 때
				inputTV.setText("");
				resultTV.setText("");
                leftBraceCount = 0;
                rightBraceCount = 0;
			}
		}

		public class Parser {
			private String inputExpression;

			private List<String> symbols = new ArrayList<String>();

			private Stack<String> stack = new Stack<String>();

			////////////////////////////////////////////////////////////////////////////////////////////
			public Parser(String expression) {
                inputExpression = expression;
                parseSymbols();
                toPostfix();
            }
			////////////////////////////////////////////////////////////////////////////////////////////

			////////////////////////////////////////////////////////////////////////////////////////////
			public void parseSymbols() {
				String[] inputSplit = inputExpression.split("(?<=[(-+*/)])|(?=[(-+*/)])");
				for(int i = 0; i < inputSplit.length; i++) {
					symbols.add(inputSplit[i]);
				}
			}
			////////////////////////////////////////////////////////////////////////////////////////////

			////////////////////////////////////////////////////////////////////////////////////////////
			//toPostfix 메소드 : 중위식을 후위식으로 변환 : main
            public void toPostfix() {
                List<String> postfixExpression = new ArrayList<String>();

                for(String symbol : symbols) {
                    System.out.println("symbol.charAt(0) : " + symbol.charAt(0));
                    char firstCharofColumn = symbol.charAt(0);
                    System.out.println("firstCharofColumn : "+firstCharofColumn);
                    // 피연산자(숫자)이면, 피연산자를 후위식에 추가
                    if(Character.isDigit(firstCharofColumn)) postfixExpression.add(symbol);
                    //좌괄호이면 스택에 추가
                    else if('(' == firstCharofColumn) stack.push(symbol);

                    //우괄호이면, 좌괄호 (가 나올때까지 스택에서 꺼냄
                    else if(')' == firstCharofColumn) {
                        //스택의 최상위 값이 (가 아니면 반복
                        while(!"(".equals(stack.peek())) {
                            postfixExpression.add(stack.pop());
                        }
                        stack.pop();
                    }
                    else { //연산자이면, 스택에 있는 더 높은 우선순위 연산자 처리
                        //스택이 비어 있거나 스택에 최상위에 좌괄호가 들어 있으면, 연산자를 스택에 추가
                        if(stack.isEmpty() || "(".equals(stack.peek())) stack.push(symbol);

                        //연산자의 우선순위가 스택의 최상위에 있는 연산자보다 높으면 스택에 추가
                        else if(priority(symbol) > priority(stack.peek())) stack.push(symbol);

                        //연산자의 우선순의가 스택의 최상위에 있는 연산자와 같으면 처리
                        //예를 들어 좌측에서 우측으로 연산하는 경우 스택의 최상위 연산자를 꺼내고, 연산자를 스택에 추가함)
                        else if(priority(symbol) == priority(stack.peek())) {
                            postfixExpression.add(stack.pop());
                            stack.push(symbol);
                        }

                        //새로운 연산자의 우선순위가 스택의 최상위에 있는 연산자보다 낮으면
                        //스택의 최상위 연산자를 꺼내고, 새로운 연산자를 스택에 추가함
                        else {
                            while(!stack.isEmpty() && priority(symbol) <= priority(stack.peek())) {
                                postfixExpression.add(stack.pop());
                            }
                            stack.push(symbol);
                        }
                    }
                }
                //후위식에 스택에 남은 연산자들을 추가
                while(!stack.isEmpty()) {
                    postfixExpression.add(stack.pop());
                }
                //덮어쓴다! ^오^
                symbols = postfixExpression;
            }
			//priority 메소드 : 연산자 우선순의를 반환한다. : toPostfix()
			private int priority(String symbol) {
				int priority = 0;
				if(symbol.equals("*") || symbol.equals("/"))
					priority = 2; // 2 : 선
				else if(symbol.equals("+") || symbol.equals("-"))
					priority = 1;

				return priority;
			}
			////////////////////////////////////////////////////////////////////////////////////////////

			////////////////////////////////////////////////////////////////////////////////////////////
			//calculate 메소드 : 후위식 계산을 수행하고 결과값 반환 : main
			public float calculate() {
				//후위식 기호(symbol) 순차적으로 처리
                for(String symbol : symbols) {
                    char firstChofSymbol = symbol.charAt(0);
                    //사칙연산 연산자일 경우
                    if(isOperator(firstChofSymbol)) {
                        try {
                            float secondOper = Float.valueOf(stack.pop());
                            float firstOper = Float.valueOf(stack.pop());
                            float result = 0;
                            switch (firstChofSymbol) {
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
                            stack.push(String.valueOf(result)); //연산 결과를 다시 스택에 담음
                        } catch (Exception e) {
                            e.printStackTrace();
                            return 0;
                        }
                    }
                    else //피연산자인 경우엔 스택에 담음
                        stack.push(symbol);
                }
				//모든 처리가 끝나면, 결과 값이 스택에 남아 있다.
				return Float.parseFloat(stack.pop());
			}

			private boolean isOperator(char inputChar) {
				if(inputChar == '+' || inputChar == '-' || inputChar == '*' || inputChar == '/')
					return true;

				return false;
			}
			////////////////////////////////////////////////////////////////////////////////////////////
		}
	}
}