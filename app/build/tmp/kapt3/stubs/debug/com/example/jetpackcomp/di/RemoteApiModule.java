package com.example.jetpackcomp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/jetpackcomp/di/RemoteApiModule;", "", "()V", "getRemoteAPI", "Lcom/example/jetpackcomp/data/Api;", "client", "Lokhttp3/OkHttpClient;", "provideHttpClient", "app_debug"})
@dagger.Module
public final class RemoteApiModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.jetpackcomp.di.RemoteApiModule INSTANCE = null;
    
    private RemoteApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient provideHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.jetpackcomp.data.Api getRemoteAPI(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
}