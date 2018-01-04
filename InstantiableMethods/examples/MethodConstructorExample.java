import net.pinefree.methods.MethodConstructor;
import net.pinefree.methods.GenericInstanceMethod;

public class MethodConstructorExample {
  
  public static void main(String[] args) {
	  //MethodConstructor automatically detects what your InstanceMethod is based on the arguments and returns a method object.
	  MethodConstructor.implement("test", () -> {
		  System.out.println("Hello!");
	  }).run();
	  
	  GenericInstanceMethod<Integer> method = MethodConstructor.implement("test", () -> {
		  return 5;
	  });
	  
	  System.out.println(method.run());
  }
}

//OUTPUT: Hello!
//        5
