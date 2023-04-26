// Generated by Dagger (https://dagger.dev).
package com.example.jetpackcomp.data.datasource.popularmovies;

import com.example.jetpackcomp.model.room.JPDatabase;
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
public final class LocalDataList_Factory implements Factory<LocalDataList> {
  private final Provider<JPDatabase> dbProvider;

  public LocalDataList_Factory(Provider<JPDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public LocalDataList get() {
    return newInstance(dbProvider.get());
  }

  public static LocalDataList_Factory create(Provider<JPDatabase> dbProvider) {
    return new LocalDataList_Factory(dbProvider);
  }

  public static LocalDataList newInstance(JPDatabase db) {
    return new LocalDataList(db);
  }
}
