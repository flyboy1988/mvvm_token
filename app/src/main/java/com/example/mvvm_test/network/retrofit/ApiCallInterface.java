package com.example.mvvm_test.network.retrofit;

import com.example.mvvm_test.model.DevModel;
import com.google.gson.JsonElement;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by ${Saquib} on 03-05-2018.
 */


public interface ApiCallInterface {




    @POST("/user/init")
   // @Headers({ "Content-Type: application/json;charset=UTF-8"})
    Observable<JsonElement> getToken( @Body DevModel loginModel);


}
