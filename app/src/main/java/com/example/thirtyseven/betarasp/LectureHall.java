package com.example.thirtyseven.betarasp;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class LectureHall
{
  private Integer Number;
  private String ownerId;
  private java.util.Date updated;
  private String objectId;
  private java.util.Date created;
  private Integer Floor;
  public Integer getNumber()
  {
    return Number;
  }

  public void setNumber( Integer Number )
  {
    this.Number = Number;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public Integer getFloor()
  {
    return Floor;
  }

  public void setFloor( Integer Floor )
  {
    this.Floor = Floor;
  }

                                                    
  public LectureHall save()
  {
    return Backendless.Data.of( LectureHall.class ).save( this );
  }

  public Future<LectureHall> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<LectureHall> future = new Future<LectureHall>();
      Backendless.Data.of( LectureHall.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<LectureHall> callback )
  {
    Backendless.Data.of( LectureHall.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( LectureHall.class ).remove( this );
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
      Backendless.Data.of( LectureHall.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( LectureHall.class ).remove( this, callback );
  }

  public static LectureHall findById( String id )
  {
    return Backendless.Data.of( LectureHall.class ).findById( id );
  }

  public static Future<LectureHall> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<LectureHall> future = new Future<LectureHall>();
      Backendless.Data.of( LectureHall.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<LectureHall> callback )
  {
    Backendless.Data.of( LectureHall.class ).findById( id, callback );
  }

  public static LectureHall findFirst()
  {
    return Backendless.Data.of( LectureHall.class ).findFirst();
  }

  public static Future<LectureHall> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<LectureHall> future = new Future<LectureHall>();
      Backendless.Data.of( LectureHall.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<LectureHall> callback )
  {
    Backendless.Data.of( LectureHall.class ).findFirst( callback );
  }

  public static LectureHall findLast()
  {
    return Backendless.Data.of( LectureHall.class ).findLast();
  }

  public static Future<LectureHall> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<LectureHall> future = new Future<LectureHall>();
      Backendless.Data.of( LectureHall.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<LectureHall> callback )
  {
    Backendless.Data.of( LectureHall.class ).findLast( callback );
  }

  public static BackendlessCollection<LectureHall> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( LectureHall.class ).find( query );
  }

  public static Future<BackendlessCollection<LectureHall>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<LectureHall>> future = new Future<BackendlessCollection<LectureHall>>();
      Backendless.Data.of( LectureHall.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<LectureHall>> callback )
  {
    Backendless.Data.of( LectureHall.class ).find( query, callback );
  }
}