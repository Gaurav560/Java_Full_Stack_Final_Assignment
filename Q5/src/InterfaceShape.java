
import java.io.*;

// Interface
interface Shape {

	// Abstract method
	void draw();
	double area();
}

// Class 1
// Helper class
class Rectangle implements Shape {

	int length, width;

	// constructor
	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}

	@Override public void draw()
	{
		System.out.println("Rectangle has been drawn ");
	}

	@Override public double area()
	{
		return (double)(length * width);
	}
}



// Class 2
// Main class
class InterfaceShape {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating the Object of Rectangle class
		// and using shape interface reference.
		Shape rect = new Rectangle(2, 3);

		System.out.println("Area of rectangle: "
						+ rect.area());

	}
}





//difference::
//Abstract class::
/*
 * Can have access modifier Can declare constructors and destructors

 *  Can have data fields Can have any type of class member (e.g., public, private,

 * protected) Users can define both fields and constants Extends just one class
  or one abstract class at a time. Can extend another regular (or concrete)class. 
 
 * Faster than the interface Abstract keyword used to declare the
  abstract class. Also, the abstract class can be extended by using the keyword

 * “extends” Can have abstract and non-abstract methods. Can have default method
 
 * implementation Use when several implementations of the same type share common
  behavior, Additionally, use it if you require a base class.
  
   
  * Can have final,non-final, static, and non-static variables Abstract methods only 
   
   *Can have abstract and non-abstract methods. Can have default method implementation
 */

//interface
/*
 * Does not have access modifiers, and everything defined inside is assumed to
 
 * be a public modifier Cannot declare constructors or destructors Cannot have
 
 * data fields Can only have public members, by default Cannot define fields Can
 
 * extend any number of interfaces. However, it can only extend interfaces.
 
 * Interface is slower and requires extra indirection or dereferencing Cannot be
 
 * instantiated, as it is absolutely abstract Interface keyword used to declare

 * interface. Also, interface can be implemented by using the keyword
 
 * “implements” Can only have abstract methods, though, since Java 8, it can
 
 * also have static and default methods. Cannot have implementation due to
 
 * interfaces providing pure abstraction Can implement several interfaces Can
 
 * only have final and static variables Best used when various implementations
 
 * share only method signature. Also, a good choice when your classes need
 additional behavior or dependency injection.
 */
