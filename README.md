# Instantiable Methods for Java
Instantiable methods for Java is a small library which allows methods to be implemented using lambda functions into Method Objects. These methods contained inside of Objects are technically "instantiable," and can be removed from the program entirely or overwritten during runtime. There is also a MethodGroup Object included within the library which has basic functionality for running, locating, adding, and removing methods. The applications of this are very general, however, as an example; I've used this for cleanly managing a command line argument parser.

```
public class Main 
{
	public static void main(String... args) 
	{
		MethodGroup methods = new MethodGroup();
		
		methods.add("hi", () ->
		{
			System.out.println("Hello!");
		});
		
		methods.run(args[0]);
	}
}
```
If the user were to type "hi" as a command line argument, when the program runs the function will be called and output "Hello!" to the system console.

I've uploaded this to github because I have used it personally for a while now. So, I've decided to leave it here in case anyone else might use it, or (mainly) if I need to download this to another computer to use.
