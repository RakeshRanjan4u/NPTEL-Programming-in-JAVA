import java.applet.Applet;
import java.awt.Graphics;

public class Demo_5 extends Applet{
	public void paint(Graphics g){
		int x=20;
		int y=30;
		
		String msg="";
		x=Integer.parseInt(getParameter("xPositon"));
		y=Integer.parseInt(getParameter("yPosition"));
		msg=getParameter("msg");
		
		g.drawString(msg,x,y);
	}
}