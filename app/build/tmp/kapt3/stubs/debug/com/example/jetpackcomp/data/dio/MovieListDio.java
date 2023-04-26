package com.example.jetpackcomp.data.dio;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004H\'J\u001f\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/jetpackcomp/data/dio/MovieListDio;", "", "()V", "getMovieDetailsByID", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/jetpackcomp/model/MovieDetails;", "movieID", "", "getMovieList", "", "saveMovieList", "", "movieDetails", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract class MovieListDio {
    
    public MovieListDio() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "Select * From movie_list")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.jetpackcomp.model.MovieDetails>> getMovieList();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveMovieList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.jetpackcomp.model.MovieDetails> movieDetails, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "Select * From movie_list Where id = :movieID")
    public abstract kotlinx.coroutines.flow.Flow<com.example.jetpackcomp.model.MovieDetails> getMovieDetailsByID(long movieID);
}