package com.example.thirtyseven.betarasp;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Weekday
{
  private java.util.Date updated;
  private String Day;
  private String objectId;
  private java.util.Date created;
  private String ownerId;
  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getDay()
  {
    return Day;
  }

  public void setDay( String Day )
  {
    this.Day = Day;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

                                                    
  public Weekday save()
  {
    return Backendless.Data.of( Weekday.class ).save( this );
  }

  public Future<Weekday> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Weekday> future = new Future<Weekday>();
      Backendless.Data.of( Weekday.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Weekday> callback )
  {
    Backendless.Data.of( Weekday.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Weekday.class ).remove( this );
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
      Backendless.Data.of( Weekday.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Weekday.class ).remove( this, callback );
  }

  public static Weekday findById( String id )
  {
    return Backendless.Data.of( Weekday.class ).findById( id );
  }

  public static Future<Weekday> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Weekday> future = new Future<Weekday>();
      Backendless.Data.of( Weekday.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Weekday> callback )
  {
    Backendless.Data.of( Weekday.class ).findById( id, callback );
  }

  public static Weekday findFirst()
  {
    return Backendless.Data.of( Weekday.class ).findFirst();
  }

  public static Future<Weekday> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Weekday> future = new Future<Weekday>();
      Backendless.Data.of( Weekday.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Weekday> callback )
  {
    Backendless.Data.of( Weekday.class ).findFirst( callback );
  }

  public static Weekday findLast()
  {
    return Backendless.Data.of( Weekday.class ).findLast();
  }

  public static Future<Weekday> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Weekday> future = new Future<Weekday>();
      Backendless.Data.of( Weekday.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Weekday> callback )
  {
    Backendless.Data.of( Weekday.class ).findLast( callback );
  }

  public static BackendlessCollection<Weekday> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Weekday.class ).find( query );
  }

  public static Future<BackendlessCollection<Weekday>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Weekday>> future = new Future<BackendlessCollection<Weekday>>();
      Backendless.Data.of( Weekday.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Weekday>> callback )
  {
    Backendless.Data.of( Weekday.class ).find( query, callback );
  }
}