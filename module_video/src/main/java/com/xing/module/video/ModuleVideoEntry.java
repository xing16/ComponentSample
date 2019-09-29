package com.xing.module.video;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xing.module.common.entry.IVideoEntry;

@Route(path = "/video/entry")
public class ModuleVideoEntry implements IVideoEntry {

    private static final String TAG = "ModuleVideoEntry";

    @Override
    public void initVideoSDK() {
        Log.e(TAG, "initVideoSDK: ");
        VideoSDKManager.getInstance().init();
    }

    @Override
    public void init(Context context) {
        Log.e(TAG, "init: ");
    }
}
