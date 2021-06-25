
class Demo
{
	public static void Display(Integer arr[])
	{
		System.out.println("Elements of array are :");
		
		/* for( int i=0;i<arr.length;i++)   we can also write like this
		{
			System.out.println(arr[i]);
		}*/

		for(int i : arr)     // for each loop
		{
			System.out.println(i);
		}
	}

	public static <T> void DisplayX(T arr[])
	{
		System.out.println("Elements of array are :");
		for(T i : arr)
		{
			System.out.println(i);
		}
	}
}

class Generic
{
	public static void main(String arg[])
	{
		Integer a[] = {10,20,30,40,50};
		Float b[]={10.2f,20.3f,30.5f,40.6f};
		Character c[]={'a','b','c'};

		Demo.Display(a);
		Demo.DisplayX(a);
		Demo.DisplayX(b);
		Demo.DisplayX(c);
	}
}