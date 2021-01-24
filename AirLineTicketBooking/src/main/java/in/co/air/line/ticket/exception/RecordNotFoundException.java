package in.co.air.line.ticket.exception;

/**
 * RecordNotFoundException thrown when a record not found occurred
 * 
 * @author Harshad Kalantri
 * @version 1.5
 * @Copyright (c) Harshad Kalantri
 * 
 */

public class RecordNotFoundException extends Exception
{

	/**
	 * @param msg
	 *            error message
	 */
	public RecordNotFoundException(String msg) {
		super(msg);

	}
}
