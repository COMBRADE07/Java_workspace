package Assignment_2;

import java.util.Scanner;

abstract class shape
{
	abstract void area();
}

 class circle extends shape
{

	@Override
	void area() {
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radious of circle: ");
		r = sc.nextDouble();
		System.out.println("Area of Circle: "+(3.14*r*r));
		
	}
}

class rectangle extends shape
{

	@Override
	void area() {
		double l,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lenght and bredth: ");
		l = sc.nextDouble();
		b = sc.nextDouble();
		
		System.out.println("Area of rectangle: "+(l*b));
		
	}
	
}

class triangle extends shape
{

	@Override
	void area() {
		double h,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Height and bredth respectively: ");
		h = sc.nextDouble();
		b = sc.nextDouble();
		
		System.out.println("Area of triangle: "+(0.5*(b*h)));
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// calling abstract methods of different class
		
		// for circle
		shape c = new circle();
		c.area();
		
		// for rectangle
		shape r = new rectangle();
		r.area();
		
		// for triangle
		shape t = new triangle();
		t.area();

	}

}
