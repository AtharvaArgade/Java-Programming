/*  Write a java program which accept string from user and count number of small characters. 
Input : "Marvellous"
Output : 9 
*/

import java.util.*;

class StringX
{
	public int CountSmall(String str)
	{
		int iCnt = 0;
		char arr[] = str.toCharArray();
		for(int i= 0;i<arr.length;i++)
		{
			if((arr[i]>='a') && (arr[i]<='z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}

class Program2
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sobj.nextLine();

		StringX obj = new StringX();
		int iRet = obj.CountSmall(str);
		System.out.println("Number of small characters are : "+iRet);
	}
}
