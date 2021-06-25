import java.util.*;

class Mathematics
{
	public int Division(int no1, int no2) throws ArithmeticException
	{
		return no1/no2;
	}
}

class Exception6
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first number");
		int no1=sobj.nextInt();
		System.out.println("Enter second number");
		int no2=sobj.nextInt();
		int ret=0;

		Mathematics mobj = new Mathematics();
		try
		{
			 ret = mobj.Division(no1, no2);
			 System.out.println("Division is :"+ret);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Exception occured");
		}

		
	}
}