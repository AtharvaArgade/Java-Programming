/* Write a program which accept number from user and return the count of odd digits. 
Input : 2395 
Output : 3 
Input : 1018 
Output : 2 
Input : -1018 
Output : 2 
Input : 8462 
Output : 0 
*/

import java.util.*;

class Digits
{
	public int OddCount(int iNo)
	{
		int iCnt = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			if(((iNo%10)%2) != 0)
			{
				iCnt++;
			}
			iNo = iNo/10;
		}
		return iCnt;
	}
}

class Program2
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number");
		int iNo = sobj.nextInt();

		Digits obj = new Digits();
		int iRet = obj.OddCount(iNo);

		System.out.println("Number of odd digits are : "+iRet);
	}
}
