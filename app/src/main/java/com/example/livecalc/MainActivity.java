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

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                return x;
            }
        }.parse();
    }

    public boolean check(String str){
        String restr = str;
        boolean res = true;
        while(true){
            int idx = -1;
            for(int i = 0; i < restr.length(); i++){
                if(restr.charAt(i) == '(') idx = i;
            }

            if(idx == -1) break;

            boolean flag = false;

            for(int i = idx+1; i < restr.length(); i++){
                if(restr.charAt(i) == ')'){
                    restr = restr.substring(0, idx) + restr.substring(i+1, restr.length());
                    flag = true;
                    break;
                }
            }
            if(!flag){
                res = false;
                break;
            }
        }

        for(int i = 0; i < restr.length(); i++){
            if(restr.charAt(i) == ')') return false;
        }

        if(!res) return false;

        if(str.charAt(0) == '+' || str.charAt(0) == '-' || str.charAt(0) == '*' || str.charAt(0) == '/') return false;
        if(str.charAt(str.length()-1) == '+' || str.charAt(str.length()-1) == '-' || str.charAt(str.length()-1) == '*' || str.charAt(str.length()-1) == '/') return false;

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == '+' && str.charAt(i-1) == '+') return false;
            if(str.charAt(i) == '-' && str.charAt(i-1) == '-') return false;
            if(str.charAt(i) == '*' && str.charAt(i-1) == '*') return false;
            if(str.charAt(i) == '/' && str.charAt(i-1) == '/') return false;
        }

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == '(' && str.charAt(i-1) == ')') return false;
        }
        return res;
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
                    else{
                        str = str.replace('÷','/').replace('×','*');
                        if(check(str)) result.setText(String.valueOf(eval(str)));
                        else result.setText("Syntax Error!");
                    }
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
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

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = equation.getText().toString();

                str = str.replace('÷','/').replace('×','*');
                if(check(str)) result.setText(String.valueOf(eval(str)));
                else result.setText("Syntax Error!");
            }
        });
    }
}