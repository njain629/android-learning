package com.example.nam1102.mylistapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

 class customadapter extends ArrayAdapter<String>{
    public customadapter(Context context, String [] fruit) {

        super(context,R.layout.custom_row, fruit);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater myinf= LayoutInflater.from(getContext());
        View cview=myinf.inflate(R.layout.custom_row,parent,false);

        String singlefruit =getItem(position);
        TextView mytxt=(TextView) cview.findViewById(R.id.mytext);
        ImageView myimg=(ImageView)cview.findViewById(R.id.myimage);

        mytxt.setText(singlefruit);
        myimg.setImageResource(R.drawable.apple);
        return cview;
    }
}
