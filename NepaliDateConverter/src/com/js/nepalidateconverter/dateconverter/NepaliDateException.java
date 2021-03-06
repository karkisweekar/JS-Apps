package com.js.nepalidateconverter.dateconverter;

/**
 * The Class InvalidNepaliDateException.
 * 
 */
public class NepaliDateException extends Exception {

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new invalid nepali date exception.
	 */
	public NepaliDateException() {
		super();
	}

	/**
	 * Instantiates a new invalid nepali date exception.
	 * 
	 * @param message
	 *            the message
	 */
	public NepaliDateException(final String message) {
		super(message);
	}

	/**
	 * Instantiates a new invalid nepali date exception.
	 * 
	 * @param cause
	 *            the cause
	 */
	public NepaliDateException(final Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new invalid nepali date exception.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public NepaliDateException(final String message, final Throwable cause) {
		super(message, cause);
	}	
	
}