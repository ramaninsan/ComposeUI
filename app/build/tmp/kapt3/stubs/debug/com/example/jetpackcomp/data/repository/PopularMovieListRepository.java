package com.example.jetpackcomp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001f\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/jetpackcomp/data/repository/PopularMovieListRepository;", "Lcom/example/jetpackcomp/data/datasource/popularmovies/DataListDataSource;", "remoteSource", "Lcom/example/jetpackcomp/data/datasource/popularmovies/RemoteDataList;", "localSource", "Lcom/example/jetpackcomp/data/datasource/popularmovies/LocalDataList;", "(Lcom/example/jetpackcomp/data/datasource/popularmovies/RemoteDataList;Lcom/example/jetpackcomp/data/datasource/popularmovies/LocalDataList;)V", "fetchPopularMovieListApi", "Lcom/example/jetpackcomp/model/PopularMovieData;", "apiKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataListDB", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/jetpackcomp/model/MovieDetails;", "getMovieDetailsByID", "movieID", "", "saveDataList", "", "movieList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PopularMovieListRepository implements com.example.jetpackcomp.data.datasource.popularmovies.DataListDataSource {
    private final com.example.jetpackcomp.data.datasource.popularmovies.RemoteDataList remoteSource = null;
    private final com.example.jetpackcomp.data.datasource.popularmovies.LocalDataList localSource = null;
    
    @javax.inject.Inject
    public PopularMovieListRepository(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.data.datasource.popularmovies.RemoteDataList remoteSource, @org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.data.datasource.popularmovies.LocalDataList localSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object fetchPopularMovieListApi(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.jetpackcomp.model.PopularMovieData> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveDataList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.jetpackcomp.model.MovieDetails> movieList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.jetpackcomp.model.MovieDetails>> getDataListDB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.example.jetpackcomp.model.MovieDetails> getMovieDetailsByID(long movieID) {
        return null;
    }
}