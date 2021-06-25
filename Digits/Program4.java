/*  Write a program which accept number from user and return multiplication of all digits. 
Input : 2395 
Output : 270 
Input : 1018 
Output : 8 
Input : 9440 
Output : 144 
Input : 922432 
Output : 864  */

import java.util.*;

class Digits
{
	public int Mult(int iNo)
	{
		int iMult = 1;

		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			if(iNo%10 != 0)
			{
				iMult = iMult*(iNo%10);			
			}
			iNo = iNo/10;
		}
		return iMult;
	}
}

class Program4
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number");
		int iNo = sobj.nextInt();

		Digits obj = new Digits();
		int iRet = obj.Mult(iNo);

		System.out.println("Multiplication of all the digits is : "+iRet);
	}
}

