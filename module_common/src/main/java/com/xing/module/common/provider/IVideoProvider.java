package com.xing.module.common.provider;

import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface IVideoProvider extends IProvider {

    Fragment getVideoFragment();
}
