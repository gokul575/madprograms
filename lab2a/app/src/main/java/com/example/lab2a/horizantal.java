package com.example.lab2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class horizantal extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b1=findViewById(R.id.btnStartService);
        b2=findViewById(R.id.btnPauseService);

        b3=findViewById(R.id.btnStopService);


    }
}