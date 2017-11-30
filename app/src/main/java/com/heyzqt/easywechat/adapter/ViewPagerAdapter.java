package com.heyzqt.easywechat.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by heyzqt on 11/30/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    private List<Fragment> mFragments;

    public ViewPagerAdapter(Context context, FragmentManager fragmentManager, List<Fragment> fragments) {
        super(fragmentManager);
        this.mContext = context;
        this.mFragments = fragments;
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }
}
