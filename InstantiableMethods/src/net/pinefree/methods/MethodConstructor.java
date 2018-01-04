package net.pinefree.methods;

import net.pinefree.implementations.GenericImplementation;
import net.pinefree.implementations.VoidImplementation;

public final class MethodConstructor 
{
	private MethodConstructor() 
	{
		
	}
	
	public static VoidInstanceMethod implement(String name, VoidImplementation implementation)
	{
		return new VoidInstanceMethod(name, implementation);
	}
	
	public static <Generic> GenericInstanceMethod<Generic> implement(String name, GenericImplementation<Generic> implementation)
	{
		return new GenericInstanceMethod<Generic>(name, implementation);
	}
}