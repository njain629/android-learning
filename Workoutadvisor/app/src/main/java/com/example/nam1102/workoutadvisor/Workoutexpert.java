package com.example.nam1102.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nam1102 on 12/1/18.
 */

public class Workoutexpert {
    List<String>getWorkouts(String workouttypes){
        List<String> workout=new ArrayList<String>();
        if (workouttypes.equals("Chest"))
        {
            workout.add("Bench Press");
            workout.add("Cable flys");
        }
        else if (workouttypes.equals("Triceps"))
        {
            workout.add("Tricep Ext");
            workout.add("Tricep Pushdown");
        }
        else if (workouttypes.equals("Shoulder"))
        {
            workout.add("Shoulder press");
        }
        else  if (workouttypes.equals("Biceps"))
        {
            workout.add("Bicep curls");
        }
        return workout;
    }
}
