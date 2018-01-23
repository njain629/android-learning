package com.example.nam1102.invertimageapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    static final int request_image=1;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.mybutton);
        iv=(ImageView)findViewById(R.id.myimageview);

        if (!hascamera()){
            b.setEnabled(false);
        }
    }
    public boolean hascamera(){
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    public void launchcamera(View v){
        Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,request_image);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==request_image && resultCode==RESULT_OK){
            Bundle e=data.getExtras();
            Bitmap p=(Bitmap)e.get("data");
            Bitmap nw=invert(p);
            iv.setImageBitmap(nw);
        }
    }
    public static Bitmap invert(Bitmap o){

        Bitmap fi=Bitmap.createBitmap(o.getWidth(),o.getHeight(),o.getConfig());
        int a,r,g,b;
        int pc;
        int h=o.getHeight();
        int w=o.getWidth();
        for (int y=0;y<h;y++)
        {
            for (int x=0;x<w;x++){
                pc=o.getPixel(x,y);
                a= Color.alpha(pc);
                r=255-Color.red(pc);
                g=255-Color.green(pc);
                b=255-Color.blue(pc);

                fi.setPixel(x,y,Color.argb(a,r,g,b));

            }
        }
        return fi;
    }
}
