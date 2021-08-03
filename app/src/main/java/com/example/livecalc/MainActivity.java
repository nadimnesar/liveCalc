package com.example.livecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    public EditText equation;
    public TextView result;

    public Button mod;
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
    public Button pow;
    public Button add;

    public double evaluate(String str) {
        str = str.replace('÷','/').replace('×','*').replace('%', '#');
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

        equation.setShowSoftInputOnFocus(false);

        mod = findViewById(R.id.mod);
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
        pow = findViewById(R.id.pow);
        add = findViewById(R.id.add);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equation.getText().toString().length() == 0) Toast.makeText(getApplicationContext(),"Already Empty!",Toast.LENGTH_SHORT).show();
                else {
                    String str = equation.getText().toString();
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);
                    leftstr = leftstr.substring(0, leftstr.length() - 1);
                    str = leftstr + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos-1);
                    if(str.length() == 0) result.setText("");
                    else result.setText(String.valueOf(evaluate(str)));
                }
            }
        });

        c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(equation.getText().toString().length() == 0) Toast.makeText(getApplicationContext(),"Already Empty!",Toast.LENGTH_SHORT).show();
                else {
                    equation.setText("");
                    result.setText("");
                }
                return true;
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);
                    str = leftstr+"("+rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);
                    str = leftstr+")"+rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);
                    str = leftstr + "0" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "1" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "2" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "3" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "4" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "5" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "6" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "7" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "8" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "9" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "." + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "÷" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "×" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "-" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
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
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "+" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "^" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() < 70) {
                    int curpos = equation.getSelectionStart();
                    String leftstr = str.substring(0, curpos);
                    String rightstr = str.substring(curpos);

                    str = leftstr + "%" + rightstr;
                    equation.setText(str);
                    equation.setSelection(curpos+1);
                }
                else Toast.makeText(getApplicationContext(),"Max Limit Executed!",Toast.LENGTH_SHORT).show();

                if(str.length() == 0) result.setText("");
                else result.setText(String.valueOf(evaluate(str)));
            }
        });
    }
}