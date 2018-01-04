# Instantiable Methods for Java
Instantiable methods for Java is a small library which allows methods to be implemented using lambda functions into Method Objects. These methods contained inside of Objects are technically "instantiable," and can be removed from the program entirely or overwritten during runtime. There is also a MethodGroup Object included within the library which has basic functionality for running, locating, adding, and removing methods. The applications of this are very general, however, as an example; I've used this for cleanly managing a command line argument parser.

```
public class Main 
{
	public static void main(String... args) 
	{
		MethodList methods = new MethodList();
		
		methods.add("hi", () ->
		{
			System.out.println("Hello!");
		});
		
		methods.runVoid(args[0]);
	}
}
```
If the user were to type "hi" as a command line argument, when the program runs the function will be called and output "Hello!" to the system console.

I've uploaded this to github because I have used it personally for a while now. So, I've decided to leave it here in case anyone else might use it, or (mainly) if I need to download this to another computer to use.

## Help
Right now I have examples [here](https://github.com/Pinefree/Instantiable-Methods/tree/master/InstantiableMethods/examples) that basically show how to set it all up. I plan on add ing a small doc for Eclipse (by commenting the code). So when you hover over methods it will give you a description and use.

## Plans
I'm going to try and make the MethodList better as right now it's not as user-friendly as I'd like. I'm also going to try using either abstract classes or a fake struct to try and bring both non-returnable and returnable methods into one class. Originally I had planned on just returning a type of Void, but that wasn't *really* returning nothing.
