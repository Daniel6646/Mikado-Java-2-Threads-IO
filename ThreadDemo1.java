package assignment.threads;
import java.applet.Applet;
import java.awt.*;
public class ThreadDemo1 extends Applet implements Runnable
{
	TextField t1,t2;
	Thread th1,th2;
	int i,j;
	public void init()
	{
		add(t1=new TextField(15));
		add(t2=new TextField(15));
		th1=new Thread(this);
		th2=new Thread(this);
		th1.start();
		th2.start();
	}
	public void run()
	{
		while(true)
		{
			Thread th= Thread.currentThread();
			if(th.equals(th1))
			{
				t1.setText(String.valueOf(i));
				if(i==500)
					i=0;
				else
					i++;
			}
			if(th.equals(th2))
			{ 
				t2.setText(String.valueOf(j));
				if(j==500)
					j=0;
				else
					j++;
			}
			try
			{
				Thread.sleep(20);
			}
			catch(Exception e)
			{
			}
		}
	}
}
/*
<applet code="assignment.threads.ThreadDemo1.class" width=300 height=300>
</applet>
*/