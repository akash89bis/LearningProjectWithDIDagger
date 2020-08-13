package com.example.learningproject.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.learningproject.viewmodel.ProviderFactory;

import dagger.Binds;
import dagger.Module;


@Module
public abstract class ProviderFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindsFactory(ProviderFactory factory);
}
