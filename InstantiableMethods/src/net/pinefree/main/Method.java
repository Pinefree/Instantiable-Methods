package net.pinefree.main;

public class Method
{
	private String name;
	private Implementation implementation;
	
	public Method(String name, Implementation implementation)
	{
		this.name = name;
		this.implementation = implementation;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Implementation getImplementation()
	{
		return implementation;
	}
	
	public void run()
	{
		implementation.method();
	}
}