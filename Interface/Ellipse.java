//package myPackage;
class Ellipse implements GeoObjects
{
	protected double major,minor;
	
	public Ellipse()
	{
		this.major=2.0;
		this.minor=1.0;
	}
	public Ellipse(double major ,double minor)
	{
		this.major=major;
		this.minor=minor;
	}
	public double area()
	{
		return PI*major*minor;
	}
	public double perimeter()
	{
		return PI*(major+minor);
	}
	
	public double getMajor()
	{
		return this.major;
	}
	public double getMinor()
	{
		return this.minor;
	}
}