import java.io.*;
class Demo_41
{
	public static void main(String args[]) //throws Exception{
	float principalAmount;
	float rateOfInterest;
	int numberOfYears;
	try{
	DataInputStream in =new DataInputStream(System.in);
	
	String tempString;
	System.out.println("Enter Principal Amount:");
	System.out.flush();
	tempString=in.readLine();
	principalAmount=Float.valueOf(tempString);
	
	System.out.println("Enter Rate Of Interest:");
	System.out.flush();
	tempString=in.readLine();
	rateOfInterest=Float.valueOf(tempString);
	
	System.out.println("Enter Number Of Years:");
	System.out.flush();
	tempString=in.readLine();
	numberOfYears=Integer.parseInt(tempString);
	//Input is Over now calculate Interest
	float interestTotal=principalAmount*rateOfInterest*numberOfYears;
	System.out.println("Total Interest= "+interestTotal);
	
	}
	catch(Exception ex){	
	}
	}
}