package com.example.jetpackcomp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/jetpackcomp/di/RoomDbModule;", "", "()V", "DB_NAME", "", "provideRoomDatabase", "Lcom/example/jetpackcomp/model/room/JPDatabase;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class RoomDbModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.jetpackcomp.di.RoomDbModule INSTANCE = null;
    private static final java.lang.String DB_NAME = "Movie_DB";
    
    private RoomDbModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.jetpackcomp.model.room.JPDatabase provideRoomDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}