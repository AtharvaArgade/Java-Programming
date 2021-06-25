class Demo         
{
	public int i;
	public int j;

	public Demo(int x, int y)
	{
		this.i=x;
		this.j=y;
	}

	public boolean equals(Demo obj)      // Override
	{
		if((this.i==obj.i) && (this.j==obj.j))
			return true;
		else
			return false;
	}

	protected void finalize()    
	{
		System.out.println("Inside finalize method");
	}
}

class Object1
{
	public static void main(String arg[])
	{
		Demo obj1=new Demo(11, 21);
		Demo obj2=new Demo(11, 21);

		if(obj1==obj2)
		{
			System.out.println("Objects are equal");
		}
		System.out.println("Hashcode of obj1 is :"+obj1.hashCode());  
		System.out.println("Hashcode of obj2 is :"+obj2.hashCode());

		if(obj1.equals(obj2))
		{
			System.out.println("Objects are equal");
		}

		Class ref=obj1.getClass();              
		System.out.println("Name of our class is "+ref.getName());
		System.out.println(obj1);
		System.out.println(obj1.toString());		

		Demo obj3 = obj1;    // object obj3 refers to obj1. In this case obj1 reference count is increased
		 
		obj1=null;
		obj2=null;
		System.gc();        // Call garbage collector explicitly.  
		
	}
}
