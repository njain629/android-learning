package com.example.nam1102.intentapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle firstdata=getIntent().getExtras();
        if (firstdata==null){
            return;
        }
        String firstmsg=firstdata.getString("firstmessgae");

        final TextView secondtext=(TextView)findViewById(R.id.secondactivity);
        secondtext.setText(firstmsg);
    }

}
