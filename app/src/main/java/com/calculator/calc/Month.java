package com.calculator.calc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockFragment;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Month extends SherlockFragment {

    View v;
    DatePicker dp;
    EditText afterDay;
    int year, month, day, nYear, nMonth, nDay;
    String start, end;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.month, container, false);

        dp = (DatePicker) v.findViewById(R.id.datePicker);
        afterDay = (EditText) v.findViewById(R.id.afterDay);
        v.findViewById(R.id.go).setOnClickListener(new ButtonListener());

        return v;
    }

    class ButtonListener implements View.OnClickListener {

        public void onClick(View v) {
            switch ( v.getId() ) {
                case R.id.go:
                    Calendar calendar = new GregorianCalendar(Locale.KOREA);
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

                    nYear = calendar.get(Calendar.YEAR);
                    nMonth = calendar.get(Calendar.MONTH) + 1;
                    nDay = calendar.get(Calendar.DAY_OF_MONTH);
                    start = nYear + "-" + nMonth + "-" + nDay;

                    year = dp.getYear();
                    month = dp.getMonth() + 1;
                    day = dp.getDayOfMonth();
                    end = year + "-" + month + "-" + day;

                    try {
                        Date beginDate = formatter.parse(start);
                        Date endDate = formatter.parse(end);

                        long diff = endDate.getTime() - beginDate.getTime();
                        long diffDays = diff / (24 * 60 * 60 * 1000);

                        DecimalFormat df = new DecimalFormat("#,###.######");

                        if(diffDays == 0) {
                            String temp = df.format(diffDays);
                            afterDay.setText(temp+"일");
                        }
                        else if(diffDays > 0) {
                            String temp = df.format(diffDays);
                            afterDay.setText(temp+"일 후");
                        }
                        else if(diffDays < 0) {
                            diffDays = -diffDays;
                            String temp = df.format(diffDays);
                            afterDay.setText(temp+"일 째");
                        }
                        else {
                            String temp = df.format(diffDays);
                            afterDay.setText(temp+"일");
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
            }
        }
    }
}
