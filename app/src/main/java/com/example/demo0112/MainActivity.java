package com.example.demo0112;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    private Button btn1,btn2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        textView = findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("南台科大");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("林子勛");
            }
        });
        btn1.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View view) {
        textView.setText("請按下按鈕!");
        return true;
    }
});
        btn2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView.setText("請按下按鈕!");
                return true;
            }
        });

    }
}