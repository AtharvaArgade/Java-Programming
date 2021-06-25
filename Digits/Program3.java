/* Write a program which accept number from user and return the 
count of digits in between 3 and 7. 
Input : 2395 
Output : 1 
Input : 1018 
Output : 0 
Input : 4521 
Output : 2 
Input : 9922 
Output : 0 
*/

import java.util.*;

class Digits
{
	public int Count(int iNo)
	{
		int iCnt = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			if(((iNo%10)>3) && ((iNo%10)<7))
			{
				iCnt++;
			}
			iNo = iNo/10;
		}
		return iCnt;
	}
}

class Program3
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number");
		int iNo = sobj.nextInt();

		Digits obj = new Digits();
		int iRet = obj.Count(iNo);

		System.out.println("Number of digits between 3 and 7 are : "+iRet);
	}
}