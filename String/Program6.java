import java.util.*;

class Program6
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the first string");
		String str = sobj.nextLine();
		System.out.println("String length is : "+str.length());
		
		String temp = str.trim().replaceAll("[ ]{2,}"," "); // [ ] means single white space
		System.out.println("New string length after removing extra white space :"+temp.length());
		System.out.println("Modified string is :"+temp);
	}
}


