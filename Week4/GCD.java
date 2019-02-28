import java.util.Scanner;
class GCD{
	int m,n;
	
	
	static int recGCD(int m,int n){
		if(n>m)
			return recGCD(n,m);
		int temp=m%n;
		if(temp==0)
			return n;
		else
			return recGCD(n,temp);
	}

	public static void main(String args[]){
		System.out.println("Enter two numbers to find gcd:");
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		GCD obj=new GCD();
		obj.m=49;
		obj.n=52;
		//Iterative way
		
			while((m%n)!=0){
				m=n;
				n=m%n;
			}
			System.out.println("Iterative GCD is: "+n);
		
		System.out.println("GCD of "+obj.m +" and "+obj.n+" is: " + obj.recGCD(obj.m,obj.n));
	}
}