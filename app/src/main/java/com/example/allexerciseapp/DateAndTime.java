package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class DateAndTime extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time);

        DatePicker dp=findViewById(R.id.dp);
        TimePicker tp=findViewById(R.id.tp);
        TextView ts=findViewById(R.id.timeshow);
        TextView ds=findViewById(R.id.dateshow);

        dp.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                int month=i1+1;
                int year=i ;
                int date=i2;
                ds.setText("date : "+date+"/"+month+"/"+year);

            }
        });


        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                int hour=i;
                int min=i1;
                ts.setText("Time :"+hour+":"+min);
            }
        });


    }
}