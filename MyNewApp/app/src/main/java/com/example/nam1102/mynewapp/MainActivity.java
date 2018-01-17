package com.example.nam1102.mynewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout mylayout= new RelativeLayout(this);
        Button mybutton=new Button(this);

        mylayout.setBackgroundColor(Color.BLUE);
        mybutton.setBackgroundColor(Color.GREEN);
        mybutton.setText("Click here");

        RelativeLayout.LayoutParams buttondetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        buttondetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttondetails.addRule(RelativeLayout.CENTER_VERTICAL);

        mylayout.addView(mybutton,buttondetails);

        EditText username=new EditText(this);
        mybutton.setId(1);
        username.setId(2);

        RelativeLayout.LayoutParams userdetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        userdetails.addRule(RelativeLayout.ABOVE,mybutton.getId());
        userdetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        Resources r=getResources();
        int px=(int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());

        username.setWidth(px);
        userdetails.setMargins(0,0,0,50);
        mylayout.addView(username,userdetails);

        setContentView(mylayout);
    }
}
