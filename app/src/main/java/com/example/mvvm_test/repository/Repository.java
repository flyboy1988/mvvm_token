package com.example.mvvm_test.repository;



import com.example.mvvm_test.model.AppModel;
import com.example.mvvm_test.model.DevInfoModel;
import com.example.mvvm_test.model.DevModel;
import com.example.mvvm_test.network.retrofit.ApiCallInterface;
import com.google.gson.JsonElement;

import io.reactivex.Observable;


/**
 * Created by ${Saquib} on 03-05-2018.
 */

public class Repository {

    private ApiCallInterface apiCallInterface;

    public Repository(ApiCallInterface apiCallInterface) {
        this.apiCallInterface = apiCallInterface;
    }



    public Observable<JsonElement> executeLogin(AppModel appModel, DevInfoModel infoModel) {
        DevModel loginModel=new DevModel(appModel,infoModel);
        return apiCallInterface.getToken(loginModel);
    }





}
