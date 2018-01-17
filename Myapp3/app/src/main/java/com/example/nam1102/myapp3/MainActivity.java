package com.example.nam1102.myapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{

    private TextView msg;
    private GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=(TextView)findViewById(R.id.mytext);
        this.gestureDetector=new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        msg.setText("SingleTap");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        msg.setText("DoubleTap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        msg.setText("doubletapevent");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        msg.setText("Down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        msg.setText("showpress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        msg.setText("SingleTapup");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        msg.setText("Scroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        msg.setText("longpress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        msg.setText("fling");
        return false;
    }
}
