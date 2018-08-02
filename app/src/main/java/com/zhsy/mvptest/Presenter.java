package com.zhsy.mvptest;

public interface  Presenter<V> {
    void attachView(V view);
    void detachView();
}
