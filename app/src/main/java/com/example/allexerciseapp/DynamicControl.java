package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DynamicControl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_control);

        LinearLayout ln=findViewById(R.id.lyDynamicControl);
        TextView tv=new TextView(this);
        tv.setText("Savan Sardhara");
        tv.setTextSize(30);
        tv.setTextColor(getResources().getColor(R.color.black));
        ln.addView(tv);


    }
}