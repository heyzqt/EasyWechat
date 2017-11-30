package com.heyzqt.presenter;

import android.support.annotation.NonNull;

import com.heyzqt.contract.MainContract;

/**
 * Created by heyzqt on 11/29/2017.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

    public MainPresenter(@NonNull MainContract.View mainView) {
        mView = mainView;
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void getData() {

    }
}
