package com.example.jetpackcomp.data.datasource.popularmovies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001f\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/jetpackcomp/data/datasource/popularmovies/LocalDataList;", "Lcom/example/jetpackcomp/data/datasource/popularmovies/DataListDataSource;", "db", "Lcom/example/jetpackcomp/model/room/JPDatabase;", "(Lcom/example/jetpackcomp/model/room/JPDatabase;)V", "fetchPopularMovieListApi", "Lcom/example/jetpackcomp/model/PopularMovieData;", "apiKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataListDB", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/jetpackcomp/model/MovieDetails;", "getMovieDetailsByID", "movieID", "", "saveDataList", "", "movieList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocalDataList implements com.example.jetpackcomp.data.datasource.popularmovies.DataListDataSource {
    private final com.example.jetpackcomp.model.room.JPDatabase db = null;
    
    @javax.inject.Inject
    public LocalDataList(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.model.room.JPDatabase db) {
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