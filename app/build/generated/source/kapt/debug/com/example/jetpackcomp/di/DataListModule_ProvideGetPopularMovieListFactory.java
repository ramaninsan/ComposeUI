// Generated by Dagger (https://dagger.dev).
package com.example.jetpackcomp.di;

import com.example.jetpackcomp.data.repository.PopularMovieListRepository;
import com.example.jetpackcomp.usecase.movies.GetPopularMovieList;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataListModule_ProvideGetPopularMovieListFactory implements Factory<GetPopularMovieList> {
  private final Provider<PopularMovieListRepository> repoProvider;

  public DataListModule_ProvideGetPopularMovieListFactory(
      Provider<PopularMovieListRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public GetPopularMovieList get() {
    return provideGetPopularMovieList(repoProvider.get());
  }

  public static DataListModule_ProvideGetPopularMovieListFactory create(
      Provider<PopularMovieListRepository> repoProvider) {
    return new DataListModule_ProvideGetPopularMovieListFactory(repoProvider);
  }

  public static GetPopularMovieList provideGetPopularMovieList(PopularMovieListRepository repo) {
    return Preconditions.checkNotNullFromProvides(DataListModule.INSTANCE.provideGetPopularMovieList(repo));
  }
}
