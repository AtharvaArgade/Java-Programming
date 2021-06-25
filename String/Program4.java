/* Write a java program which accept string from user and check whether it contains vowels in it or not. 
Input : "marvellous"
Output : TRUE 
Input : "Demo" 
Output : TRUE 
Input : "xyz" 
Output : FALSE  */

import java.util.*;

class StringX
{
	public boolean CheckVowels(String str)
	{
		int i = 0;
		char arr[] = str.toCharArray();
		for(i= 0;i<arr.length;i++)
		{
			if((arr[i]=='a') || (arr[i]=='e') || (arr[i]=='i') ||(arr[i]=='o') || (arr[i]=='u'))
			{
				break;
			}
		}
		if(i<arr.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Program4
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sobj.nextLine();

		StringX obj = new StringX();
		boolean bRet = obj.CheckVowels(str);
		if(bRet == true)
		{
			System.out.println("String contain vowels");
		}
		else
		{
			System.out.println("String doesnot contains vowels");		
		}

	}
}

