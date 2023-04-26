package com.example.jetpackcomp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = JpApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface JpApplication_GeneratedInjector {
  void injectJpApplication(JpApplication jpApplication);
}
