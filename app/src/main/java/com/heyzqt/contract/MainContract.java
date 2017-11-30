package com.heyzqt.contract;

import com.heyzqt.BasePresenter;
import com.heyzqt.BaseView;

/**
 * Created by heyzqt on 11/29/2017.
 */

public class MainContract {

    public interface View extends BaseView<Presenter> {

        public void showData();
    }

    public interface Presenter extends BasePresenter {

        public void getData();
    }
}
