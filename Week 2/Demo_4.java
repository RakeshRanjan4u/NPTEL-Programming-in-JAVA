import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Demo_4 extends Applet{
	public void init(){
		//We will change dfault background color of applet to Yellow color
		setBackground(Color.YELLOW);
		rsize(400,400);
	}
	public void paint(Graphics g){
		g.drawString("Applet background example",0,50);
	}
}