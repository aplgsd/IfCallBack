package com.example.tangguangyue.interfacecallbacksample.IFCallBack;

public class IFManager {

    private ApiCallBack apiCallBack;

    public void setApiCallBack(ApiCallBack apiCallBack) {
        this.apiCallBack = apiCallBack;
    }

    public void callApi() {
        try {
            apiCallBack.success("success");
        } catch (Exception e) {
            apiCallBack.failed("failed");
        }
    }
}
