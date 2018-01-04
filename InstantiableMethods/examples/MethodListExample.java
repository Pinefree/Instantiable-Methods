import net.pinefree.exceptions.DuplicateMethodException;
import net.pinefree.methods.MethodConstructor;
import net.pinefree.methods.MethodList;

public class MethodListExample {
  
  public static void main(String[] args) throws DuplicateMethodException, NoSuchMethodException {
	  //MethodLists organize your methods and let you run them by name. Method overloading is not supported.
	  MethodList methods = new MethodList();
	  
	  methods.add(MethodConstructor.implement("method1", () -> {
		  System.out.println("This is method1!");
	  }));
	  
	  methods.add(MethodConstructor.implement("method2", () -> {
		  System.out.println("This is method2!");
	  }));
	  
	  methods.add(MethodConstructor.implement("method3", () -> {
		  return true;
	  }));
	  
	  methods.runVoid("method1");
	  methods.runVoid("method2");
	  System.out.println(methods.runReturn("method3"));
  }
}

//OUTPUT: This is method1!
//        This is method2!
//        true