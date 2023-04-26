package com.example.jetpackcomp.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0011\u001a\u00020\u0013H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/jetpackcomp/ui/viewmodel/MovieViewModel;", "Lcom/example/jetpackcomp/base/JPBaseViewModel;", "getPopularMovieList", "Lcom/example/jetpackcomp/usecase/movies/GetPopularMovieList;", "savePopularMovieList", "Lcom/example/jetpackcomp/usecase/movies/SavePopularMovieList;", "(Lcom/example/jetpackcomp/usecase/movies/GetPopularMovieList;Lcom/example/jetpackcomp/usecase/movies/SavePopularMovieList;)V", "_movieDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/jetpackcomp/model/MovieDetails;", "_movieList", "", "movieDetails", "Landroidx/lifecycle/LiveData;", "getMovieDetails", "()Landroidx/lifecycle/LiveData;", "movieList", "getMovieList", "fetchMovieList", "", "getMovieDetailsByID", "movieID", "", "app_debug"})
public final class MovieViewModel extends com.example.jetpackcomp.base.JPBaseViewModel {
    private final com.example.jetpackcomp.usecase.movies.GetPopularMovieList getPopularMovieList = null;
    private final com.example.jetpackcomp.usecase.movies.SavePopularMovieList savePopularMovieList = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.jetpackcomp.model.MovieDetails>> _movieList;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.jetpackcomp.model.MovieDetails>> movieList = null;
    private androidx.lifecycle.MutableLiveData<com.example.jetpackcomp.model.MovieDetails> _movieDetails;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.jetpackcomp.model.MovieDetails> movieDetails = null;
    
    @javax.inject.Inject
    public MovieViewModel(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.usecase.movies.GetPopularMovieList getPopularMovieList, @org.jetbrains.annotations.NotNull
    com.example.jetpackcomp.usecase.movies.SavePopularMovieList savePopularMovieList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.jetpackcomp.model.MovieDetails>> getMovieList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.jetpackcomp.model.MovieDetails> getMovieDetails() {
        return null;
    }
    
    private final void getMovieList() {
    }
    
    private final void fetchMovieList() {
    }
    
    public final void getMovieDetailsByID(long movieID) {
    }
}