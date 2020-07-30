package com.example.learningproject.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Named("First Movie")
    String methodUserName(){
        return "Dil Bechara";
    }

    @Provides
    @Named("Second Movie")
    String secondMovie(){
        return "The Walking Dead";
    }
}
