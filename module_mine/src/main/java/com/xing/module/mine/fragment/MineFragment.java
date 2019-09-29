package com.xing.module.mine.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.xing.module.common.base.BaseFragment;
import com.xing.module.mine.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends BaseFragment {


    public static MineFragment newInstance() {
        return new MineFragment();
    }

    @Override
    protected void init(View rootView, Bundle savedInstanceState) {

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_mine;
    }
}
