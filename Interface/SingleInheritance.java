interface I1
{
	int x=20;
	void print1();
}
interface I2 extends I1{
	int y=30;
	void print2();
}

class A implements I2{
	int z=x+y;
	public void print1(){
		System.out.println("Value of X in I1="+x);
	}
	public void print2(){
		System.out.println("Value of X in I2="+y);
	}
	public void print(){
		System.out.println("Value of Z in A="+z);
	}
}



class SingleInheritance
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.print1();
		obj.print2();
		obj.print();
	}
}