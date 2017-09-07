package com.example.android.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String no[] = new String[2];


    int i,c,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            no[0] = "";
            c=0;m=0;
        } catch (UnsupportedOperationException e) {

                display("Error");
        }
    }

    public void clear_All(View view) {
        no[0] = "";
        display("ALL CLEAR");

    }

    public void delete(View view)
    {
        try {
            if (no[0].equals("")) {
                display("CALCULATED VALUE");return;
            } else {
                no[0] = no[0].substring(0, no[0].length() - 1);
                display(no[0]);
            }
            for (i = 0; i < no[1].length(); i++) {
                if (no[1].charAt(i) == '/' || no[1].charAt(i) == '-' || no[1].charAt(i) == '*' || no[1].charAt(i) == '+') {
                    no[1] = no[1].substring(0, no[1].length() - 1);
                }
            }
        }
        catch (Exception e)
        {

            display(no[0]);
        }
    }

    public void seven(View view) {

        no[0] = no[0] + "7";
        display(no[0]);

    }

    public void eight(View view) {
        no[0] = no[0] + "8";
        display(no[0]);

    }

    public void nine(View view) {
        no[0] = no[0] + "9";
        display(no[0]);

    }

    public void four(View view) {
        no[0] = no[0] + "4";
        display(no[0]);

    }

    public void five(View view) {
        no[0] = no[0] + "5";
        display(no[0]);

    }

    public void six(View view) {
        no[0] = no[0] + "6";
        display(no[0]);

    }

    public void one(View view) {
        no[0] = no[0] + "1";
        display(no[0]);

    }

    public void two(View view) {
        no[0] = no[0] + "2";
        display(no[0]);

    }

    public void three(View view) {
        no[0] = no[0] + "3";
        display(no[0]);

    }

    public void zero(View view) {
        no[0] = no[0] + "0";
        display(no[0]);

    }


    public void divide(View view) {
        no[1] = no[0];
        no[0] = no[0] + "/";

        display(no[0]);


    }

    public void multiply(View view) {
        no[1] = no[0];
        no[0] = no[0] + "*";

        display(no[0]);

    }

    public void addition(View view) {
        no[1] = no[0];
        no[0] = no[0] + "+";

        display(no[0]);

    }

    public void subtraction(View view) {
        no[1] = no[0];
        no[0] = no[0] + "-";

        display(no[0]);

    }

    public void equal(View view)
    {
        int n=0;


        try {
                c=0;m=0;
            for (i = 0; i < no[0].length(); i++)
            {

                if (no[0].charAt(i) == '/')
                {
                    c++;
                    if(no[0].charAt(i+1)==57 || no[0].charAt(i+1)<48)
                        m++;
                    no[0] = no[0].substring((i + 1), no[0].length());
                    no[0] = String.valueOf(Double.valueOf(no[1]) / Double.valueOf(no[0]));


                }
                else if (no[0].charAt(i) == '*')
                {
                    c++;
                    if(no[0].charAt(i+1)==57 || no[0].charAt(i+1)<48)
                        m++;
                    no[0] = no[0].substring((i + 1), no[0].length());
                    no[0] = String.valueOf(Double.valueOf(no[1]) * Double.valueOf(no[0]));


                }
                else if (no[0].charAt(i) == '+')
                {
                    c++;
                    if(no[0].charAt(i+1)==57 || no[0].charAt(i+1)<48)
                        m++;
                    no[0] = no[0].substring((i + 1), no[0].length());
                    no[0] = String.valueOf(Double.valueOf(no[1]) + Double.valueOf(no[0]));


                }
                else if (no[0].charAt(i) == '-')
                {
                    c++;
                    if(no[0].charAt(i+1)==57 || no[0].charAt(i+1)<48)
                        m++;
                    no[0] = no[0].substring((i + 1), no[0].length());
                    no[0] = String.valueOf(Double.valueOf(no[1]) - Double.valueOf(no[0]));


                }
                else if(no[0].charAt(i)=='.' && no[0].charAt(i+1)=='.')
                {
                    n=1;
                }
                display(no[0]);
            }
        }
        catch (Exception r)

        {
            if(c>=1 && m>=1)
                display("Error");
            else if(c>=1 && m==0)
                display("Sorry.. Please, compute 2 values at one time.");

            else if( c==0 || m>=1 ||n==1)
                display("Error");
        }

    }

    public void point(View view) {
        no[0] = no[0] + ".";
        display(no[0]);
    }

    public void display(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.answer_text_view);
        priceTextView.setText(message);
    }
}








