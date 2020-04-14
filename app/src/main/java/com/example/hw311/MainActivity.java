package com.example.hw311;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultTxt;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn0;
    Button divide;
    Button multiply;
    Button subtract;
    Button equal;
    Button comma;
    Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        btn7 = findViewById(R.id.number7);
        btn8 = findViewById(R.id.number8);
        btn9 = findViewById(R.id.number9);
        btn4 = findViewById(R.id.number4);
        btn5 = findViewById(R.id.number5);
        btn6 = findViewById(R.id.number6);
        btn1 = findViewById(R.id.number1);
        btn2 = findViewById(R.id.number2);
        btn3 = findViewById(R.id.number3);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        subtract = findViewById(R.id.subtract);
        equal = findViewById(R.id.equal);
        comma = findViewById(R.id.comma);
        btn0 = findViewById(R.id.number0);
        sum = findViewById(R.id.sum);
        resultTxt = findViewById(R.id.resultField);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number7)));
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.sum)));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number8)));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number9)));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number4)));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number5)));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number6)));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number1)));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number2)));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number3)));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.divide)));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.multiply)));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.subtract)));
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.equal)));
            }
        });
        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.comma)));
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTxt.setText(String.format("%s%s", resultTxt.getText().toString(), getString(R.string.number0)));
            }
        });
    }
}
