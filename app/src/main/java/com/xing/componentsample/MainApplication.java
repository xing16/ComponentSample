package com.xing.componentsample;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xing.module.common.base.BaseApplication;
import com.xing.module.common.entry.IVideoEntry;
import com.xing.module.common.event.SDKEvent;

import org.greenrobot.eventbus.EventBus;

public class MainApplication extends BaseApplication {

    @Autowired(name = "/video/entry")
    IVideoEntry videoApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.getInstance().inject(this);
        if (videoApplication != null) {
            videoApplication.initVideoSDK();
        }
        EventBus.getDefault().post(new SDKEvent());
    }
}
