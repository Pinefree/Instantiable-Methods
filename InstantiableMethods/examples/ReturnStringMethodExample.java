import net.pinefree.methods.GenericInstanceMethod;

public class ReturnStringMethodExample {
  
  public static void main(String[] args) {
	  //It's better to use a method list and MethodConstructor but this is just an example.
	  GenericInstanceMethod<String> method = new GenericInstanceMethod<String>("test", () -> {
		  return "Testing...";
	  });
	  
	  System.out.println(method.run());
  }
}

//OUTPUT: Testing...