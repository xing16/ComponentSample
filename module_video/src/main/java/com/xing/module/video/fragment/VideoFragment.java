package com.xing.module.video.fragment;

import android.os.Bundle;
import android.view.View;

import com.xing.module.common.base.BaseFragment;
import com.xing.module.video.R;

public class VideoFragment extends BaseFragment {

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_video;
    }

    @Override
    protected void init(View rootView, Bundle savedInstanceState) {

    }

    public static VideoFragment newInstance() {
        VideoFragment videoFragment = new VideoFragment();
        return videoFragment;
    }


}
