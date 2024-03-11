package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bi=findViewById(R.id.intentbtn);
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),IntentActivity.class);
                startActivity(i);
            }
        });



        Button btsp=findViewById(R.id.btnspinner);
        btsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),spinner.class);
                startActivity(i);
            }
        });

        Button btndt =findViewById(R.id.btndatetime);
        btndt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),DateAndTime.class);
                startActivity(i);
            }
        });

        Button btndialogintent=findViewById(R.id.btndialogintent);

        btndialogintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AlertBox.class);
                startActivity(i);
            }
        });

        Button btnRelatPrac =findViewById(R.id.btnrelativeactivity);

        btnRelatPrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), RalativeLayoutPractice.class);
                startActivity(i);
            }
        });

        Button btntogact=findViewById(R.id.btnToggleActivity);

        btntogact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ToggleButtonToast.class);
                startActivity(i);
            }
        });

        Button btnsharedpref=findViewById(R.id.btnsharedprefact);

        btnsharedpref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),sharedpref.class);
                startActivity(i);
            }
        });

        Button btndynamiccontrol = findViewById(R.id.btndynamic);

        btndynamiccontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),DynamicControl.class);
                startActivity(i);
            }
        });


        Button btngal=findViewById(R.id.btngallery);

        btngal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Gallery.class);
                startActivity(i);
            }
        });

        Button btnch=findViewById(R.id.btnchb);

        btnch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Checkbox.class);
                startActivity(i);
            }
        });

        Button btnr=findViewById(R.id.btnr);

        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Radiobutton.class);
                startActivity(i);
            }
        });

        Button btnat=findViewById(R.id.btnAutocomplete);

        btnat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AutocompletTextview.class);
                startActivity(i);
            }
        });

        Button btnprog=findViewById(R.id.btnProgressbar);

        btnprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Progressbar.class);
                startActivity(i);
            }
        });

        Button btnal=findViewById(R.id.btnLifeCycle);

        btnal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ActivityCycle.class);
                startActivity(i);
            }
        });

        Button btnfm=findViewById(R.id.btnFrameLay);

        btnfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Framelayout.class);
                startActivity(i);
            }
        });

        Button btntab=findViewById(R.id.btnTablelay);

        btntab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Tablelayout.class);
                startActivity(i);
            }
        });

        Button btnxs=findViewById(R.id.btnXMlshape);

        btnxs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),XMLShape.class);
                startActivity(i);
            }
        });

    }
}