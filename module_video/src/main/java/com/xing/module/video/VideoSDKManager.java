package com.xing.module.video;

import android.util.Log;

public class VideoSDKManager {
    private static final String TAG = "VideoSDKManager";
    private static VideoSDKManager instance;

    private VideoSDKManager() {

    }

    public static VideoSDKManager getInstance() {
        if (instance == null) {
            synchronized (VideoSDKManager.class) {
                if (instance == null) {
                    instance = new VideoSDKManager();
                }
            }
        }
        return instance;
    }

    public void init() {
        Log.e(TAG, "init: ");
    }

}
