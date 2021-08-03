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

    public TextView degrad, result;
    public EditText equation;

    public Button degree, radian, gcd, lcm, mod, sqrt;
    public Button sin, cos, tan, log, e, pi;
    public Button c, ac, pow, factorial, b1, b2;
    public Button seven, eight, nine, divide;
    public Button four, five, six, multiply;
    public Button one, two, three, sub;
    public Button dot, zero, add, equal;

    public boolean deg = true, rad = false;

    public double evaluate(String str) {
        str = str.replace('÷','/').replace('×','*');
        str = str.replaceAll("π", "pi").replaceAll("mod", "#");
        Expression exp = new Expression(str);

        if(deg) mXparser.setDegreesMode();
        else if(rad) mXparser.setRadiansMode();

        return exp.calculate();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        degrad = findViewById(R.id.degrad);
        equation = findViewById(R.id.equation);
        equation.setShowSoftInputOnFocus(false);
        result = findViewById(R.id.result);
        degree = findViewById(R.id.degree);
        radian = findViewById(R.id.radian);
        gcd = findViewById(R.id.gcd);
        lcm = findViewById(R.id.lcm);
        mod = findViewById(R.id.mod);
        sqrt = findViewById(R.id.sqrt);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        log = findViewById(R.id.log);
        e = findViewById(R.id.e);
        pi = findViewById(R.id.pi);
        c = findViewById(R.id.c);
        ac = findViewById(R.id.ac);
        pow = findViewById(R.id.pow);
        factorial = findViewById(R.id.factorial);
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

        degree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deg = true;
                rad = false;
                degrad.setText("DEGREE");

                String str = equation.getText().toString();
                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        radian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deg = false;
                rad = true;
                degrad.setText("REDIAN");

                String str = equation.getText().toString();
                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        gcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"gcd(,)"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+4);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        lcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"lcm(,)"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+4);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "mod" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+3);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"sqrt()"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+5);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"sin()"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+4);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"cos()"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+4);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"tan()"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+4);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"log(,)"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+4);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"e"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"π"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equation.getText().toString().length() == 0) Toast.makeText(getApplicationContext(),"Empty!",Toast.LENGTH_SHORT).show();
                else {
                    equation.setText("");
                    result.setText("");
                }
            }
        });
        ac.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(equation.getText().toString().length() == 0) Toast.makeText(getApplicationContext(),"Empty!",Toast.LENGTH_SHORT).show();
                else {
                    equation.setText("");
                    result.setText("");
                }
                return true;
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equation.getText().toString().length() == 0) Toast.makeText(getApplicationContext(),"Empty!",Toast.LENGTH_SHORT).show();
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
                    else{
                        str = String.valueOf(evaluate(str));
                        if(str == "NaN") result.setText("");
                        else result.setText(str);
                    }
                }
            }
        });
        c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(equation.getText().toString().length() == 0) Toast.makeText(getApplicationContext(),"Empty!",Toast.LENGTH_SHORT).show();
                else {
                    equation.setText("");
                    result.setText("");
                }
                return true;
            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "^" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"!"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+"("+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr+")"+rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "0" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);


                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "1" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "2" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "3" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "4" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "5" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "6" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "7" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "8" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "9" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "." + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "÷" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "×" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "-" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                int curpos = equation.getSelectionStart();
                String leftstr = str.substring(0, curpos);
                String rightstr = str.substring(curpos);

                str = leftstr + "+" + rightstr;
                equation.setText(str);
                equation.setSelection(curpos+1);

                str = String.valueOf(evaluate(str));
                if(str == "NaN") result.setText("");
                else result.setText(str);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();
                if(str.length() == 0) Toast.makeText(getApplicationContext(),"Empty!",Toast.LENGTH_SHORT).show();
                else if(result.getText().toString().length() == 0) Toast.makeText(getApplicationContext(),"Syntax Error!",Toast.LENGTH_SHORT).show();
                else {
                    equation.setText(result.getText().toString());
                    equation.setSelection(result.getText().toString().length());
                }
            }
        });
    }
}