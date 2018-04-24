package com.example.administrator.recyclerviewdemo;

/**
 * Created by Administrator on 2018/4/24 0024.
 */

public class Data {

    private String name;
    private int imageId;

    public Data(String name,int imageId)
    {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
