package com.example.nam1102.myfragments;

import android.support.v4.app.Fragment;

/**
 * Created by nam1102 on 12/1/18.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class bottomsection extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.bottomsection,container,false);
        return v;
    }
}
