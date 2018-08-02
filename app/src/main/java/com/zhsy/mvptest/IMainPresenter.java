package com.zhsy.mvptest;

import com.zhsy.mvptest.model.MainModelBean;

public interface IMainPresenter {
    //此接口作用是连接Model
    void loadDataSuccess(MainModelBean mainModelBean);
    void loadDataFailure();
}
