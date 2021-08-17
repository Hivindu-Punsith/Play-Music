package com.example.additionallabsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnStart = findViewById(R.id.buttonStart);
        btnStop = findViewById(R.id.buttonStop);

        btnStart.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startService(new Intent(MainActivity.this, MyService.class));
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                stopService(new Intent(MainActivity.this, MyService.class));
            }
        });

    }
}