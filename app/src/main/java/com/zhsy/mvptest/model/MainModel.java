package com.zhsy.mvptest.model;

import com.zhsy.mvptest.IMainPresenter;

/**
 * 业务具体处理，包括负责存储、检索、操纵数据等
 */
public class MainModel {
    IMainPresenter mIMainPresenter;
    public MainModel(IMainPresenter iMainPresenter) {
        this.mIMainPresenter = iMainPresenter;
    }
    public void loadData() {
//        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
//        asyncHttpClient.get("http://www.weather.com.cn/adat/sk/101010100.html", new JsonHttpResponseHandler() {
//            @Override
//            public void onSuccess(int statusCode, PreferenceActivity.Header[] headers, JSONObject response) {
//                super.onSuccess(statusCode, headers, response);
//                try {
//                    MainModelBean mainModelBean = new MainModelBean();
//                    JSONObject weatherinfo = response.getJSONObject("weatherinfo");
//                    mainModelBean.setCity(weatherinfo.getString("city"));
//                    mainModelBean.setWd(weatherinfo.getString("WD"));
//                    mainModelBean.setWs(weatherinfo.getString("WS"));
//                    mainModelBean.setTime(weatherinfo.getString("time"));
//                    mIMainPresenter.loadDataSuccess(mainModelBean);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
            }

//            @Override
//            public void onFailure(int statusCode, PreferenceActivity.Header[] headers, Throwable throwable, JSONObject errorResponse) {
////                super.onFailure(statusCode, headers, throwable, errorResponse);
////                mIMainPresenter.loadDataFailure();
//            }
//        });
//    }

}

