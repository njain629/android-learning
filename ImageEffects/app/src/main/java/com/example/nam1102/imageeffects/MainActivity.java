package com.example.nam1102.imageeffects;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    Drawable flower;
    Bitmap bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView)findViewById(R.id.myimageview);

        /*flower= ResourcesCompat.getDrawable(getResources(),R.drawable.img,null);
        bi=((BitmapDrawable)flower).getBitmap();

        Bitmap p=invert(bi);
        iv.setImageBitmap(p);*/
        Drawable [] l=new Drawable[2];
        l[0]=ResourcesCompat.getDrawable(getResources(),R.drawable.img,null);
        l[1]=ResourcesCompat.getDrawable(getResources(),R.drawable.img1,null);
        LayerDrawable ld=new LayerDrawable(l);
        iv.setImageDrawable(ld);

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
