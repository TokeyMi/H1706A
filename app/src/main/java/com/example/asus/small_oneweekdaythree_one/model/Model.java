package com.example.asus.small_oneweekdaythree_one.model;

import com.example.asus.small_oneweekdaythree_one.untils.HttpUntils;

/**
 * Created by asus on 2018/1/17.
 */

public class Model implements ModelInfo {
    @Override
    public void getDataFromWhere(String[] strings, CallBackLisnter callBackLisnter) {
        HttpUntils.getDateByRe(callBackLisnter);

    }
}
