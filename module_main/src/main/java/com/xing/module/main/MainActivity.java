package com.xing.module.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xing.module.common.base.BaseActivity;
import com.xing.module.common.provider.IMineProvider;
import com.xing.module.common.provider.IVideoProvider;

@Route(path = "/main/MainActivity")
public class MainActivity extends BaseActivity {

    @Autowired(name = "/video/main")
    IVideoProvider videoProvider;
    @Autowired(name = "/mine/main")
    IMineProvider mineProvider;

    private Fragment videoFragment;
    private Fragment mineFragment;

    @Override
    protected void init() {
        RadioGroup radioGroup = findViewById(R.id.rg_group);
        Log.e("debug", "onCreate: " + (videoProvider == null));
        if (videoProvider != null) {
            videoFragment = videoProvider.getVideoFragment();
            changeFragment(videoFragment);
        }
        if (mineProvider != null) {
            mineFragment = mineProvider.getMineFragment();
        }

        String isShareRequired = BuildConfig.isShareRequired;
        String isVideoRequired = BuildConfig.isVideoRequired;

        if ("true".equalsIgnoreCase(isVideoRequired)) {
            radioGroup.addView(createRadioButton(this, R.id.menu_video, "视频", getResources().getDrawable(R.drawable.selector_video)));
        }
        if ("true".equalsIgnoreCase(isShareRequired)) {
            radioGroup.addView(createRadioButton(this, R.id.menu_mine, "我的", getResources().getDrawable(R.drawable.selector_mine)));
        }

        radioGroup.check(R.id.menu_video);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.menu_video) {
                    changeFragment(videoFragment);
                } else if (checkedId == R.id.menu_mine) {
                    changeFragment(mineFragment);
                }
            }
        });
    }


    private RadioButton createRadioButton(Context context, int id, String text, Drawable top) {
        RadioButton radioButton = new RadioButton(context);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT);
        layoutParams.weight = 1;
        radioButton.setLayoutParams(layoutParams);
        radioButton.setId(id);
        radioButton.setText(text);
        radioButton.setGravity(Gravity.CENTER);
        radioButton.setButtonDrawable(android.R.color.transparent);
        top.setBounds(0, 0, top.getIntrinsicWidth(), top.getIntrinsicHeight());
        radioButton.setCompoundDrawables(null,
                top,
                null,
                null);
        return radioButton;
    }


    private void changeFragment(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fl_container, fragment);
        ft.commitAllowingStateLoss();
    }


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }
}
