package com.example.jetpackcomp.model.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.jetpackcomp.data.dio.MovieListDio;
import com.example.jetpackcomp.data.dio.MovieListDio_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class JPDatabase_Impl extends JPDatabase {
  private volatile MovieListDio _movieListDio;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movie_list` (`id` INTEGER NOT NULL, `adult` INTEGER NOT NULL, `backdropPath` TEXT NOT NULL, `originalLanguage` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `overview` TEXT NOT NULL, `popularity` REAL NOT NULL, `posterPath` TEXT NOT NULL, `releaseDate` TEXT NOT NULL, `title` TEXT NOT NULL, `video` INTEGER NOT NULL, `voteAverage` REAL NOT NULL, `voteCount` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '693deacfb548f4ad4f767e537feeefdc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movie_list`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovieList = new HashMap<String, TableInfo.Column>(13);
        _columnsMovieList.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("adult", new TableInfo.Column("adult", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("originalLanguage", new TableInfo.Column("originalLanguage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("originalTitle", new TableInfo.Column("originalTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("overview", new TableInfo.Column("overview", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("popularity", new TableInfo.Column("popularity", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("posterPath", new TableInfo.Column("posterPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("video", new TableInfo.Column("video", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieList.put("voteCount", new TableInfo.Column("voteCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieList = new TableInfo("movie_list", _columnsMovieList, _foreignKeysMovieList, _indicesMovieList);
        final TableInfo _existingMovieList = TableInfo.read(_db, "movie_list");
        if (! _infoMovieList.equals(_existingMovieList)) {
          return new RoomOpenHelper.ValidationResult(false, "movie_list(com.example.jetpackcomp.model.MovieDetails).\n"
                  + " Expected:\n" + _infoMovieList + "\n"
                  + " Found:\n" + _existingMovieList);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "693deacfb548f4ad4f767e537feeefdc", "063e32782c3c6b0c3da3918e71807219");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movie_list");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movie_list`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MovieListDio.class, MovieListDio_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public MovieListDio movieDio() {
    if (_movieListDio != null) {
      return _movieListDio;
    } else {
      synchronized(this) {
        if(_movieListDio == null) {
          _movieListDio = new MovieListDio_Impl(this);
        }
        return _movieListDio;
      }
    }
  }
}
