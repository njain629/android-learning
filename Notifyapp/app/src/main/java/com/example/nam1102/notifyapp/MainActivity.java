package com.example.nam1102.notifyapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    NotificationCompat.Builder noti;
    private static final int id=1111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noti=new NotificationCompat.Builder(this);
        noti.setAutoCancel(true);
    }

    public void buttonclick(View v){
        noti.setSmallIcon(R.mipmap.ic_launcher);
        noti.setTicker("this is a ticker");
        noti.setWhen(System.currentTimeMillis());
        noti.setContentTitle("this is title");
        noti.setContentText("this is text");
        Intent i=new Intent(this,MainActivity.class);
        PendingIntent pi= PendingIntent.getActivity(this,0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        noti.setContentIntent(pi);

        NotificationManager nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(id,noti.build());
    }



}
