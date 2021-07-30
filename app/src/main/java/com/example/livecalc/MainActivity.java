package com.example.livecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText("");
                result.setText("");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                str = str.substring(0, str.length()-1);
                equation.setText(str);

                //result er kaj ase
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"(");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+")");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"0");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"1");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"2");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"3");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"4");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"5");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"6");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"7");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"8");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"9");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"0");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"÷");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"×");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"−");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) equation.setText(str+"+");
                else Toast.makeText(getApplicationContext(),"Max Limit Executed",Toast.LENGTH_SHORT).show();

                //result er kaj ase
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation.setText(result.getText());
            }
        });
    }
}