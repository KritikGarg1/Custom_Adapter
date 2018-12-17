package com.example.roshni.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView listview;
    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(ListView)findViewById(R.id.list_item);
        ArrayList<movie> movielist=new ArrayList<>();
        movielist.add(new movie(R.drawable.ic_launcher_background, "After Earth" , "2013","+","-"));
        movielist.add(new movie(R.drawable.ic_launcher_background, "Baby Driver" , "2017","+","-"));
        movielist.add(new movie(R.drawable.ic_launcher_background, "Deadpool" , "2016","+","-"));
        movielist.add(new movie(R.drawable.ic_launcher_background, "Divergent" , "2014","+","-"));

        adapter = new MovieAdapter(this,movielist);
        listview.setAdapter(adapter);
    }
}
