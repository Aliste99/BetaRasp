package com.example.thirtyseven.betarasp;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Subject
{
  private java.util.Date updated;
  private java.util.Date created;
  private String ownerId;
  private String name;
  private String objectId;
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

  public String getName()
  {
    return name;
  }

  public void setName( String name )
  {
    this.name = name;
  }

  public String getObjectId()
  {
    return objectId;
  }

                                                    
  public Subject save()
  {
    return Backendless.Data.of( Subject.class ).save( this );
  }

  public Future<Subject> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Subject> future = new Future<Subject>();
      Backendless.Data.of( Subject.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Subject> callback )
  {
    Backendless.Data.of( Subject.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Subject.class ).remove( this );
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
      Backendless.Data.of( Subject.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Subject.class ).remove( this, callback );
  }

  public static Subject findById( String id )
  {
    return Backendless.Data.of( Subject.class ).findById( id );
  }

  public static Future<Subject> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Subject> future = new Future<Subject>();
      Backendless.Data.of( Subject.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Subject> callback )
  {
    Backendless.Data.of( Subject.class ).findById( id, callback );
  }

  public static Subject findFirst()
  {
    return Backendless.Data.of( Subject.class ).findFirst();
  }

  public static Future<Subject> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Subject> future = new Future<Subject>();
      Backendless.Data.of( Subject.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Subject> callback )
  {
    Backendless.Data.of( Subject.class ).findFirst( callback );
  }

  public static Subject findLast()
  {
    return Backendless.Data.of( Subject.class ).findLast();
  }

  public static Future<Subject> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Subject> future = new Future<Subject>();
      Backendless.Data.of( Subject.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Subject> callback )
  {
    Backendless.Data.of( Subject.class ).findLast( callback );
  }

  public static BackendlessCollection<Subject> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Subject.class ).find( query );
  }

  public static Future<BackendlessCollection<Subject>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Subject>> future = new Future<BackendlessCollection<Subject>>();
      Backendless.Data.of( Subject.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Subject>> callback )
  {
    Backendless.Data.of( Subject.class ).find( query, callback );
  }
}