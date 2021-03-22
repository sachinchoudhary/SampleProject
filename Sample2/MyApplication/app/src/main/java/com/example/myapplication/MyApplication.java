package com.example.myapplication;

import android.app.Application;

public class MyApplication  extends Application {

    MyComponent myComponent;
    @Override
    public void onCreate() {
        super.onCreate();
       myComponent = DaggerMyComponent.builder().build();
       myComponent.injectApplication(this);

  }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}
