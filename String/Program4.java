import java.util.*;

class Program4
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
	 	
	 	String temp2 = temp.replaceAll("\\s{2,}","");   // In '//s+' two spaces are removed at one shot. At one time one pair of space is removed 
	 	System.out.println("Modified string is :"+temp2);
	}
}

/*

Enter the first string
   abc   xyz
String length is : 15
New String is :abc   xyz
Length of new string is :9
Modified string is :abcxyz

E:\Logic Building\java\String>java Program4
Enter the first string
abc xyz demo
String length is : 12
New String is :abc xyz demo
Length of new string is :12
Modified string is :abc xyz demo

*/