package com.sun.corba.se.spi.activation.LocatorPackage;


/**
* com/sun/corba/se/spi/activation/LocatorPackage/ServerLocationPerORB.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from d:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u92/6642/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, March 31, 2016 9:04:29 PM PDT
*/

public final class ServerLocationPerORB implements org.omg.CORBA.portable.IDLEntity
{
  public String hostname = null;
  public com.sun.corba.se.spi.activation.EndPointInfo ports[] = null;

  public ServerLocationPerORB ()
  {
  } // ctor

  public ServerLocationPerORB (String _hostname, com.sun.corba.se.spi.activation.EndPointInfo[] _ports)
  {
    hostname = _hostname;
    ports = _ports;
  } // ctor

} // class ServerLocationPerORB
