//package myPackage;
class Circle implements GeoObjects
{
	double radius;
	public Circle()
	{
		this.radius=1.0;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*PI*radius;
	}
	public double getRadius()
	{
		return radius;
	}
}