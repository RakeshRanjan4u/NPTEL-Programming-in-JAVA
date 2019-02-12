import java.applet.Applet;
import java.awt.Graphics;

public class Demo_3 extends Applet{
	public void init(){
		//resize(x,y) is used to resize window size
		resize(500,500);
	}
	public void paint(Graphics g){
		g.drawString("Window has been resized to 300,300",50,50);
	}
}