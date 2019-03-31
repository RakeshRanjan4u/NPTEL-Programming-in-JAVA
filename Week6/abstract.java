abstract class Base
{
	abstract void show();
	void fun(){System.out.println("Chilled life"};
}

class Derived extends Base
{
	Derived()
	{
		super.fun();
		System.out.println("In derived constructor");
	}
	void show(){}
	//Overriding base class fun()
	void fun(){System.out.println("In deruved fun()); }
}

class abstract
{
	public static void main(String args[])
	{
		Base obj=new Derived();
		obj.show();
	}
}