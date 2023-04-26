package com.example.jetpackcomp.model;

import java.lang.System;

@androidx.room.Entity(tableName = "movie_list")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0011\u001a\u00020\f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\fH\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\u008b\u0001\u00102\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u00072\b\b\u0003\u0010\u000e\u001a\u00020\u00072\b\b\u0003\u0010\u000f\u001a\u00020\u00072\b\b\u0003\u0010\u0010\u001a\u00020\u00052\b\b\u0003\u0010\u0011\u001a\u00020\f2\b\b\u0003\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00103\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019\u00a8\u00068"}, d2 = {"Lcom/example/jetpackcomp/model/MovieDetails;", "", "id", "", "adult", "", "backdropPath", "", "originalLanguage", "originalTitle", "overview", "popularity", "", "posterPath", "releaseDate", "title", "video", "voteAverage", "voteCount", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDJ)V", "getAdult", "()Z", "getBackdropPath", "()Ljava/lang/String;", "getId", "()J", "getOriginalLanguage", "getOriginalTitle", "getOverview", "getPopularity", "()D", "getPosterPath", "getReleaseDate", "getTitle", "getVideo", "getVoteAverage", "getVoteCount", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class MovieDetails {
    @androidx.room.PrimaryKey
    private final long id = 0L;
    private final boolean adult = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String backdropPath = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String originalLanguage = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String originalTitle = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String overview = null;
    private final double popularity = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String posterPath = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    private final boolean video = false;
    private final double voteAverage = 0.0;
    private final long voteCount = 0L;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.jetpackcomp.model.MovieDetails copy(@com.squareup.moshi.Json(name = "id")
    long id, @com.squareup.moshi.Json(name = "adult")
    boolean adult, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdropPath, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "original_language")
    java.lang.String originalLanguage, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "original_title")
    java.lang.String originalTitle, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @com.squareup.moshi.Json(name = "popularity")
    double popularity, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @com.squareup.moshi.Json(name = "video")
    boolean video, @com.squareup.moshi.Json(name = "vote_average")
    double voteAverage, @com.squareup.moshi.Json(name = "vote_count")
    long voteCount) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public MovieDetails(@com.squareup.moshi.Json(name = "id")
    long id, @com.squareup.moshi.Json(name = "adult")
    boolean adult, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdropPath, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "original_language")
    java.lang.String originalLanguage, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "original_title")
    java.lang.String originalTitle, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @com.squareup.moshi.Json(name = "popularity")
    double popularity, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @com.squareup.moshi.Json(name = "video")
    boolean video, @com.squareup.moshi.Json(name = "vote_average")
    double voteAverage, @com.squareup.moshi.Json(name = "vote_count")
    long voteCount) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getAdult() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getPopularity() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean getVideo() {
        return false;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getVoteAverage() {
        return 0.0;
    }
    
    public final long component13() {
        return 0L;
    }
    
    public final long getVoteCount() {
        return 0L;
    }
}