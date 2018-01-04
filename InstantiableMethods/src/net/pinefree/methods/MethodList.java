package net.pinefree.methods;

import java.util.ArrayList;

import net.pinefree.exceptions.DuplicateMethodException;

public class MethodList 
{
	private ArrayList<GenericInstanceMethod<?>> genericMethods = new ArrayList<GenericInstanceMethod<?>>();
	private ArrayList<VoidInstanceMethod> voidMethods = new ArrayList<VoidInstanceMethod>();
	
	public MethodList()
	{
		
	}
	
	public <Generic> void add(GenericInstanceMethod<Generic> method) throws DuplicateMethodException
	{
		if(genericMethods.contains(method))
		{
			throw new DuplicateMethodException("Method overloading is not supported. The method \""+method.getName()+"\" already exists.");
		}
		
		genericMethods.add(method);
	}
	
	public void add(VoidInstanceMethod method) throws DuplicateMethodException
	{
		if(voidMethods.contains(method))
		{
			throw new DuplicateMethodException("Method overloading is not supported. The method \""+method.getName()+"\" already exists.");
		}
		
		voidMethods.add(method);
	}
	
	public <Generic> void remove(String name) throws NoSuchMethodException
	{
		for(GenericInstanceMethod<?> method : genericMethods)
		{
			if(method.getName().equals(name))
			{
				genericMethods.remove(method);
				return;
			}
		}
		
		for(VoidInstanceMethod method : voidMethods)
		{
			if(method.getName().equals(name))
			{
				voidMethods.remove(method);
				return;
			}
		}
		
		throw new NoSuchMethodException("The method \""+name+"\" could not be removed.");
	}
	
	public void runVoid(String name) throws NoSuchMethodException
	{		
		for(VoidInstanceMethod method : voidMethods)
		{
			if(method.getName().equals(name))
			{
				method.run();
				return;
			}
		}
		
		throw new NoSuchMethodException("The method \""+name+"\" could not run.");
	}
		
	public Object runReturn(String name) throws NoSuchMethodException
	{
		for(GenericInstanceMethod<?> method : genericMethods)
		{
			if(method.getName().equals(name))
			{
				return method.run();
			}
		}
		
		throw new NoSuchMethodException("The method \""+name+"\" could not run.");
	}
	
	public int length()
	{
		return genericMethods.size() + voidMethods.size();
	}
}