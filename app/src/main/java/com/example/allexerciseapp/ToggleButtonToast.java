package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        ToggleButton tg=findViewById(R.id.toggleButtontoast);

        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tg.isChecked()){
                    Toast.makeText(ToggleButtonToast.this, "OOONNNNNN", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ToggleButtonToast.this, "OooFFFFFFFFF", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}