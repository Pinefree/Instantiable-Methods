package net.pinefree.exceptions;

public class DuplicateMethodException extends Exception {
	private static final long serialVersionUID = 3806025646362323436L;
	
	public DuplicateMethodException(String message)
	{
		super(message);
	}
}
