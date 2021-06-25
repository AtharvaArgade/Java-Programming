import java.lang.*;

class Demo
{
	public int x, y;

	public Demo()
	{
		// this(11, 21);
		System.out.println("Default constructor");
	}
	public Demo(int a, int b)
	{
		this();
		System.out.println("Parameterised consructor");
		this.x=a;
		this.y=b;
	}
}

class ThisDemo
{
	public static void main(String arg[])
	{
		Demo obj=new Demo();
		Demo obj2=new Demo(11, 21);
	}
}