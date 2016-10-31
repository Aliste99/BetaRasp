package com.example.thirtyseven.betarasp;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Lesson
{
  private Integer LessonNumber;
  private String objectId;
  private java.util.Date updated;
  private java.util.Date created;
  private String ownerId;
  private java.util.Date DateOfLesson;
  private Subject lessonName;
  private java.util.List<Teachers> lessonTeacher;
  private java.util.List<LectureHall> lessonLectureHall;
  private Weekday lessonWeekday;
  public Integer getLessonNumber()
  {
    return LessonNumber;
  }

  public void setLessonNumber( Integer LessonNumber )
  {
    this.LessonNumber = LessonNumber;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getDateOfLesson()
  {
    return DateOfLesson;
  }

  public void setDateOfLesson( java.util.Date DateOfLesson )
  {
    this.DateOfLesson = DateOfLesson;
  }

  public Subject getLessonName()
  {
    return lessonName;
  }

  public void setLessonName( Subject lessonName )
  {
    this.lessonName = lessonName;
  }

  public java.util.List<Teachers> getLessonTeacher()
  {
    return lessonTeacher;
  }

  public void setLessonTeacher( java.util.List<Teachers> lessonTeacher )
  {
    this.lessonTeacher = lessonTeacher;
  }

  public java.util.List<LectureHall> getLessonLectureHall()
  {
    return lessonLectureHall;
  }

  public void setLessonLectureHall( java.util.List<LectureHall> lessonLectureHall )
  {
    this.lessonLectureHall = lessonLectureHall;
  }

  public Weekday getLessonWeekday()
  {
    return lessonWeekday;
  }

  public void setLessonWeekday( Weekday lessonWeekday )
  {
    this.lessonWeekday = lessonWeekday;
  }

                                                    
  public Lesson save()
  {
    return Backendless.Data.of( Lesson.class ).save( this );
  }

  public Future<Lesson> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Lesson> future = new Future<Lesson>();
      Backendless.Data.of( Lesson.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Lesson> callback )
  {
    Backendless.Data.of( Lesson.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Lesson.class ).remove( this );
  }

  public Future<Long> removeAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Long> future = new Future<Long>();
      Backendless.Data.of( Lesson.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Lesson.class ).remove( this, callback );
  }

  public static Lesson findById( String id )
  {
    return Backendless.Data.of( Lesson.class ).findById( id );
  }

  public static Future<Lesson> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Lesson> future = new Future<Lesson>();
      Backendless.Data.of( Lesson.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Lesson> callback )
  {
    Backendless.Data.of( Lesson.class ).findById( id, callback );
  }

  public static Lesson findFirst()
  {
    return Backendless.Data.of( Lesson.class ).findFirst();
  }

  public static Future<Lesson> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Lesson> future = new Future<Lesson>();
      Backendless.Data.of( Lesson.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Lesson> callback )
  {
    Backendless.Data.of( Lesson.class ).findFirst( callback );
  }

  public static Lesson findLast()
  {
    return Backendless.Data.of( Lesson.class ).findLast();
  }

  public static Future<Lesson> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Lesson> future = new Future<Lesson>();
      Backendless.Data.of( Lesson.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Lesson> callback )
  {
    Backendless.Data.of( Lesson.class ).findLast( callback );
  }

  public static BackendlessCollection<Lesson> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Lesson.class ).find( query );
  }

  public static Future<BackendlessCollection<Lesson>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Lesson>> future = new Future<BackendlessCollection<Lesson>>();
      Backendless.Data.of( Lesson.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Lesson>> callback )
  {
    Backendless.Data.of( Lesson.class ).find( query, callback );
  }
}