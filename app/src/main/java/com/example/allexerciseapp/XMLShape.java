package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class XMLShape extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlshape);

        ImageView iv=findViewById(R.id.i1);

        iv.setImageResource(R.drawable.sqare);

    }
}