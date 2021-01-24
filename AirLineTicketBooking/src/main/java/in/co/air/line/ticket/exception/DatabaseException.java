package in.co.air.line.ticket.exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 *
 * @author Harshad Kalantri
 * @version 1.5
 * @Copyright (c) Harshad Kalantri
 *
 */

public class DatabaseException  extends Exception
{
	/**
    * @param msg
    *            : Error message
    */
   public DatabaseException(String msg) {
       super(msg);
   }
}

