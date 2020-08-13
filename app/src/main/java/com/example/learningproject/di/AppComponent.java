package com.example.learningproject.di;

import android.app.Application;

import com.example.learningproject.base.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityBuildersModule.class,
        AppModule.class,
        ProviderFactoryModule.class,
        ViewModelModule.class
})
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{
        AppComponent build();

        @BindsInstance
        Builder application(Application application);
    }
}
