package com.example.nam1102.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        text=(TextView)findViewById(R.id.mytext);

    }

    public void saveinfo(View v){
        SharedPreferences s=getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor e=s.edit();
        e.putString("username",user.getText().toString());
        e.putString("password",pass.getText().toString());
        e.apply();

        Toast.makeText(this,"Saved ",Toast.LENGTH_LONG).show();
    }

    public void displayinfo(View v) {
        SharedPreferences s = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        String name=s.getString("username","");
        String pw=s.getString("password","");

        text.setText(name+" "+pw);
    }
}
