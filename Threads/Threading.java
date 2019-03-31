class MyT extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		try{
			sleep((int)(Math.random()*5000));
		   }
		catch(InterruptedException e){
			System.out.println(i);
		}
	}
}

class Threading 
{
	public static void main(String args [])
	{
		MyT obj=new MyT();
		obj.start();
		//obj.start();
		System.out.println("Done!");
	}
}