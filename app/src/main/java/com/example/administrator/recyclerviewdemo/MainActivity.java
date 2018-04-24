package com.example.administrator.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Data> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        DataAdapter adapter = new DataAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {

        for(int i = 0;i<2;i++)
        {
            Data one = new Data(getRandomLengthName("one"),R.mipmap.ic_launcher);
            dataList.add(one);
            Data two = new Data(getRandomLengthName("two"),R.mipmap.ic_launcher);
            dataList.add(two);
            Data three = new Data(getRandomLengthName("three"),R.mipmap.ic_launcher);
            dataList.add(three);
            Data four = new Data(getRandomLengthName("four"),R.mipmap.ic_launcher);
            dataList.add(four);
            Data five = new Data(getRandomLengthName("five"),R.mipmap.ic_launcher);
            dataList.add(five);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<length;i++)
        {
            builder.append(name);
        }
        return builder.toString();
    }
}
