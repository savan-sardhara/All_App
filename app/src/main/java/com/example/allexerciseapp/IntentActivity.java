package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Button b1=findViewById(R.id.btnweb);
        Button b2=findViewById(R.id.btnnextpage);
        EditText e=findViewById(R.id.textname);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://atmiyauni.ac.in/"));
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t=e.getText().toString();
                Intent i=new Intent(getApplicationContext(),ForIntenActivity.class);
                i.putExtra("name",t);
                startActivity(i);

            }
        });


    }
}