package com.heyzqt.easywechat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by heyzqt on 11/30/2017.
 */

public class ImgFragment extends Fragment {

    public static ImgFragment newInstance() {
        ImgFragment fragment = new ImgFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_img, container, false);
        return root;
    }
}
