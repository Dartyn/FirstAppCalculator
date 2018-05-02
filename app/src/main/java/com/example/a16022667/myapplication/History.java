package com.example.a16022667.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16022667 on 27/12/2017.
 */

public class History extends AppCompatActivity {
    ListView lvhistory;

    private List<String> test;

    ArrayList<String> alHistory = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);
        lvhistory = (ListView)findViewById(R.id.listViewhistory);

        final ArrayAdapter<String> aaHistory = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, alHistory);
        test = new ArrayList<String>();
        lvhistory.setAdapter(aaHistory);
        aaHistory.notifyDataSetChanged();
        Intent gethistory = getIntent();
        gethistory.putStringArrayListExtra("History", alHistory);
        alHistory = getIntent().getStringArrayListExtra("History");

        //System.out.print(gethistory);
        //tvhistory.setText(gethistory);
    }


}
