class Demo implements Runnable 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Thread t = Thread.currentThread();    //  t is reference of thread
			System.out.println("Inside Thread :"+t.getName()+" : "+i);

			try
			{
				Thread.sleep(1000);
			}
			catch(Exception obj)
			{}
		}
	}
}

class Thread2
{
	public static void main(String arg[]) 
	{
		System.out.println("Inside main Thread");
		
		Thread t1 = new Thread(new Demo());  
		Thread t2 = new Thread(new Demo()); 
		
		t1.setName("First");
		t2.setName("Second");

		t1.start();      // start is used to scheudle thread
		t2.start();

		try
		{
			t1.join();    // main waits till t1 terminates
			t1.join();    // main waits till t2 terminates
		}
		catch(Exception obj)
		{}
		
		System.out.println("End of main thread");
	}
}
