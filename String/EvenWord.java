import java.util.*;

class Demo
{
	public void Evenword(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");  
		String Arr[] = temp.split(" ");

		for(String s : Arr)
		{
			if((s.length() % 2 ) == 0)
			{
				System.out.println(s);
			}
		}
	}
}

class Program9
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the first string");
		String str = sobj.nextLine();
		
		Demo dobj = new Demo();
		dobj.Evenword(str);
	}
}


