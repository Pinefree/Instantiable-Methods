import net.pinefree.methods.VoidInstanceMethod;

public class VoidMethodExample {
  
  public static void main(String[] args) {
	  //It's better to use a method list and MethodConstructor but this is just an example.
	  VoidInstanceMethod method = new VoidInstanceMethod("test", () -> {
		  System.out.println("Testing...");
	  });
	  
	  method.runVoid();
  }
}

//OUTPUT: Testing...
