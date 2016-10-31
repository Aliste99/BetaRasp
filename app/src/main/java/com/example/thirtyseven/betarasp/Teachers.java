package com.example.thirtyseven.betarasp;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Teachers
{
  private String objectId;
  private String LastName;
  private String ownerId;
  private java.util.Date created;
  private String FirstName;
  private String SecondName;
  private java.util.Date updated;
  public String getObjectId()
  {
    return objectId;
  }

  public String getLastName()
  {
    return LastName;
  }

  public void setLastName( String LastName )
  {
    this.LastName = LastName;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getFirstName()
  {
    return FirstName;
  }

  public void setFirstName( String FirstName )
  {
    this.FirstName = FirstName;
  }

  public String getSecondName()
  {
    return SecondName;
  }

  public void setSecondName( String SecondName )
  {
    this.SecondName = SecondName;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

                                                    
  public Teachers save()
  {
    return Backendless.Data.of( Teachers.class ).save( this );
  }

  public Future<Teachers> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Teachers> future = new Future<Teachers>();
      Backendless.Data.of( Teachers.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Teachers> callback )
  {
    Backendless.Data.of( Teachers.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Teachers.class ).remove( this );
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
      Backendless.Data.of( Teachers.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Teachers.class ).remove( this, callback );
  }

  public static Teachers findById( String id )
  {
    return Backendless.Data.of( Teachers.class ).findById( id );
  }

  public static Future<Teachers> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Teachers> future = new Future<Teachers>();
      Backendless.Data.of( Teachers.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Teachers> callback )
  {
    Backendless.Data.of( Teachers.class ).findById( id, callback );
  }

  public static Teachers findFirst()
  {
    return Backendless.Data.of( Teachers.class ).findFirst();
  }

  public static Future<Teachers> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Teachers> future = new Future<Teachers>();
      Backendless.Data.of( Teachers.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Teachers> callback )
  {
    Backendless.Data.of( Teachers.class ).findFirst( callback );
  }

  public static Teachers findLast()
  {
    return Backendless.Data.of( Teachers.class ).findLast();
  }

  public static Future<Teachers> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Teachers> future = new Future<Teachers>();
      Backendless.Data.of( Teachers.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Teachers> callback )
  {
    Backendless.Data.of( Teachers.class ).findLast( callback );
  }

  public static BackendlessCollection<Teachers> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Teachers.class ).find( query );
  }

  public static Future<BackendlessCollection<Teachers>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Teachers>> future = new Future<BackendlessCollection<Teachers>>();
      Backendless.Data.of( Teachers.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Teachers>> callback )
  {
    Backendless.Data.of( Teachers.class ).find( query, callback );
  }
}