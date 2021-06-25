import java.lang.*;

class Demo 
{
	public int i;
	public final int j = 10;
	public final int k;

	public Demo()
	{
		this.i=10;
		this.k=30;
	}
}
 
class Finalchar
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		obj.i++;
	  //	obj.j++;
	  //   	obj.k++;
	}
}
