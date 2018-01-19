package com.example.nam1102.boundservice;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.nam1102.boundservice.MyService.mylocalbinder;

public class MainActivity extends AppCompatActivity {

    MyService mys;
    boolean isbound=false;

    public void showtime(View v){
        String ctime=mys.getcurrentime();
        TextView myt= (TextView)findViewById(R.id.mytext);
        myt.setText(ctime);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i= new Intent(this,MyService.class);
        bindService(i,myconn, Context.BIND_AUTO_CREATE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private ServiceConnection myconn =new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            mylocalbinder b= (mylocalbinder) iBinder ;
            mys= b.getservice();
            isbound=true;

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            isbound=false;
        }
    };
}
