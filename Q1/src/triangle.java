import java.util.Scanner;

public class triangle implements Shape {
	static float base;
	static float side1;
	static float side2;
	static float height;

	@Override
	public float area() {

		float area = (float) (0.5 * base * height);
		return area;

	}

	@Override
	public float perimeter() {

		float perimeter = (float) (side1 + side2 + base);
		return perimeter;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of side 1 ::");
		 side1 = scanner.nextFloat();
		System.out.println("Enter the length of side 2 ::");
	side2 = scanner.nextFloat();
		System.out.println("Enter the length of base ::");
	base = scanner.nextFloat();
		System.out.println("Enter the length of height ::");
		height = scanner.nextFloat();
		triangle aoc = new triangle();
		System.out.println("the perimeter is::" + aoc.perimeter());
		System.out.println("the area  is ::" + aoc.area());
		scanner.close();

	}

}
