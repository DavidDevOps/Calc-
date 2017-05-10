package com.calculator.calc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockFragment;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Rate extends SherlockFragment {

    View v;
    String[] splitString;
    String name = "중국", code = "CNY";
    double value;
    int count;
    Button beforeChageBT;
    EditText beforeChangeET, afterChageET;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.rate, container, false);

        beforeChageBT = (Button) v.findViewById(R.id.beforeChangeBT);
        beforeChangeET = (EditText) v.findViewById(R.id.beforeChangeET);
        afterChageET = (EditText) v.findViewById(R.id.afterChageET);

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

        beforeChageBT.setOnClickListener(new ButtonListener());

        return v;
    }

    final CharSequence[] items = {"중국", "일본", "인도", "싱가포르", "영국", "아일랜드", "프랑스", "독일", "네덜란드", "이탈리아", "스페인",
    "덴마크", "노르웨이", "스웨덴", "스위스", "오스트리아", "미국", "멕시코", "캐나다"};

    String exp = "위안";

    class ButtonListener implements View.OnClickListener {
        public void onClick(View vs) {
            switch (vs.getId()) {
                case R.id.beforeChangeBT:
                    alreadyExistResult();

                    new AlertDialog.Builder(v.getContext())
                    .setTitle("나라 선택")
                    .setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            name = items[which].toString();
                            beforeChageBT.setText(items[which].toString());
                            if(name.equals("중국")) code = "CNY";
                            else if(name.equals("일본")) code = "JPY";
                            else if(name.equals("인도")) code = "INR";
                            else if(name.equals("싱가포르")) code = "SGD";
                            else if(name.equals("영국")) code = "GBP";
                            else if(name.equals("아일랜드")) code = "EUR";
                            else if(name.equals("프랑스")) code = "EUR";
                            else if(name.equals("독일")) code = "EUR";
                            else if(name.equals("네덜란드")) code = "EUR";
                            else if(name.equals("이탈리아")) code = "EUR";
                            else if(name.equals("스페인")) code = "EUR";
                            else if(name.equals("덴마크")) code = "DKK";
                            else if(name.equals("노르웨이")) code = "NOK";
                            else if(name.equals("스웨덴")) code = "SEK";
                            else if(name.equals("스위스")) code = "CHF";
                            else if(name.equals("오스트리아")) code = "EUR";
                            else if(name.equals("미국")) code = "USD";
                            else if(name.equals("멕시코")) code = "MXN";
                            else if(name.equals("캐나다")) code = "CAD";

                            dialog.cancel();
                        }
                    }).show();
                    break;
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case R.id.num0: // 0
                    alreadyExistResult();

                    beforeChangeET.append("0");
                    break;
                case R.id.num1: // 1
                    alreadyExistResult();

                    beforeChangeET.append("1");
                    break;
                case R.id.num2: // 2
                    alreadyExistResult();

                    beforeChangeET.append("2");
                    break;
                case R.id.num3: // 3
                    alreadyExistResult();

                    beforeChangeET.append("3");
                    break;
                case R.id.num4: // 4
                    alreadyExistResult();

                    beforeChangeET.append("4");
                    break;
                case R.id.num5: // 5
                    alreadyExistResult();

                    beforeChangeET.append("5");
                    break;
                case R.id.num6: // 6
                    alreadyExistResult();

                    beforeChangeET.append("6");
                    break;
                case R.id.num7: // 7
                    alreadyExistResult();

                    beforeChangeET.append("7");
                    break;
                case R.id.num8: // 8
                    alreadyExistResult();

                    beforeChangeET.append("8");
                    break;
                case R.id.num9: // 9
                    alreadyExistResult();

                    beforeChangeET.append("9");
                    break;
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                // 지우기
                case R.id.erase:
                    if (beforeChangeET.getText().toString().length() != 0) { // 입력 값이 이미 있을 때
                        beforeChangeET.setText(beforeChangeET.getText().toString().substring(0, beforeChangeET.getText().toString().length() - 1));
                        afterChageET.setText("");
                    }
                    break;

                case R.id.eraseAll:
                    beforeChangeET.setText("");
                    afterChageET.setText("");
                    break;

                // 점
                case R.id.dot:
                    if (beforeChangeET.getText().toString().length() != 0) { // 입력 값이 이미 있을 때
                        if (!checkOperator(beforeChangeET.getText().toString()) && !beforeChangeET.getText().toString().endsWith(".") && !checkBrace(beforeChangeET.getText().toString())) {
                            String[] inputSplit = beforeChangeET.getText().toString().split("(?<=[(-+*/)])|(?=[(-+*/)])");
                            for (int i = 0; i < inputSplit.length; i++) {
                                if (!inputSplit[i].equals("+") && !inputSplit[i].equals("-") && !inputSplit[i].equals("*") && !inputSplit[i].equals("/") && !inputSplit[i].equals("(") && !inputSplit[i].equals(")")) {
                                    if (!inputSplit[i].contains(".")) {
                                        beforeChangeET.append(".");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;

                case R.id.equal:
                    if(beforeChangeET.getText().toString().length() != 0) {
                        try {
                            start();
                            setExp();
                            DecimalFormat df = new DecimalFormat("#,###.######");
                            String temp = df.format(value * Double.parseDouble(beforeChangeET.getText().toString()));
                            afterChageET.setText(temp+"(" + exp + ")");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        private void setExp() {
            if(name.equals("중국")) exp = "위안";
            else if(name.equals("일본")) exp = "엔";
            else if(name.equals("인도")) exp = "루피";
            else if (name.equals("싱가포르")) exp = "달러";
            else if(name.equals("영국")) exp = "파운드";
            else if(name.equals("아일랜드")) exp = "유로";
            else if(name.equals("프랑스")) exp = "유로";
            else if(name.equals("독일")) exp = "유로";
            else if(name.equals("네덜란드")) exp = "유로";
            else if(name.equals("이탈리아")) exp = "유로";
            else if (name.equals("스페인")) exp = "유로";
            else if(name.equals("덴마크")) exp = "크로네";
            else if(name.equals("노르웨이")) exp = "크로네";
            else if(name.equals("스웨덴")) exp = "크로나";
            else if(name.equals("스위스")) exp = "프랑";
            else if(name.equals("오스트리아")) exp = "유로";
            else if(name.equals("미국")) exp = "달러";
            else if(name.equals("멕시코")) exp = "패소";
            else if(name.equals("캐나다")) exp = "달러";
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
            if (afterChageET.getText().toString().length() != 0) { // 결과 값이 이미 있을 때
                beforeChangeET.setText("");
                afterChageET.setText("");
            }
        }
    }

    public void start() {
        try {
            String temp = "";

            URL url = new URL("http://www.floatrates.com/daily/krw.xml");
            URLConnection connection = url.openConnection();
            Document doc = parseXML(connection.getInputStream());

            NodeList descNodes = doc.getElementsByTagName("item");
            for (int i = 0; i < descNodes.getLength(); i++) {
                for (Node node = descNodes.item(i).getFirstChild(); node != null; node = node.getNextSibling()) {
                    if (node.getNodeName().equals("title")) {
                        temp = node.getTextContent();
                    } else if (node.getNodeName().equals("description")) {
                        if (temp.contains(code)) {
                            splitString = node.getTextContent().split("=");
                            char[] change = splitString[1].trim().toCharArray();
                            for (int j = 0; j < change.length; j++) {
                                if (Character.isDigit(change[j]))
                                    count = j;
                            }
                            value = Double.parseDouble(splitString[1].trim().substring(0, count + 1));
                            System.out.println("value : " + value);
                            break;
                        }
                    }
                }
            }
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Document parseXML(InputStream stream) throws Exception{

        DocumentBuilderFactory objDocumentBuilderFactory = null;
        DocumentBuilder objDocumentBuilder = null;
        Document doc = null;

        try{

            objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();

            doc = objDocumentBuilder.parse(stream);

        }catch(Exception ex){
            throw ex;
        }

        return doc;
    }
}
