interface I1
{
	int x=20;
	void print1();
}
interface I2 {
	int y=30;
	void print2();
}
class B{
	String name="Rakesah Ranjan";
	String contact="7479148724";
}
class A extends B implements I1,I2{
	int z=x+y;
	String Village="Parna";
	String State="Bihar";
	public void print1(){
		System.out.println("Value of X in I1="+x);
	}
	public void print2(){
		System.out.println("Value of X in I2="+y);
	}
	public void print(){
		System.out.println("Value of Z in A="+z);
		System.out.println("Intro:--------");
		System.out.println("Name="+name+"\nContact="+contact+"\nVillage="+Village+"\nState="+State);
		
	}
}



class MultipleInheritance
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.print1();
		obj.print2();
		obj.print();
	}
}