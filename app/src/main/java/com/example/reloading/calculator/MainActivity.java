package com.example.reloading.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.String;
import java.lang.Double;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, clr, mult, div, eq;
    EditText et;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button5);
        b5 = (Button) findViewById(R.id.button6);
        b6 = (Button) findViewById(R.id.button7);
        b7 = (Button) findViewById(R.id.button9);
        b8 = (Button) findViewById(R.id.button10);
        b9 = (Button) findViewById(R.id.button11);
        b0 = (Button) findViewById(R.id.button13);
        add = (Button) findViewById(R.id.button4);
        sub = (Button) findViewById(R.id.button8);
        mult = (Button) findViewById(R.id.button12);
        div = (Button) findViewById(R.id.button16);
        clr = (Button) findViewById(R.id.button15);
        eq = (Button) findViewById(R.id.button14);
        et = (EditText) findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "0");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + " + ");


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + " - ");


            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + " * ");


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + " / ");


            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              calculate();

            }
            private void calculate() {
                try {

                    str = et.getText().toString();
                    String[] str_ar = str.split(" ");
                    int len = str_ar.length;
                    /*Double[] ar = new Double[len];
                    String [] arr = new String[len-2];
                    for (int i = 0; i < len; i++) {
                        if (str_ar[i].equals('+')) {
                            arr[j++]= str_ar[i] ;
                        }
                        else
                        {
                            ar[i] = Double.parseDouble(str_ar[i]);
                        }

                    }*/

                    for (int i = 0; i < len; i++) {
                        if (str_ar[i].equals("+")) {
                                double d ;
                           d=Double.parseDouble(str_ar[i - 1])+Double.parseDouble(str_ar[i + 1]);
                            str_ar[i-1]=Double.toString(d);
                            while (i < len - 2) {
                               str_ar[i] = str_ar[i + 2];


                            }
                        } else if (str_ar[i].equals("-")) {

                            double d ;
                            d=Double.parseDouble(str_ar[i - 1])-Double.parseDouble(str_ar[i + 1]);
                            str_ar[i-1]=Double.toString(d);

                            while (i < len - 2) {
                                str_ar[i] = str_ar[i + 2];

                            }

                        } else if (str_ar[i].equals("*")){
                            double d ;
                            d=Double.parseDouble(str_ar[i - 1])*Double.parseDouble(str_ar[i + 1]);
                            str_ar[i-1]=Double.toString(d);
                            //str_ar[i - 1] *= str_ar[i + 1];
                            while (i < len - 2) {
                                str_ar[i] = str_ar[i + 2];

                            }

                        } else if (str_ar[i].equals("/")) {
                            double d ;
                            d=Double.parseDouble(str_ar[i - 1])/Double.parseDouble(str_ar[i + 1]);
                            str_ar[i-1]=Double.toString(d);
                            //ar[i - 1] /= ar[i + 1];
                            while (i < len - 2) {
                                str_ar[i] = str_ar[i + 2];

                            }

                        }
                    }
                   ;
                    et.setText(str_ar[0]);

                }
                catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this,"Not handled ",Toast.LENGTH_LONG).show();

                }
            }

            });
        }
    }

