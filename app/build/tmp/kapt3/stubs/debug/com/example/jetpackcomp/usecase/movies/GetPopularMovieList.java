package com.example.jetpackcomp.usecase.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006J\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/jetpackcomp/usecase/movies/GetPopularMovieList;", "", "moviesRepository", "Lcom/example/jetpackcomp/data/repository/PopularMovieListRepository;", "(Lcom/example/jetpackcomp/data/repository/PopularMovieListRepository;)V", "getPopularMovieByID", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/jetpackcomp/model/MovieDetails;", "movieID", "", "getPopularMovieList", "", "invoke", "Lcom/example/jetpackcomp/model/PopularMovieData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetPopularMovieList {
    private final com.example.jetpackcomp.data.repository.PopularMovieListRepository moviesRepository = null;
    
    public GetPopularMovieList(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.data.repository.PopularMovieListRepository moviesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.jetpackcomp.model.PopularMovieData> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.jetpackcomp.model.MovieDetails>> getPopularMovieList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.jetpackcomp.model.MovieDetails> getPopularMovieByID(long movieID) {
        return null;
    }
}