package com.example.mvvm_test.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AppModel {

    @SerializedName("applicationName")
    @Expose
    private String applicationName;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public AppModel(String applicationName) {
        this.applicationName = applicationName;
    }
}