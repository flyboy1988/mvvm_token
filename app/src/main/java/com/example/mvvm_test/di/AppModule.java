package com.example.mvvm_test.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * Created by ali aslani.
 */

@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }
}
