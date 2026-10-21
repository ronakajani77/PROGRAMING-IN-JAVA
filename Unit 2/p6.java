abstract class Shape
{
    	String color;

    	public Shape(String color)
	{
        	this.color = color;
    	}

    	abstract double calculateArea();

    	public void display()
	{
        	System.out.println("This is a " + color + " shape.");
    	}
}

class Circle extends Shape
{
    	double radius;

    	public Circle(String color, double radius)
	{
        	super(color);
        	this.radius = radius;
    	}

    	@Override
    	double calculateArea()
	{
        	return Math.PI * radius * radius;
    	}
}

class Rectangle extends Shape
{
    	double length;
    	double width;

    	public Rectangle(String color, double length, double width)
	{
        	super(color);
        	this.length = length;
        	this.width = width;
    	}

    	@Override
    	double calculateArea()
	{
        	return length * width;
    	}
}

public class Main 
{
   	public static void main(String args[])
	{
        	Shape myCircle = new Circle("Red", 5.0);
        	myCircle.display();
        	System.out.println("Area of Circle: " + myCircle.calculateArea());

        	Shape myRectangle = new Rectangle("Blue", 4.0, 6.0);
        	myRectangle.display();
        	System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
    	}
}