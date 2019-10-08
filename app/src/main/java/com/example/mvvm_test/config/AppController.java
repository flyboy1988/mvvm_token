package com.example.mvvm_test.config;

import android.app.Application;
import android.content.Context;


import com.example.mvvm_test.di.AppComponent;
import com.example.mvvm_test.di.AppModule;
import com.example.mvvm_test.di.DaggerAppComponent;
import com.example.mvvm_test.di.UtilsModule;


import io.reactivex.plugins.RxJavaPlugins;


/**
 * Created by Ali Aslani on 3/10/2019.
 * Rayan Parsi
 * ali.aslani1367@gmail.com
 */
public class AppController extends Application {
    AppComponent appComponent;

    private static AppController mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).utilsModule(new UtilsModule()).build();

        mInstance = this;
        RxJavaPlugins.setErrorHandler(throwable -> {
        });

//        }

    }

    public static synchronized AppController getInstance() {
        return mInstance;
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }

}