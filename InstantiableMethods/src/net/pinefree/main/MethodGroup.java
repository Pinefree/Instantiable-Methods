package net.pinefree.main;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodGroup 
{
	private ArrayList<Method> methods;
	
	public MethodGroup()
	{
		methods = new ArrayList<Method>();
	}
	
	public MethodGroup(ArrayList<Method> methods)
	{
		this.methods = methods;
	}
	
	public MethodGroup(Method... methods)
	{
		this.methods = new ArrayList<Method>(Arrays.asList(methods));
	}
	
	public void add(Method method)
	{
		methods.add(method);
	}
	
	public void add(String name, Implementation implementation)
	{
		methods.add(new Method(name, implementation));
	}
	
	public Method get(String name) throws NoSuchMethodException
	{
		for(Method method : methods)
		{
			if(method.getName().equals(name))
			{
				return method;
			}
		}
		
		throw new NoSuchMethodException("The method \""+name+"\" in (Object)Method does not exist.");
	}
	
	public	void remove(String name) throws NoSuchMethodException
	{
		for(Method method : methods)
		{
			if(method.getName().equals(name))
			{
				methods.remove(method);
				return;
			}
		}
		
		throw new NoSuchMethodException("The method \""+name+"\" in (Object)Method does not exist.");
	}
	
	public void run(String name) throws NoSuchMethodException
	{		
		for(Method command : methods) 
		{
			if(command.getName().equals(name))
			{
				command.run();
				return;
			}
		}
		
		throw new NoSuchMethodException("The method \""+name+"\" in (Object)Method does not exist.");
	}
	
	public int length()
	{
		return methods.size();
	}
	
	public ArrayList<Method> getArrayList()
	{
		return methods;
	}
}