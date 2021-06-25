/* .Write a java program which accept number from user and return the count of even digits. 
Input : 2395 
Output : 1 
Input : 1018 
Output : 2 
Input : -1018 
Output : 2 
Input : 8462 
Output : 4 

*/

import java.util.*;

class Digits
{
	public int EvenDigit(int iNo)
	{
		int iCnt = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			if(((iNo%10)%2) == 0)
			{
				iCnt++;
			}
			iNo = iNo/10;
		}
		return iCnt;
	}
}

class Program1
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number");
		int iNo = sobj.nextInt();

		Digits obj = new Digits();
		int iRet = obj.EvenDigit(iNo);

		System.out.println("Number of even digits are : "+iRet);
	}
}
