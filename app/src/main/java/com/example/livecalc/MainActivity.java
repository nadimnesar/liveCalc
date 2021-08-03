package com.example.livecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.mariuszgromada.math.mxparser.*;

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

    public double evaluate(String str) {
        str = str.replace('÷','/').replace('×','*');
        Expression exp = new Expression(str);
        return exp.calculate();
    }

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
                if(equation.getText().toString().length() == 0) Toast.makeText(getApplicationContext(),"Already Empty!",Toast.LENGTH_SHORT).show();
                else {
                    equation.setText("");
                    result.setText("");
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equation.getText().toString().length() == 0) Toast.makeText(getApplicationContext(),"Already Empty!",Toast.LENGTH_SHORT).show();
                else {
                    String str = equation.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    equation.setText(str);

                    if(str.length() == 0) result.setText("");
                    else result.setText(String.valueOf(evaluate(str)));
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "(";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + ")";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "0";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "1";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "2";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "3";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "4";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "5";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "6";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "7";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "8";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "9";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "0";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + ".";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "÷";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "×";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "-";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    str = str + "+";
                    equation.setText(str);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                if(str.length() == 0) Toast.makeText(getApplicationContext(),"Empty!",Toast.LENGTH_SHORT).show();
                else if(result.getText().toString() == "Syntax Error!") Toast.makeText(getApplicationContext(),"Syntax Error!",Toast.LENGTH_SHORT).show();
                else equation.setText(result.getText());
            }
        });
    }
}