//if class is already inherited then use implements Runnable as multiple inheritance is not allowded in java

class Demo implements Runnable //extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Thread t = Thread.currentThread();    //  where t is reference of thread
			System.out.println("Inside Thread :"+t.getName()+" : "+i);

			// we can also write above two lines as below one line
			// System.out.println("Inside Thread :"+Thread.currentThread().getName()+" : "+i);
			
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
		//Demo obj1=new Demo();
		//Demo obj2=new Demo();
		//Thread t1 = new Thread(obj1);
		//Thread t2 = new Thread(obj2);

		// Instead of creating objects obj1 and obj2 and then passing that obj1 and obj2 in Thread we can 
		// write it as below
		Thread t1 = new Thread(new Demo());  
		Thread t2 = new Thread(new Demo()); 
		
		t1.setName("First");
		t2.setName("Second");
		
		// instead of creating thread objects t1 and t2 and then calling setName using t1 and t2,
		// we can also write it as below 
		//obj1.setName("First");        this works only when we extends Thread
		//obj2.setName("Second");

		t1.start();      // start is used to scheudle thread
		                 // it will internally call run method when schedular tell it 
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