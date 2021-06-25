import java.util.*;

class Demo
{
	public void Maximumword(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");  
		String Arr[] = temp.split(" ");
		String stemp = null;

		int iMax = Arr[0].length();

		for(String s : Arr)
		{
			if(s.length() > iMax)
			{
				iMax = s.length();
				stemp = s;
			}
		}

		System.out.println("Longest word is :" +stemp);
	}
}

class Program10
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the first string");
		String str = sobj.nextLine();
		
		Demo dobj = new Demo();
		dobj.Maximumword(str);
	}
}


