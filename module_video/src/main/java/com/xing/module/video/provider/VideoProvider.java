package com.xing.module.video.provider;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xing.module.common.provider.IVideoProvider;
import com.xing.module.video.fragment.VideoFragment;

@Route(path = "/video/main")
public class VideoProvider implements IVideoProvider {

    @Override
    public Fragment getVideoFragment() {
        return VideoFragment.newInstance();
    }

    @Override
    public void init(Context context) {

    }
}
