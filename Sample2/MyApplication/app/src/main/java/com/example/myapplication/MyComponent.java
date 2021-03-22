package com.example.myapplication;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = {SampleModule.class})
public interface MyComponent {

    void injectApplication(MyApplication application);
    void injectActivity(Activity application);
    SampleUtil getSampleUtil();


}
