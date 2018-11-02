package com.example.dharani.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class EventActitvitty extends AppCompatActivity {
    int month;
    int year;
    Calendar calendar = Calendar.getInstance();
    Calendar calendarMy = Calendar.getInstance();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_actitvitty);
        final TextView  myCalender=(TextView)findViewById(R.id.myCalendar);
        String name = calendarMy.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        myCalender.setText(name);
        ImageButton nextMonth=(ImageButton)findViewById(R.id.nextMonth);
        ImageButton prevMonth=(ImageButton)findViewById(R.id.prevMonth);
        ListView lv=(ListView)findViewById(R.id.ls);
        ArrayList<String> Events=new ArrayList<String>();
        Events.add("Annual Meeting");
        Events.add("Working Meet");
        Events.add("Opinion Meet");
        Events.add("Suggestion Day");
        Events.add("Festive Gathering");
        Events.add("Monthly Trip");

        ArrayAdapter<String> la=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Events);
        lv.setAdapter(la);


        nextMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (month > 11) {//checking the month
                    month = 1;
                    year++;
                } else {
                    month++;
                    calendarMy.add(Calendar.MONTH, 1);
                }

                String name = calendarMy.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());

                //update current time
                myCalender.setText(name);
              //  calendarMy.set(Calendar.YEAR,year);

               // disableButton();

                //setGridCellAdapterToDate(month, year);
            }
        });

//prev arrow click to show prev month
        prevMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (month <= 1) {//checking the month
                    month = 12;
                    year--;
                } else {
                    month--;
                    calendar.add(Calendar.MONTH, -1);
                }
                String name = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());

                //update current time
                myCalender.setText(name);

                //update current time
              //  My.setText((Calendar.MONTH,month);
                //calendarMy.set(Calendar.YEAR,year);

               // disableButton();


               // setGridCellAdapterToDate(month, year);
            }
        });

    }
}
