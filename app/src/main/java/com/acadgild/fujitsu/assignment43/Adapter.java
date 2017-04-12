package com.acadgild.fujitsu.assignment43;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fujitsu on 12/04/2017.
 */

public class Adapter extends BaseAdapter {

    private LayoutInflater mLayoutInflater;
    private ArrayList<Integer> dummyData;

    public Adapter(Context contex, ArrayList<Integer> dummyData) {

        this.dummyData = dummyData;
        mLayoutInflater = LayoutInflater.from(contex);

    }

    @Override
    public int getCount() {
        return dummyData.size();
    }

    @Override
    public Object getItem(int position) {
        return dummyData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Integer itr = (Integer) getItem(position);


        convertView = mLayoutInflater.inflate(R.layout.gridimage,parent,false);

        ImageView mimage1 = (ImageView) convertView.findViewById(R.id.image1);
        ImageView mimage2 = (ImageView) convertView.findViewById(R.id.image2);

        mimage1.setImageResource(itr);
        mimage2.setImageResource(itr);


        return convertView;


    }
}
