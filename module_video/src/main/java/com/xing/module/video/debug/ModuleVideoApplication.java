package com.xing.module.video.debug;

import com.xing.module.common.base.BaseApplication;
import com.xing.module.video.VideoSDKManager;

public class ModuleVideoApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        VideoSDKManager.getInstance().init();
    }
}
