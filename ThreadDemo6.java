package assignment.threads;
import java.applet.Applet;
import java.awt.*;
public class ThreadDemo6 extends Applet
{
	TextField t1,t2;
	Thread th1,th2;
	int i,j;
	public void init()
		{
		add(t1=new TextField(15));
		add(t2=new TextField(15));
		th1=new Thread(()->
			{
				while(true)
				{
				t1.setText(String.valueOf(i));
				if(i==5000)
					i=0;
				else
					i++;
				try
					{
						Thread.sleep(20);
					}
					catch(Exception e)
						{
						}
				}
			}
		);
		th2=new Thread(()->
			{
				while(true)
				{
				t2.setText(String.valueOf(j));
				if(j==5000)
					j=0;
				else
					j++;
				try
					{
						Thread.sleep(20);
					}
					catch(Exception e)
						{
						}
				}
			}
		);
		th1.start();
		th2.start();
	}
}
/*
<applet code="assignment.threads.ThreadDemo6.class" width=300 height=300> 
</applet>
*/