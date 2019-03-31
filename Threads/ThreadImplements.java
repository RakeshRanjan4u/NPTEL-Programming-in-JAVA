class Threadx implements Runnable
{
	public void run(){
		for(int i=0;i<4;i++)
			System.out.println("In Threadx, i="+i);
		System.out.println("Exiting Threadx");
	}
}

class Thready implements Runnable
{
	public void run(){
		for(int i=0;i<4;i++)
			System.out.println("In Thready, i="+i);
		System.out.println("Exiting Thready");
	}
}

class Threadz implements Runnable
{
	public void run(){
		for(int i=0;i<4;i++)
			System.out.println("In Threadz, i="+i);
		System.out.println("Exiting Threadz");
	}
}

class ThreadImplements
{
	public static void main(String args[])
	{
		Threadx x=new Threadx();
		Thread t1=new Thread(x);
		Thread t2=new Thread(new Thready());
		Thread t3=new Thread(new Threadz());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Exiting from main()");
		
	}
}







