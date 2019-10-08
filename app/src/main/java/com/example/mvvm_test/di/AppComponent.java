package com.example.mvvm_test.di;



import com.example.mvvm_test.MainActivity;

import javax.inject.Singleton;

import dagger.Component;


@Component(modules = {AppModule.class, UtilsModule.class})
@Singleton
public interface AppComponent {
    ;
    void injectMainActivity(MainActivity mainActivity);

}
