package com.example.nam1102.mydataapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText myInput;
    TextView myText;
    Mydbhandler dbhandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInput=(EditText) findViewById(R.id.myinput);
        myText=(TextView)findViewById(R.id.mytext);

        dbhandler=new Mydbhandler(this,null,null,1);
        printdatabase();


    }
    public void printdatabase(){
        String dbstring=dbhandler.dbtostring();
        myText.setText(dbstring);
        myInput.setText("");

    }
    public void onadd(View v){
        product p=new product(myInput.getText().toString());
        dbhandler.addproduct(p);
        printdatabase();
    }
    public void ondelete(View v){
        String mytext=myInput.getText().toString();
        dbhandler.deleteproduct(mytext);
        printdatabase();
    }
}
