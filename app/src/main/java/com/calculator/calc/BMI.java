package com.calculator.calc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class BMI extends SherlockFragment {

    View v;
    EditText[] tripple = new EditText[2];
    EditText result;
    TextView type;
    int count = 0;
    float height, weight, dresult;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.bmi, container, false);

        tripple[0] = (EditText) v.findViewById(R.id.height);
        tripple[1] = (EditText) v.findViewById(R.id.weight);
        result = (EditText) v.findViewById(R.id.result);
        type = (TextView) v.findViewById(R.id.type);

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
        v.findViewById(R.id.equal).setOnClickListener(new ButtonListener());
        v.findViewById(R.id.dot).setOnClickListener(new ButtonListener());
        v.findViewById(R.id.up).setOnClickListener(new ButtonListener());
        v.findViewById(R.id.down).setOnClickListener(new ButtonListener());

        return v;
    }

    class ButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.up:
                    count = 0;
                    break;
                case R.id.down:
                    count = 1;
                    break;
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case R.id.num0: // 0
                    alreadyExistResult();

                    tripple[count].append("0");
                    break;
                case R.id.num1: // 1
                    alreadyExistResult();

                    tripple[count].append("1");
                    break;
                case R.id.num2: // 2
                    alreadyExistResult();

                    tripple[count].append("2");
                    break;
                case R.id.num3: // 3
                    alreadyExistResult();

                    tripple[count].append("3");
                    break;
                case R.id.num4: // 4
                    alreadyExistResult();

                    tripple[count].append("4");
                    break;
                case R.id.num5: // 5
                    alreadyExistResult();

                    tripple[count].append("5");
                    break;
                case R.id.num6: // 6
                    alreadyExistResult();

                    tripple[count].append("6");
                    break;
                case R.id.num7: // 7
                    alreadyExistResult();

                    tripple[count].append("7");
                    break;
                case R.id.num8: // 8
                    alreadyExistResult();

                    tripple[count].append("8");
                    break;
                case R.id.num9: // 9
                    alreadyExistResult();

                    tripple[count].append("9");
                    break;
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // 지우기
                case R.id.erase:
                    if (tripple[count].getText().toString().length() != 0) { // 입력 값이 이미 있을 때
                        tripple[count].setText(tripple[count].getText().toString().substring(0, tripple[count].getText().toString().length() - 1));
                        result.setText("");
                        type.setText("");
                    }
                    break;

                case R.id.eraseAll:
                    tripple[0].setText("");
                    tripple[1].setText("");
                    result.setText("");
                    type.setText("");
                    count = 0;
                    break;

                // 점
                case R.id.dot:
                    if (tripple[count].getText().toString().length() != 0) { // 입력 값이 이미 있을 때
                        if (!checkOperator(tripple[count].getText().toString()) && !tripple[count].getText().toString().endsWith(".") && !checkBrace(tripple[count].getText().toString())) {
                            String[] inputSplit = tripple[count].getText().toString().split("(?<=[(-+*/)])|(?=[(-+*/)])");
                            for (int i = 0; i < inputSplit.length; i++) {
                                if (!inputSplit[i].equals("+") && !inputSplit[i].equals("-") && !inputSplit[i].equals("*") && !inputSplit[i].equals("/") && !inputSplit[i].equals("(") && !inputSplit[i].equals(")")) {
                                    if (!inputSplit[i].contains(".")) {
                                        tripple[count].append(".");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case R.id.equal:
                    if(tripple[0].getText().toString().length() != 0 && tripple[1].getText().toString().length() != 0) {
                        height = Float.parseFloat(tripple[0].getText().toString());
                        weight = Float.parseFloat(tripple[1].getText().toString());
                        dresult = (weight * weight) / height;
                        result.setText(Float.toString(dresult));

                        if(dresult <= 18.5) {
                            type.setText("저체중");
                        }
                        else if(dresult >= 18.5 && dresult < 23) {
                            type.setText("정상체중");
                        }
                        else if(dresult >= 23 && dresult < 25) {
                            type.setText("과체중");
                        }
                        else if(dresult >= 25 && dresult < 30) {
                            type.setText("비만");
                        }
                        else if(dresult >= 30) {
                            type.setText("고도비만");
                        }
                    }
                    break;
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            }
        }

        private boolean checkOperator(String value) {
            if (value.endsWith("+") || value.endsWith("-") || value.endsWith("*") || value.endsWith("/"))
                return true;

            return false;
        }

        private boolean checkBrace(String value) {
            if (value.endsWith("(") || value.endsWith(")"))
                return true;

            return false;
        }

        private void alreadyExistResult() {
            if (result.getText().toString().length() != 0) { // 결과 값이 이미 있을 때
                tripple[count].setText("");
                result.setText("");
                type.setText("");
            }
        }
    }
}
