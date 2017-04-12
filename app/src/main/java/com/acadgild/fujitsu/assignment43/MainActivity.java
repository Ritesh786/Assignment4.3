
package com.acadgild.fujitsu.assignment43;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView mgridview;

    private Adapter mNameAdapter;

    private ArrayList<Integer> dummydata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgridview  = (GridView) findViewById(R.id.gridview);

        dummydata = new ArrayList<>();
        dummydata.add(R.drawable.atteone);
        dummydata.add(R.drawable.booksec);
        dummydata.add(R.drawable.bookthird);
        dummydata.add(R.drawable.hommee);
        dummydata.add(R.drawable.mone);
        dummydata.add(R.drawable.sone);

        mNameAdapter = new Adapter(MainActivity.this, dummydata);

        mgridview.setAdapter(mNameAdapter);


    }
}
