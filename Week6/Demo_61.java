//create superclass

class A
{	
	int i,j;
	void showij(){
		System.out.println("i and J: "+i +" "+j);
	}
	
}
//Create a subclass of A
class B extends A
{
	int k;
	void showk(){
		 System.out.println("K:"+k);
	}
	void sum(){
		System.out.println("Sum (i+j+k)="+(i+j+k));
	}
}

public class Demo_61
{
	public static void main(String args[]){
		A superOb=new A();
		B subOb=new B();
		// Super class may be used by itself
		System.out.println("Contents pf superclass ");
		superOb.i=10;
		superOb.j=23;
		superOb.showij();
		
		//Subclass access all members of super class
		subOb.k=90;
		subOb.i=89;
		subOb.j=8;
		System.out.println("Conyents of  subclass:");
		subOb.showij();
		subOb.showk();
		System.out.println("Sum of i,j and k in subclass:");
		subOb.sum();
	}
}
















