/* Write Java program which accept N numbers from user and return 
difference between summation of even elements and summation of odd elements. 
Input : N : 6 
Elements : 85 66 3 80 93 88 
Output : 53 (234 - 181) 

*/

import java.util.*;

class ArrayDemo
{
	public int Difference(int arr[])
	{
		int iSum1 = 0, iSum2 = 0;

		for(int i= 0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				iSum1 = iSum1 + arr[i];
			}
			else
			{
				iSum2 = iSum2 +arr[i];
			}
		}
		return iSum1-iSum2;
	}
}

class Program1
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		int iSize = 0;
		System.out.println("Enter the size of array");
		iSize = sobj.nextInt();

		int arr[] = new int[iSize];

		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sobj.nextInt();
		}

		ArrayDemo obj = new ArrayDemo();
		int iRet = obj.Difference(arr);
		System.out.println("Difference is :"+iRet);
	}
}
