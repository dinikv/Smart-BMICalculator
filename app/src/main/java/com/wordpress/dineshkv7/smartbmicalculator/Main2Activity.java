package com.wordpress.dineshkv7.smartbmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void calculatebmi(View view)
    {
        EditText weight1 = (EditText) findViewById(R.id.editText1);
        EditText height1 = (EditText) findViewById(R.id.editText2);

        Button bt = (Button) findViewById(R.id.button2);

        TextView tv1 = (TextView) findViewById(R.id.bmi);
        TextView tv2 = (TextView) findViewById(R.id.result);

        double height =0,weight=0,bmi=0;
        String resultmsg = "";

        weight = Double.parseDouble(weight1.getText().toString());
        height = Double.parseDouble(height1.getText().toString());

        height = height/100;
        bmi = weight/(height*height);

        tv1.setText(String.valueOf(bmi));


        if(bmi<18.5)
        {
            resultmsg = "Under Weight";
        }
        else if(bmi>18.5 && bmi<25)
        {
            resultmsg = "Normal";
        }
        else
        {
            resultmsg = "Over Weight";
        }

        tv2.setText(resultmsg);
    }
}
