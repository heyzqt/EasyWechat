package com.heyzqt.easywechat;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heyzqt.contract.MainContract;
import com.heyzqt.presenter.MainPresenter;

/**
 * Created by heyzqt on 11/29/2017.
 */

public class MainFragment extends Fragment implements MainContract.View {

    private MainPresenter mPresenter;

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        return root;
    }

    @Override
    public void setPresenter(MainContract.Presenter Presenter) {
        mPresenter = (MainPresenter) Presenter;
    }

    @Override
    public void showData() {

    }
}
