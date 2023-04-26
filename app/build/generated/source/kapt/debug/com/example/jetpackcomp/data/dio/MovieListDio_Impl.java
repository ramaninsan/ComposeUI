package com.example.jetpackcomp.data.dio;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.jetpackcomp.model.MovieDetails;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieListDio_Impl extends MovieListDio {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieDetails> __insertionAdapterOfMovieDetails;

  public MovieListDio_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieDetails = new EntityInsertionAdapter<MovieDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movie_list` (`id`,`adult`,`backdropPath`,`originalLanguage`,`originalTitle`,`overview`,`popularity`,`posterPath`,`releaseDate`,`title`,`video`,`voteAverage`,`voteCount`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieDetails value) {
        stmt.bindLong(1, value.getId());
        final int _tmp = value.getAdult() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        if (value.getBackdropPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBackdropPath());
        }
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOriginalLanguage());
        }
        if (value.getOriginalTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOriginalTitle());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOverview());
        }
        stmt.bindDouble(7, value.getPopularity());
        if (value.getPosterPath() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPosterPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getReleaseDate());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTitle());
        }
        final int _tmp_1 = value.getVideo() ? 1 : 0;
        stmt.bindLong(11, _tmp_1);
        stmt.bindDouble(12, value.getVoteAverage());
        stmt.bindLong(13, value.getVoteCount());
      }
    };
  }

  @Override
  public Object saveMovieList(final List<MovieDetails> movieDetails,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieDetails.insert(movieDetails);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<MovieDetails>> getMovieList() {
    final String _sql = "Select * From movie_list";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movie_list"}, new Callable<List<MovieDetails>>() {
      @Override
      public List<MovieDetails> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "originalLanguage");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "originalTitle");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final List<MovieDetails> _result = new ArrayList<MovieDetails>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieDetails _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final boolean _tmpAdult;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAdult);
            _tmpAdult = _tmp != 0;
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final String _tmpOriginalLanguage;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginalLanguage = null;
            } else {
              _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginalTitle;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginalTitle = null;
            } else {
              _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final boolean _tmpVideo;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfVideo);
            _tmpVideo = _tmp_1 != 0;
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final long _tmpVoteCount;
            _tmpVoteCount = _cursor.getLong(_cursorIndexOfVoteCount);
            _item = new MovieDetails(_tmpId,_tmpAdult,_tmpBackdropPath,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpVoteCount);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<MovieDetails> getMovieDetailsByID(final long movieID) {
    final String _sql = "Select * From movie_list Where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, movieID);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movie_list"}, new Callable<MovieDetails>() {
      @Override
      public MovieDetails call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "originalLanguage");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "originalTitle");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "voteCount");
          final MovieDetails _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final boolean _tmpAdult;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfAdult);
            _tmpAdult = _tmp != 0;
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final String _tmpOriginalLanguage;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginalLanguage = null;
            } else {
              _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginalTitle;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginalTitle = null;
            } else {
              _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final boolean _tmpVideo;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfVideo);
            _tmpVideo = _tmp_1 != 0;
            final double _tmpVoteAverage;
            _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            final long _tmpVoteCount;
            _tmpVoteCount = _cursor.getLong(_cursorIndexOfVoteCount);
            _result = new MovieDetails(_tmpId,_tmpAdult,_tmpBackdropPath,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpOverview,_tmpPopularity,_tmpPosterPath,_tmpReleaseDate,_tmpTitle,_tmpVideo,_tmpVoteAverage,_tmpVoteCount);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
