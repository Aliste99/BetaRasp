package com.example.thirtyseven.betarasp;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Group
{
  private String ownerId;
  private Integer Course;
  private String objectId;
  private String Name;
  private java.util.Date updated;
  private java.util.Date created;
  private java.util.List<Lesson> GroupLesson;
  public String getOwnerId()
  {
    return ownerId;
  }

  public Integer getCourse()
  {
    return Course;
  }

  public void setCourse( Integer Course )
  {
    this.Course = Course;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getName()
  {
    return Name;
  }

  public void setName( String Name )
  {
    this.Name = Name;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public java.util.List<Lesson> getGroupLesson()
  {
    return GroupLesson;
  }

  public void setGroupLesson( java.util.List<Lesson> GroupLesson )
  {
    this.GroupLesson = GroupLesson;
  }

                                                    
  public Group save()
  {
    return Backendless.Data.of( Group.class ).save( this );
  }

  public Future<Group> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Group> future = new Future<Group>();
      Backendless.Data.of( Group.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Group> callback )
  {
    Backendless.Data.of( Group.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Group.class ).remove( this );
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
      Backendless.Data.of( Group.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Group.class ).remove( this, callback );
  }

  public static Group findById( String id )
  {
    return Backendless.Data.of( Group.class ).findById( id );
  }

  public static Future<Group> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Group> future = new Future<Group>();
      Backendless.Data.of( Group.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Group> callback )
  {
    Backendless.Data.of( Group.class ).findById( id, callback );
  }

  public static Group findFirst()
  {
    return Backendless.Data.of( Group.class ).findFirst();
  }

  public static Future<Group> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Group> future = new Future<Group>();
      Backendless.Data.of( Group.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Group> callback )
  {
    Backendless.Data.of( Group.class ).findFirst( callback );
  }

  public static Group findLast()
  {
    return Backendless.Data.of( Group.class ).findLast();
  }

  public static Future<Group> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Group> future = new Future<Group>();
      Backendless.Data.of( Group.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Group> callback )
  {
    Backendless.Data.of( Group.class ).findLast( callback );
  }

  public static BackendlessCollection<Group> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Group.class ).find( query );
  }

  public static Future<BackendlessCollection<Group>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Group>> future = new Future<BackendlessCollection<Group>>();
      Backendless.Data.of( Group.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Group>> callback )
  {
    Backendless.Data.of( Group.class ).find( query, callback );
  }
}