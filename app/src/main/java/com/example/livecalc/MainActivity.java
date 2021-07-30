package com.example.livecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView equation;
    public TextView result;

    public Button ac;
    public Button c;
    public Button b1;
    public Button b2;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button divide;
    public Button four;
    public Button five;
    public Button six;
    public Button multiply;
    public Button one;
    public Button two;
    public Button three;
    public Button sub;
    public Button dot;
    public Button zero;
    public Button equal;
    public Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        equation = findViewById(R.id.equation);
        result = findViewById(R.id.result);

        ac = findViewById(R.id.ac);
        c = findViewById(R.id.c);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        divide = findViewById(R.id.divide);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        multiply = findViewById(R.id.multiply);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        sub = findViewById(R.id.sub);
        dot = findViewById(R.id.dot);
        zero = findViewById(R.id.zero);
        equal = findViewById(R.id.equal);
        add = findViewById(R.id.add);
    }

}