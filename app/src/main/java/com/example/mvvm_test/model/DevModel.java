package com.example.mvvm_test.model;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DevModel {

    @SerializedName("app")
    @Expose
    private AppModel app;
    @SerializedName("dev")
    @Expose
    private DevInfoModel dev;

    public AppModel getApp() {
        return app;
    }

    public void setApp(AppModel app) {
        this.app = app;
    }

    public DevInfoModel getDev() {
        return dev;
    }

    public void setDev(DevInfoModel dev) {
        this.dev = dev;
    }

    public DevModel(AppModel app, DevInfoModel dev) {
        this.app = app;
        this.dev = dev;
    }
}