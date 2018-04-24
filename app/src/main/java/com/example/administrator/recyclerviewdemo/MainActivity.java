package com.example.administrator.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Data> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        DataAdapter adapter = new DataAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {

        for(int i = 0;i<2;i++)
        {
            Data one = new Data("one",R.mipmap.ic_launcher);
            dataList.add(one);
            Data two = new Data("two",R.mipmap.ic_launcher);
            dataList.add(two);
            Data three = new Data("three",R.mipmap.ic_launcher);
            dataList.add(three);
            Data four = new Data("four",R.mipmap.ic_launcher);
            dataList.add(four);
            Data five = new Data("five",R.mipmap.ic_launcher);
            dataList.add(five);
        }
    }
}
