package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sharedpref extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedpref);

        SharedPreferences sp=getSharedPreferences("my_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();


        editor.putString("name","savan");
        editor.putInt("id",44);
        editor.commit();


        //Insert Update Delete View program

        EditText val=findViewById(R.id.txtval);
        EditText key=findViewById(R.id.txtkey);
        Button ins=findViewById(R.id.btninsert);
        Button cl=findViewById(R.id.btnclear);
        Button show=findViewById(R.id.btnview);
        Button del=findViewById(R.id.btndelete);


        //insert

        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ky=key.getText().toString();
                String vl=val.getText().toString();
                editor.putString(ky,vl);
                editor.commit();
            }
        });


        //clear

        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.clear();
                editor.commit();
            }
        });


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ky=key.getText().toString();
                String vl=sp.getString(ky,null); //sp is used to retrive data NOT EDITOR
                val.setText(vl);
                editor.commit();

            }
        });


        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ky=key.getText().toString();
                editor.remove(ky);
                editor.commit();

            }
        });


    }
}