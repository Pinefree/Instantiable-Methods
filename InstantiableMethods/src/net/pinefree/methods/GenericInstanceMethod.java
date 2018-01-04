package net.pinefree.methods;

import net.pinefree.implementations.GenericImplementation;

public class GenericInstanceMethod<Generic>
{
	private String name;
	private GenericImplementation<Generic> implementation;
	
	public GenericInstanceMethod(String name, GenericImplementation<Generic> implementation)
	{
		this.name = name;
		this.implementation = implementation;
	}

	public String getName()
	{
		return name;
	}
	
	public GenericImplementation<Generic> getImplementation()
	{
		return implementation;
	}
	
	public Generic run()
	{		
		return (Generic) implementation.method();
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