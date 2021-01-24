package in.co.air.line.ticket.exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 * 
 * @author Harshad Kalantri
 * @version 1.0
 * @Copyright (c) Harshad Kalantri
 * 
 */

public class ApplicationException  extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param msg
	 *            : Error message
	 */
	public ApplicationException(String msg) {
		super(msg);
	}
}
