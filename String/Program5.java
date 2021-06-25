/* Write a java program which accept string from user and display it in reverse order. 
Input : "MarvellouS"
Output : "SuollevraM" 
*/

import java.util.*;

class StringX
{
	public String Reverse(String str)
	{
		int i = 0;
		char arr[] = str.toCharArray();
		String str1 = "";

		for(i=arr.length-1;i>=0;i--)
		{
			str1 = str1+arr[i];
		}
		return str1;
	}
}

class Program5
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sobj.nextLine();

		StringX obj = new StringX();
		String sRet = obj.Reverse(str);

		System.out.println(sRet);
	}
}

