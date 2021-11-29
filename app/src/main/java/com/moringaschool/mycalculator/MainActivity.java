package com.moringaschool.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPoint, buttonC, button0,
    buttonadd, buttonsub, buttoneql, buttonmul, buttondiv;
    TextView textView_result;

    float valueOne, valueTwo;
    boolean addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttoneql = (Button) findViewById(R.id.buttoneql);
        textView_result = (TextView) findViewById(R.id.textView_result);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("9");
            }
        });
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("1");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText(".");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("");
            }
        });

        // OnClickListeners for the buttons
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_result == null){
                    textView_result.setText("");
                } else {
                    valueOne = Float.parseFloat(textView_result.getText() + "");
                    addition = true;
                    textView_result.setText(null);
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_result == null){
                    textView_result.setText(null);
                } else {
                    valueOne = Float.parseFloat(textView_result.getText() + "");
                    subtraction = true;
                    textView_result.setText(null);
                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_result == null){
                    textView_result.setText(null);
                } else {
                    valueOne = Float.parseFloat(textView_result.getText() + "");
                    division = true;
                    textView_result.setText(null);
                }
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView_result == null){
                    textView_result.setText(null);
                } else {
                    valueOne = Float.parseFloat(textView_result.getText() + "");
                    multiplication = true;
                    textView_result.setText(null);
                }
            }
        });

        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueTwo = Float.parseFloat(textView_result.getText() + "");

                if(addition == true){
                    textView_result.setText(valueOne + valueTwo + "");
                    addition = false;
                }

                if(subtraction == true){
                    textView_result.setText(valueOne - valueTwo + "");
                    subtraction = false;
                }

                if(multiplication == true){
                    textView_result.setText(valueOne * valueTwo + "");
                    multiplication = false;
                }

                if(division == true){
                    textView_result.setText(valueOne / valueTwo + "");
                    division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_result.setText("");
            }
        });
    }
}