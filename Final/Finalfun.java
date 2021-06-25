import java.lang.*;

class Base
{
	public void fun() {}
	public final void gun() {}
}
 
class Derived extends Base
{
	public void fun() {}
    //	public void gun() {}   // Not allowed
}

class Finalfun
{
	public static void main(String arg[])
	{
		Derived dobj=new Derived();
		dobj.fun();
		dobj.gun();
	}
}
