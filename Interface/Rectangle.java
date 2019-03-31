//package myPackage;

class Rectangle implements GeoObjects
{
	protected double l,w;
	
	public Rectangle()
	{
		l=1.0;
		w=1.0;
	}
	public Rectangle(double length,double width)
	{
		this.l=length;
		this.w=width;
	}
	public double area()
	{
		return l*w;
	}
	public double perimeter()
	{
		return 2*(l+w);
	}
	public double getWidth(){return w;}
	public double getLength(){ return l;}
}