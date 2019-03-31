
// final class Bike
// {
// System.out.println("Final class can not be inherited");
// }


abstract class Base
{
	Base(){System.out.println("Abstract class contructor");}
	abstract void show();
	void fun(){System.out.println("Chilled life in Base");}
	final void out(){System.out.println("It can not be overridden ,although accessd");}
}



class Derived extends Base
{
	Derived()
	{
		super();
		System.out.println("In derived constructor");
	}
	void show(){System.out.println("Overriding Base class abstract method is compulsory");}
	//Overriding base class fun()
	void fun(){System.out.println("In derived fun()"); }
}

class abstractDemo
{
	public static void main(String args[])
	{
		// Base obj=new Base(); Tnstantiation of abstract class in not possible
		Base obj=new Derived();
		obj.show();
	}
}