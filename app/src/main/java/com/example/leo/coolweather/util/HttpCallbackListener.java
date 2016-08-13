package com.example.leo.coolweather.util;

/**
 * Created by Leo on 2016/8/13.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
