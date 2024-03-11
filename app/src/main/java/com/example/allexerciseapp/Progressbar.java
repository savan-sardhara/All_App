package com.example.allexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class Progressbar extends AppCompatActivity {


    private int progressStatus = 0;
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);

       ProgressBar progressBar =findViewById(R.id.progressBar);

        // Create a new thread to update progress
        new Thread(new Runnable() {
            public void run() {
                // Run a loop to increment progress
                for (int i = 0; i <= 100; i++) {
                    // Update the progress value
                    progressStatus = i;
                    // Post the progress value to the UI thread
                    handler.post(new Runnable() {
                        public void run() {
                            // Update the progress bar
                            progressBar.setProgress(progressStatus);
                        }
                    });
                    try {
                        // Sleep for a short duration to simulate processing
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }
}