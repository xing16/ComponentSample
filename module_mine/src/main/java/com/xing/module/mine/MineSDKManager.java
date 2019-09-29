package com.xing.module.mine;

import android.util.Log;

public class MineSDKManager {
    private static final String TAG = "MineSDKManager";
    private static MineSDKManager instance;

    private MineSDKManager() {
    }

    public static MineSDKManager getInstance() {
        if (instance == null) {
            synchronized (MineSDKManager.class) {
                if (instance == null) {
                    instance = new MineSDKManager();
                }
            }
        }
        return instance;
    }

    public void init() {
        Log.e(TAG, "init: ");
    }

}
