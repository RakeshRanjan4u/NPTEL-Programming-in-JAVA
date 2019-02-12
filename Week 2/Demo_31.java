//A class that gives blueprint of Circle
class Circle{
	double x,y;//The coordinates
	double r;//The radius
	//Contructor for initializing data members
	Circle(double a,double b,double c){
		x=a;//set center x-coordinate
		y=b;//set center y-coordinate
		r=c;//set radius
	}
	//Methods taht return circumference
	double circumference(){
		return 2*3.14*r;
	}
	//Methods that return Area
	double area(){
		return 3.14*r*r;
	}
}

//Class defining Box
class Box{
	double height;
	double width;
	double length;
	//Constructor of Box
	Box(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	//Method to clculate Volume
	double volume(){
		return length*width*height;
	}
}


//The following class create an object of class circle
class Demo_31 {
	public static void main(String args[]){
		Circle c1=new Circle(0,5,10);
		Box b1=new Box(100,56,20);
		System.out.println("circumference of Circle is: "+c1.circumference());
		System.out.println("Area of Circle: "+c1.area());
		System.out.println("Volume of Box: "+b1.volume());
	}
}