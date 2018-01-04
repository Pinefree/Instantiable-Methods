package net.pinefree.methods;

import net.pinefree.implementations.VoidImplementation;

public class VoidInstanceMethod
{
	private String name;
	private VoidImplementation implementation;
	
	public VoidInstanceMethod(String name, VoidImplementation implementation)
	{
		this.name = name;
		this.implementation = implementation;
	}
	
	public String getName()
	{
		return name;
	}
	
	public VoidImplementation getImplementation()
	{
		return implementation;
	}
	
	public void run()
	{
		implementation.method();
	}
	
	@Override
	public boolean equals(Object object)
	{
		if(object instanceof GenericInstanceMethod<?>)
			return ((GenericInstanceMethod<?>) object).getName().equals(getName());
		else if(object instanceof VoidInstanceMethod)
			return ((VoidInstanceMethod) object).getName().equals(getName());
		else if(object instanceof String)
			return ((String) object).equals(getName());
		
		return false;
	}
}