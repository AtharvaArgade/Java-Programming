/*  Write a java program which accept string from user and return 
difference between frequency of small characters and frequency of capital characters. 
Input : "MarvellouS"
Output : 6 (8-2)  */


import java.util.*;

class StringX
{
	public int CountDiff(String str)
	{
		int iCnt1 = 0, iCnt2 = 0;
		char arr[] = str.toCharArray();
		for(int i= 0;i<arr.length;i++)
		{
			if((arr[i]>='a') && (arr[i]<='z'))
			{
				iCnt1++;
			}
			else if((arr[i]>='A') && (arr[i]<='Z'))
			{
				iCnt2++;
			}
		}
		return iCnt1-iCnt2;
	}
}

class Program3
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sobj.nextLine();

		StringX obj = new StringX();
		int iRet = obj.CountDiff(str);
		System.out.println("Difference is : "+iRet);
	}
}