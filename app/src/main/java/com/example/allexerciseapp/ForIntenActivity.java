package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ForIntenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_inten);

        TextView t=findViewById(R.id.greet);
        Intent i= getIntent();
        String name=i.getStringExtra("name");
        t.setText("Hello,"+name);

    }
}