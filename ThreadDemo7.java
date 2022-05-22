package assignment.threads;
import java.awt.*;
import java.applet.Applet;
public class ThreadDemo7 extends Applet
{
	Thread th1;
	boolean flag=true;
	int x,y;
	public void init()
	{
		x=0;
		y=size().height/2;
		th1=new Thread (new Runnable()
		{
			public void run()
			{
				while (true)
				{
					if(x>=size().width)
						x=0;
					else
						x++;
					if (y>=(size().height-15))
						flag=false;
					if (y<=(size().height/2))
						flag=true;
					if (flag)
						y++;
					else
						y--;
					repaint();
					try
					{
						Thread.sleep(20);
					}
					catch(Exception e)
					{}
				}
			}
		});
		th1.start();
	}
	public void paint(Graphics g)
{
		g.setColor(Color.red);
		g.fillOval(x,y,15,15);
}
};
//<applet code="assignment.threads.ThreadDemo7.class"width=300 height=300></applet>