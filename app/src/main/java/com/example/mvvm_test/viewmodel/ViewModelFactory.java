package com.example.mvvm_test.viewmodel;


import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvm_test.repository.Repository;

import javax.inject.Inject;

public class ViewModelFactory implements ViewModelProvider.Factory {

    private Repository repository;

    @Inject
    public ViewModelFactory(Repository repository) {
        this.repository = repository;
    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
         if(modelClass.isAssignableFrom(MainActivityViewModel.class)){

            return (T) new MainActivityViewModel(repository);
        }



        throw new IllegalArgumentException("Unknown class name");
    }
}