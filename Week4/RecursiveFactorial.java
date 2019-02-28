class RecursiveFactorial
{
	public int n;
	public int fact(int n){
		if (n==0 || n==1)
		   return 1;
		else
			return fact(n-1)*n;
	}
	public static void main(String args[]){
		RecursiveFactorial fac=new RecursiveFactorial();
		fac.n=Integer.parseInt(args[0]);
		System.out.println("Factorial of "+fac.n+ " is "+fac.fact(fac.n));
		}
}