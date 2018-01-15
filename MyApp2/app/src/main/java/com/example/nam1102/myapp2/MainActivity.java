package com.example.nam1102.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton=(Button) findViewById(R.id.mybutton);

        myButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void  onClick(View v){

                        TextView myText=(TextView)findViewById(R.id.mytext);
                        myText.setText("Button clicked");
                    }
                }
        );
        myButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v) {
                        TextView myText=(TextView)findViewById(R.id.mytext);
                        myText.setText("Long Button clicked");
                        return true;
                    }
                }
        );
    }
}
