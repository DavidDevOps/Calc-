package com.calculator.calc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

public class Hour extends SherlockFragment {

    View v;
    ListView listView;
    TimeZone tz;
    Date date = new Date();
    DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분(a)");
    ArrayAdapter adapter;
    ArrayList<String> data = new ArrayList<String>();

    public Hour() {
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.hour, container, false);

        listView = (ListView) v.findViewById(R.id.listView);
        v.findViewById(R.id.plus).setOnClickListener(new ButtonListener());

        return v;
    }

    final CharSequence[] countryItems = {"한국", "중국", "일본", "인도", "싱가포르", "영국", "아일랜드", "프랑스", "독일", "네덜란드",
            "이탈리아", "스페인", "덴마크", "노르웨이", "스웨덴", "미국", "멕시코", "캐나다"};

    class ButtonListener implements View.OnClickListener {

        public void onClick(View vs) {
            switch ( vs.getId() ) {
                case R.id.plus:
                    new AlertDialog.Builder(v.getContext())
                            .setTitle("추가하기")
                            .setSingleChoiceItems(countryItems, -1, new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface dialog, int which) {
                                    if (countryItems[which].equals("한국")) {
                                        tz = TimeZone.getTimeZone("Asia/Seoul");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("중국")) {
                                        tz = TimeZone.getTimeZone("Asia/Shanghai");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("일본")) {
                                        tz = TimeZone.getTimeZone("Asia/Tokyo");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("인도")) {
                                        tz = TimeZone.getTimeZone("Asia/Jakarta");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("싱가포르")) {
                                        tz = TimeZone.getTimeZone("Asia/Singapore");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("영국")) {
                                        tz = TimeZone.getTimeZone("Europe/London");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("아일랜드")) {
                                        tz = TimeZone.getTimeZone("Europe/Dublin");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("프랑스")) {
                                        tz = TimeZone.getTimeZone("Europe/Paris");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("독일")) {
                                        tz = TimeZone.getTimeZone("Europe/Berlin");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("네덜란드")) {
                                        tz = TimeZone.getTimeZone("Europe/Amsterdam");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("이탈리아")) {
                                        tz = TimeZone.getTimeZone("Europe/Rome");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("스페인")) {
                                        tz = TimeZone.getTimeZone("Europe/Madrid");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("덴마크")) {
                                        tz = TimeZone.getTimeZone("Europe/Copenhagen");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("노르웨이")) {
                                        tz = TimeZone.getTimeZone("Europe/Oslo");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    } else if (countryItems[which].equals("스웨덴")) {
                                        tz = TimeZone.getTimeZone("Europe/Stockholm");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    }
                                    else if (countryItems[which].equals("미국")) {
                                        tz = TimeZone.getTimeZone("America/Los_Angeles");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    }
                                    else if (countryItems[which].equals("멕시코")) {
                                        tz = TimeZone.getTimeZone("America/Mexico_City");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    }
                                    else if (countryItems[which].equals("캐나다")) {
                                        tz = TimeZone.getTimeZone("Canada/Saskatchewan");
                                        df.setTimeZone(tz);

                                        data.add(countryItems[which] + df.format(date));
                                        adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, data);
                                    }
                                    listView.setAdapter(adapter);
                                    dialog.cancel();
                                }
                            }).show();
                    break;
            }
        }
    }
}
