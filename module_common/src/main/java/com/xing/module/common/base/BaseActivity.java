package com.xing.module.common.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ARouter.getInstance().inject(this);
        init();
    }

    protected abstract void init();

    protected abstract int getLayoutResId();
}
