package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button one =findViewById(R.id.one);
       final Button two =findViewById(R.id.two);
       final Button three =findViewById(R.id.three);
       final Button four =findViewById(R.id.four);
        final TextView view=findViewById(R.id.view);
        Button five =findViewById(R.id.five);
        Button six =findViewById(R.id.six);
        Button seven =findViewById(R.id.seven);
        Button eight =findViewById(R.id.eight);
        Button nine =findViewById(R.id.nine);
        Button zero =findViewById(R.id.zero);
        Button plus =findViewById(R.id.plus);
        Button minus =findViewById(R.id.minus);
        Button mul =findViewById(R.id.mul);
        Button div =findViewById(R.id.div);
        Button equ =findViewById(R.id.equ);
        Button last =findViewById(R.id.last);
        Button back = findViewById(R.id.back);
        Button clear = findViewById(R.id.clear);


    OnClickListener btn =new OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v==one){
                view.setText(view.getText().toString()+1);
            }
            else if(v==two){
                view.setText(view.getText().toString()+2);
            }

        }
    };



        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    }

