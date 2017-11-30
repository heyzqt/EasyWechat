package com.heyzqt.easywechat;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import com.heyzqt.easywechat.adapter.ViewPagerAdapter;
import com.heyzqt.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    private ViewPager mViewPager;

    private MainFragment mMainFragment;
    private NewsFragment mNewsFragment;
    private ImgFragment mImgFragment;

    private MainPresenter mMainPresenter;

    private FragmentManager mFragmentManager;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void init() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mToolbar.setTitleTextColor(ContextCompat.getColor(mContext, R.color.text_color_white));

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        List<Fragment> lists = new ArrayList<>();
        mFragmentManager = getSupportFragmentManager();
        mNewsFragment = NewsFragment.newInstance();
        mImgFragment = ImgFragment.newInstance();
        lists.add(mNewsFragment);
        lists.add(mImgFragment);
        ViewPagerAdapter adapter = new ViewPagerAdapter(mContext, mFragmentManager, lists);
        mViewPager.setAdapter(adapter);
    }
}
