import java.util.*;

class Program3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the first string");
		String str = sobj.nextLine();
		System.out.println("String length is : "+str.length());
		
		String temp = str.trim();
		System.out.println("New String is :"+temp);
		System.out.println("Length of new string is :"+temp.length());
	 	
	 	String temp2 = temp.replaceAll("\\s+","");   // In '//s+' all the spaces are removed at one shot so execution time decreases 
	 	System.out.println("Modified string is :"+temp2);
	}
}