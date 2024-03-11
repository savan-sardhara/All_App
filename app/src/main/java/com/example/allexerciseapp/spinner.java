package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class spinner extends AppCompatActivity {

    //array for Local Use
   // String city[]={"surat","una","rajkot","gondal","kolithad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Spinner spn=findViewById(R.id.spinner);

       //Using The Array "city" in The Local File Which is above
        // ArrayAdapter<String> adpt=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,city);


        //using the XML file array "city" location res>value>string.xml
        //Why cause we can access it globally
        ArrayAdapter<CharSequence> adpt=ArrayAdapter.createFromResource(this,R.array.city, android.R.layout.simple_spinner_item);

        adpt.setDropDownViewResource(android.R.layout.simple_list_item_multiple_choice);

        spn.setAdapter(adpt);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adptitem, View view, int pos, long id) {
                String msgitem=adptitem.getItemAtPosition(pos).toString();
                Toast.makeText(spinner.this, msgitem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}