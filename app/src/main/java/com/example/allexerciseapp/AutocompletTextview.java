package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutocompletTextview extends AppCompatActivity {

    private String[] cities = {"Rajkot", "Morbi", "Surat", "vadodara", "Ahemdabad", "Junagadh"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplet_textview);


        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, cities);
        autoCompleteTextView.setAdapter(adapter);


    }
}