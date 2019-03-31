//import myPackage.*;
//package myPackage;
class Utility
{
	public static void main(String args[])
	{
		GeoObjects geo;
		geo=new Circle(10.0);
		display(geo.area(),geo.perimeter());
		geo=new Ellipse(10.2,5.2);
		display(geo.area(),geo.perimeter());
		geo=new Rectangle(10.2,5.2);
		display(geo.area(),geo.perimeter());
	}
	
	static void display(double x,double y)
	{
		System.out.println("Area of Object="+x+"  Perimeter ="+y);
	}
}