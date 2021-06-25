import java.util.*;

class AgeException extends Exception
{
	public AgeException(String str)
	{
		super(str);
	}
}

class Exception7
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sobj.nextInt();

		try
		{
			if(age<18)
			{
				AgeExceptin aobj = new AgeException("Age is less than 18");
				throw aobj; 
				// throw new AgeException("Age is less than 18");         we can write above two lines or this one line
			}
		}
		catch(AgeException obj)
		{
			System.out.println("Exception occured " +obj);
		}
		
	}
}