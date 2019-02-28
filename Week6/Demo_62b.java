//Initialization of super class variables using super in Subclass cinstrutor
class Box{
	double length,breadth,height;
	
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
	
	BoxWeight(){
		super();
		weight=0.0;
	}
	BoxWeight(double l,double b,double h,double w){
		super(l,b,h);
		weight=w;
	}
}

class Demo_62b{
	public static void main(String args[]){
		Box boxObj=new Box(2.3,201,3.6);
		BoxWeight boxWObj=new BoxWeight(1.2,53.6,45.6,5.5);
		
		System.out.println("Volume of Box in superclass =:"+boxObj.volume());
		
		System.out.println("Volume and weight of Box in subclass="+boxWObj.volume()+" Weight="+boxWObj.weight);
		}
}
















