class A extends Thread
{
	public void run()
	{
		try{
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
			
		}
		catch(Exception e){
			System.out.println("Exception caught");
		}
	}
}

class ThreadId
{
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			A obj=new A();
			obj.start();
		}
		System.out.println("Main() Thread "+Thread.currentThread().getId()+" is running");
			
		System.out.println("Exit main()");
	}
}