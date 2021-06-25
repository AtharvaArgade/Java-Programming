import java.lang.*;

class Base 
{
	public int i, j;

	public Base()
	{  System.out.println("Base constructor"); }
	public void fun()
	{  System.out.println("Base fun"); }
	public void gun()
	{  System.out.println("Base gun"); }
}

class Derived extends Base 
{
	public int x, y;

	public Derived()
	{  System.out.println("Derived constructor"); }
	public void fun()
	{  System.out.println("Derived fun"); }
	public void sun()
	{  System.out.println("Derived sun"); }
}
 
class virtual
{
	public static void main(String arg[])
	{
		Base bobj=new Derived();    // Upcasting
	//	Derived dobj = new Base();   // Downcasting  Error

		bobj.fun();
		bobj.gun();
	//	bobj.sun();	//  Error
	}
}