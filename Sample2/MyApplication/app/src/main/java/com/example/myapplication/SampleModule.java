package com.example.myapplication;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SampleModule {



@Inject
public SampleUtil sampleUtil;

@Provides
@Singleton
public SampleUtil getUtilClass(){
  return new SampleUtil("Test");
}


}
