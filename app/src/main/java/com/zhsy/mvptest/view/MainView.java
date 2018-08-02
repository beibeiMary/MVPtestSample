package com.zhsy.mvptest.view;

import com.zhsy.mvptest.model.MainModelBean;

public interface  MainView {
    void showData(MainModelBean mainModelBean);
    void showProgress();
    void hideProgress();
}
