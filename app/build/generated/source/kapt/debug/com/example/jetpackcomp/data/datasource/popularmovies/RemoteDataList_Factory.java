// Generated by Dagger (https://dagger.dev).
package com.example.jetpackcomp.data.datasource.popularmovies;

import com.example.jetpackcomp.data.Api;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteDataList_Factory implements Factory<RemoteDataList> {
  private final Provider<Api> apiProvider;

  public RemoteDataList_Factory(Provider<Api> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public RemoteDataList get() {
    return newInstance(apiProvider.get());
  }

  public static RemoteDataList_Factory create(Provider<Api> apiProvider) {
    return new RemoteDataList_Factory(apiProvider);
  }

  public static RemoteDataList newInstance(Api api) {
    return new RemoteDataList(api);
  }
}
