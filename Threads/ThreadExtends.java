class Threadx extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("In class X i="+-1*i);
		System.out.println("Exiting From Threadx");
	}

}
class Thready extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("In class Y i="+2*i);
		System.out.println("Exiting From Thready");
	}

}
class Threadz extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("In class Z i="+2*(i-1));
		System.out.println("Exiting From Threadz");
	}

}

class ThreadExtends
{
	public static void main(String args[])
	{
		Threadx x=new Threadx();
		Thready y=new Thready();
		Threadz z=new Threadz();
		x.start();
		y.start();
		z.start();
		System.out.println("Exiting from Main()");
	}
}














