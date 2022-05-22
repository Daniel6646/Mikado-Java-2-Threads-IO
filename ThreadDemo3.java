package assignment.threads;
import java.applet.Applet;
import java.awt.*;
public class ThreadDemo3 extends Applet
{
	TextField t1,t2;
	Thread th1;
	int i,j;
	public void init()
		{
		add(t1=new TextField(15));
		add(t2=new TextField(15));
		th1=new Thread(new B());
		A a=new A();
		th1.start();
		a.start();
		}
		class B implements Runnable
		{
		public void run()
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
		}
		class A extends Thread
		{
			public void run()
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
	}
};
/*
<applet code="assignment.threads.ThreadDemo3.class" width=300 height=300>
</applet>
*/