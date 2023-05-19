import java.util.Scanner;

public class circle implements Shape {
	Scanner scanner=new Scanner(System.in);
	float radius=scanner.nextFloat();
	@Override
	public float  area() {
		
		
		float area=(float) (radius*radius*3.14);
		return area;
	
	
	}

	@Override
	public float perimeter() {
		
		float perimeter=(float) (2*3.14*radius);
		return perimeter;
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the radius of circle to find area ::");
		circle aoc=new circle();
		System.out.println("the perimeter is::"+aoc.perimeter());
		System.out.println("the area of circle is ::"+aoc.area());

		

	}




}
