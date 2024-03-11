package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        ImageView disp =findViewById(R.id.disp);
        ImageView img1 =findViewById(R.id.iV2);
        ImageView img2 =findViewById(R.id.iV3);
        ImageView img3 =findViewById(R.id.iV4);
        ImageView img4 =findViewById(R.id.iV5);
        ImageView img5 =findViewById(R.id.iV6);


        // 1 > With Help Of Switch Case
//
//        View.OnClickListener common=new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch (view.getId()){
//                    case R.id.iV2:
//                        Drawable img=img1.getDrawable();
//                        disp.setImageDrawable(img);
//                    case R.id.iV3:
//                        Drawable img=img2.getDrawable();
//                        disp.setImageDrawable(img);
//                    case R.id.iV4:
//
//
//                }
//            }
//        };
//        img1.setOnClickListener(common);

// 2 > With The Help Of Single LIstner

//        View.OnClickListener common=




        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable img=img1.getDrawable();
                disp.setImageDrawable(img);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable img=img2.getDrawable();
                disp.setImageDrawable(img);
            }
        });


        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable img=img3.getDrawable();
                disp.setImageDrawable(img);
            }
        });


        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable img=img4.getDrawable();
                disp.setImageDrawable(img);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable img=img5.getDrawable();
                disp.setImageDrawable(img);
            }
        });






    }
}