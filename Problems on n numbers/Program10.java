/* Write java program which accept N numbers from user and return product of all odd elements. 
Input : N : 6  
 Elements : 15 66 3 70 10 88 
Output : 45 

Input : N : 6  
 Elements : 44 66 72 70 10 88 
Output : 0 
*/

import java.util.*;

class ArrayDemo
{
	public int Product(int Arr[])
	{
		int iMult = 1, iFlag = 0;
		for(int i=0;i<Arr.length;i++)
		{
			if(((Arr[i]%2) != 0) && (Arr[i] != 0))
			{
				iFlag = 1;
				iMult = iMult * Arr[i];
			}
		}
		if(iFlag == 1)
		{
			return iMult;
		}
		else
		{
			return 0;
		}
	}
}

class Program5
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int iSize = sobj.nextInt();

		int Arr[] = new int[iSize];

		System.out.println("Enter the elements of array");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}

		ArrayDemo obj = new ArrayDemo();
		int iRet = obj.Product(Arr);
		System.out.println("Product of all odd elements is : "+iRet);
	}
}

