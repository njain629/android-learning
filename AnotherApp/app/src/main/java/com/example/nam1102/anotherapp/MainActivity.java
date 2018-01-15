package com.example.nam1102.anotherapp;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView t=(TextView) findViewById(R.id.textView);
                        t.setText("button clicked");

                    }
                }
        );
    }


}
