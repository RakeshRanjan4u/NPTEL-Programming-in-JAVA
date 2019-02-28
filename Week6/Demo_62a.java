//Initialization of subclass using constructor Example
class Box{
	double length;
	double breadth;
	double height;
	
	Box(){
		length=0.0;
		breadth=0.0;
		height=0.0;
	}
	Box(double l,double b,double h){
		length=l;
		breadth=b;
		height=h;
	}
	double volume()
	{
		return length*breadth*height;
	}
}

class BoxWeight extends Box{
	double weight;
	
	BoxWeight(double l,double b,double h,double w)
	{
		length=l;
		breadth=b;
		height=h;
		weight=w;
	}
}

class Demo_62a
{
	public static void main(String args[])
	{
		Box boxObj=new Box();
		BoxWeight boxWObj=new BoxWeight(2.3,4.5,601,3.3);
		
		double vol=boxObj.volume();
		System.out.println("Volume of Box:"+vol);
		
		vol=boxWObj.volume();
		System.out.println("volume of Box in subclass:"+vol);
		System.out.println("Weight of box="+boxWObj.weight);
	}
}















