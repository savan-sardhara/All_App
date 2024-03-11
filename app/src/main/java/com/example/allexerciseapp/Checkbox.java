package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import  android.widget.CheckBox;
import android.widget.Toast;

public class Checkbox extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        CheckBox cbRead = (CheckBox) findViewById(R.id.cbRead);
        CheckBox cbWrite = (CheckBox) findViewById(R.id.cbWrite);
        CheckBox cbSpeak =(CheckBox) findViewById(R.id.cbSpeak);
        Button btnc=findViewById(R.id.btnchb);

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder skillsBuilder = new StringBuilder();
                if (cbRead.isChecked()) {
                    skillsBuilder.append("Read, ");
                }
                if (cbWrite.isChecked()) {
                    skillsBuilder.append("Write, ");
                }
                if (cbSpeak.isChecked()) {
                    skillsBuilder.append("Speak");
                }
                String skills = skillsBuilder.toString().trim();
                Toast.makeText(Checkbox.this, skills, Toast.LENGTH_SHORT).show();
            }
        });





    }
}