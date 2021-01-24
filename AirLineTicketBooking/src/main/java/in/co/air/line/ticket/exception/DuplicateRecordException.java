package in.co.air.line.ticket.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred
 * 
 * @author Harshad Kalantri
 * @version 1.5
 * @Copyright (c) Harshad Kalantri
 * 
 */
public class DuplicateRecordException  extends Exception
{
	/**
	 * @param msg
	 *            error message
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}
}
