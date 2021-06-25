import java.lang.*;

class Demo
{
	public int x, y;
	public static int z=11;

	public void fun()            // Non static behaviour
	{
		System.out.println("Inside fun");
	}

	public static void gun()      // Static behaviour
	{
		System.out.println("Inside gun");
		//System.out.println("Value of x is "+this.x);
	}	
}

class Static
{
	public static void main(String arg[])
	{
		System.out.println("Value of z is " +Demo.z);
		Demo.gun();

		Demo obj=new Demo();
		obj.fun();
		obj.gun();
	}
}