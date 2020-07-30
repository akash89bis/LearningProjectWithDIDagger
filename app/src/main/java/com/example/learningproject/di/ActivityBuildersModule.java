package com.example.learningproject.di;

import com.example.learningproject.view.LoginActivity;
import com.example.learningproject.view.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract LoginActivity contributesLoginActivity();

    @ContributesAndroidInjector
    abstract MainActivity contributesMainActivity();

}
