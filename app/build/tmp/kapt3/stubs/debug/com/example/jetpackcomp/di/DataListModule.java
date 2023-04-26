package com.example.jetpackcomp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/jetpackcomp/di/DataListModule;", "", "()V", "provideGetPopularMovieList", "Lcom/example/jetpackcomp/usecase/movies/GetPopularMovieList;", "repo", "Lcom/example/jetpackcomp/data/repository/PopularMovieListRepository;", "provideLocalDataSource", "Lcom/example/jetpackcomp/data/datasource/popularmovies/LocalDataList;", "db", "Lcom/example/jetpackcomp/model/room/JPDatabase;", "provideRemoteDataSource", "Lcom/example/jetpackcomp/data/datasource/popularmovies/RemoteDataList;", "apiService", "Lcom/example/jetpackcomp/data/Api;", "provideSavePopularMovieList", "Lcom/example/jetpackcomp/usecase/movies/SavePopularMovieList;", "app_debug"})
@dagger.Module
public final class DataListModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.jetpackcomp.di.DataListModule INSTANCE = null;
    
    private DataListModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.jetpackcomp.data.datasource.popularmovies.LocalDataList provideLocalDataSource(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.model.room.JPDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.jetpackcomp.data.datasource.popularmovies.RemoteDataList provideRemoteDataSource(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.data.Api apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.jetpackcomp.usecase.movies.GetPopularMovieList provideGetPopularMovieList(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.data.repository.PopularMovieListRepository repo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.jetpackcomp.usecase.movies.SavePopularMovieList provideSavePopularMovieList(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.data.repository.PopularMovieListRepository repo) {
        return null;
    }
}