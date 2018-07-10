package com.example.tangguangyue.interfacecallbacksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tangguangyue.interfacecallbacksample.IFCallBack.ApiCallBack;
import com.example.tangguangyue.interfacecallbacksample.IFCallBack.IFManager;

public class MainActivity extends AppCompatActivity implements ApiCallBack {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IFManager ifManager = new IFManager();
        ifManager.setApiCallBack(this);
        ifManager.callApi();
    }

    @Override
    public void success(Object obj) {

    }

    @Override
    public void failed(Object obj) {

    }
}
