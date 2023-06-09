// Generated by Dagger (https://dagger.dev).
package com.example.jetpackcomp.di;

import com.example.jetpackcomp.data.Api;
import com.example.jetpackcomp.data.datasource.popularmovies.RemoteDataList;
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
public final class DataListModule_ProvideRemoteDataSourceFactory implements Factory<RemoteDataList> {
  private final Provider<Api> apiServiceProvider;

  public DataListModule_ProvideRemoteDataSourceFactory(Provider<Api> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public RemoteDataList get() {
    return provideRemoteDataSource(apiServiceProvider.get());
  }

  public static DataListModule_ProvideRemoteDataSourceFactory create(
      Provider<Api> apiServiceProvider) {
    return new DataListModule_ProvideRemoteDataSourceFactory(apiServiceProvider);
  }

  public static RemoteDataList provideRemoteDataSource(Api apiService) {
    return Preconditions.checkNotNullFromProvides(DataListModule.INSTANCE.provideRemoteDataSource(apiService));
  }
}
