package com.xing.module.mine.provider;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xing.module.common.provider.IMineProvider;
import com.xing.module.mine.fragment.MineFragment;

@Route(path = "/mine/main")
public class MineProvider implements IMineProvider {

    @Override
    public Fragment getMineFragment() {
        return MineFragment.newInstance();
    }

    @Override
    public void init(Context context) {

    }
}
