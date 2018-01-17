package com.example.nam1102.workoutadvisor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWorkoutActivity extends AppCompatActivity {

    private Workoutexpert expert =new Workoutexpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);

    }

    public void onClickFindWorkout(View v){
        TextView workouts= (TextView)findViewById(R.id.textView);
        Spinner workoutypes=(Spinner)findViewById(R.id.workouttype);
        String workout= String.valueOf(workoutypes.getSelectedItem());
        List<String>workoutList=expert.getWorkouts(workout);
        StringBuilder workoutformat=new StringBuilder();
        for (String work: workoutList){
            workoutformat.append(work).append('\n');
        }
        s
        workouts.setText(workoutformat);

    }

}
