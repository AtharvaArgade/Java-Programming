import java.lang.*;

class Base 
{
	public int i, j;

	public Base()
	{
		System.out.println("Base constructor");	
	}
	public void fun()
	{
		System.out.println("Base fun");
	}
}

// Single level inhertiance
class Derived extends Base 
{
	public int x, y;

	public Derived()
	{
		System.out.println("Derived constructor");	
	}
	public void gun()
	{
		System.out.println("Derived gun");
	}
}

// Multi level inhertance
class Marvellous extends Derived 
{
	public int a;
	
	public Marvellous()
	{
		System.out.println("Marvellous Constructor");
	}
	public void sun()
	{
		System.out.println("Marvellous sun");
	}
}
 
class Inheritance
{
	public static void main(String arg[])
	{
		Base bobj=new Base();

		Derived dobj=new Derived();
		dobj.fun();
		dobj.gun();

		Base bobj1=new Derived();   // Upcasting

		Marvellous mobj = new Marvellous();	
	}
}