//A class that gives blueprint of Circle
class Circle{
	double x,y;//The coordinates
	double r;//The radius
	//Contructor for initializing data members
	Circle(double a,double b,double c){
		this.x=a;//set center x-coordinate
		this.y=b;//set center y-coordinate
		this.r=c;//set radius
	}
	//Overloading Constructor
	Circle(double radius){
		this(0,0,radius);
	}
	//Initializing constructor with instance of other object
	Circle(Circle c){
		this(c.x,c.y,c.r);
	}
	//Default Constructor
	Circle(){
		this(0,0,10);
	}
	
	//Methods that return circumference
	double circumference(){
		return 2*3.14*r;
	}
	//Methods that return Area
	double area(){
		return 3.14*r*r;
	}
}


//The following class create an object of class circle
class Demo_32 {
	public static void main(String args[]){
		Circle c1=new Circle(0,5,10);
		Circle c2=new Circle(10);
		Circle c3=new Circle(c1);
		Circle c4=new Circle();
		System.out.println("circumference of Circle is-> c1:"+c1.circumference()+" c2:"+c2.circumference()+" c3:"+c3.circumference()+" c4:"+c4.circumference());
		System.out.println("Area of Circle-> c1:"+c1.area() +" c2:"+c2.area()+" c3:"+c3.area()+" c4:"+c4.area());
	}
}