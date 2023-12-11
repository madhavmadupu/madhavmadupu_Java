package Week3;
import java.util.Scanner;
abstract class Shape {
	int length,breadth,radius,base,height;
	Scanner input=new Scanner(System.in);
	abstract void printArea();
}

class Rectangle extends Shape
{
	void printArea()
	{
		System.out.println("Finding area of rectangle:");
		System.out.println("Enter length and breadth:");
		length=input.nextInt();
		breadth=input.nextInt();
		System.out.println("The area of the rectangle is"+length*breadth);
	}
}
class Triangle extends Shape
{
	void printArea()
	{
		System.out.println("Finding area of Triangle:");
		System.out.println("Enter base and height ");
		base=input.nextInt();
		height=input.nextInt();
		System.out.println("The area of the triangle is "+(0.5*base*height));
	}
}
class Circle extends Shape
{
	void printArea()
	{
		System.out.println("Finding area of Circle:");
		System.out.println("Enter radius:");
		radius=input.nextInt();
		System.out.println("The area of the Circle is"+(3.14*radius*radius));
	}
	public static void main(String[] args) {
		Shape obj=new Rectangle();
		obj.printArea();
		obj=new Circle();
		obj.printArea();
	}
}
