package in.co.air.line.ticket.exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 * 
 * @author Harshad Kalantri
 * @version 1.5
 * @Copyright (c) Harshad Kalantri
 * 
 */

public class ApplicationException  extends Exception
{
	/**
	 * @param msg
	 *            : Error message
	 */
	public ApplicationException(String msg) {
		super(msg);
	}
}
