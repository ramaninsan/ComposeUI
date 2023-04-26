package com.example.jetpackcomp.data.datasource.popularmovies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\f\u001a\u00020\rH&J\u001f\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/jetpackcomp/data/datasource/popularmovies/DataListDataSource;", "", "fetchPopularMovieListApi", "Lcom/example/jetpackcomp/model/PopularMovieData;", "apiKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataListDB", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/jetpackcomp/model/MovieDetails;", "getMovieDetailsByID", "movieID", "", "saveDataList", "", "movieList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DataListDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchPopularMovieListApi(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.jetpackcomp.model.PopularMovieData> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveDataList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.jetpackcomp.model.MovieDetails> movieList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.jetpackcomp.model.MovieDetails>> getDataListDB();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.jetpackcomp.model.MovieDetails> getMovieDetailsByID(long movieID);
}