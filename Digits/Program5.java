/* Write a program which accept number from user and return 
difference between summation of even digits and summation of odd 
digits. 
Input : 2395 
Output : -15 (2 - 17) 
Input : 1018 
Output : 6 (8 - 2) 
Input : 8440 
Output : 16 (16 - 0) 
Input : 5733 
Output : -18 (0 - 18)
*/

import java.util.*;

class Digits
{
	public int Difference(int iNo)
	{
		int iSumE = 0, iSumO = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			if(((iNo%10)%2) == 0)
			{
				iSumE = iSumE + (iNo%10);			
			}
			else
			{
				iSumO = iSumO + (iNo%10);
			}
			iNo = iNo/10;
		}
		return iSumE-iSumO;
	}
}

class Program5
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number");
		int iNo = sobj.nextInt();

		Digits obj = new Digits();
		int iRet = obj.Difference(iNo);

		System.out.println("Difference is : "+iRet);
	}
}

