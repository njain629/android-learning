package com.example.nam1102.bmicalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
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
    public void calcbmi(View v){

        double h=0,w=0,bmi=0;
        String msg="";
        EditText e1=(EditText)findViewById(R.id.editText1);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView1);
        TextView t2=(TextView)findViewById(R.id.textView2);
        Button b=(Button)findViewById(R.id.button2);
        w=Double.parseDouble(e1.getText().toString());
        h=Double.parseDouble(e2.getText().toString());

        bmi=w/(h*h);
        t1.setText(String.valueOf(bmi));
        if (bmi<18.5){
            msg="underweight";
        }else if (bmi>18.5 && bmi<25){
            msg="Normal";
        }else{
            msg="overwieght";
        }
        t2.setText(msg);


    }

}
