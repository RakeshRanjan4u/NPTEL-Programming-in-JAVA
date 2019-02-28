class RecursiveFibnocci
{
	int n;
	public static int  arr[]=new int[200];
	RecursiveFibnocci(int n){
		this.n=n;
		
	}
	int fib(int n){
		if(n==0)
			return 1;
		else if(arr[n]!=0)
			return arr[n];
		else 
		   return arr[n]=fib(n-1)+fib(n-2);
			
	}
	
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		RecursiveFibnocci rf=new RecursiveFibnocci(n);
		for(int i=0;i<rf.n;i++) 
	        rf.arr[i]=0;
		rf.arr[1]=1;
		System.out.println("Fibnocci of first "+rf.n +" is :");
		for(int i=0;i<rf.n;i++)
			System.out.println(rf.fib(i));
	}
}