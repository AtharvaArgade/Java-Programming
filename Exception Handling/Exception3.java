import java.util.*;

class Exception3
{
	public static void main(String arg[])
	{
		int arr[]={10, 20, 30, 40, 50};
		System.out.println("Array created successfully");

		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the index of array");
		int index = sobj.nextInt();

		try
		{
			System.out.println("Inside try block");
			System.out.println("Array element at spsecified index is :"+arr[index]);
			System.out.println("End of try");
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Exception occurs : Inside catch");
			System.out.println("Information of exception is :"+obj);
		}
		
		System.out.println("End of main");
	}
}