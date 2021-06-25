/*. Write java program which accept N numbers from user and accept 
one another number as NO , check whether NO is present or not. 
Input : N : 6 
 NO: 66 
 Elements : 85 66 3 66 93 88 
Output : TRUE 
Input : N : 6 
 NO: 12 
 Elements : 85 11 3 15 11 111 
Output : FALSE
*/

import java.util.*;

class ArrayDemo
{
	public boolean CheckNo(int Arr[], int iNo)
	{
		int i = 0;

		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i] == iNo)
			{
				break;
			}
		}

		if(i == Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

class Program1
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

		System.out.println("Enter the element to search");
		int iNo = sobj.nextInt();

		ArrayDemo obj = new ArrayDemo();
		boolean bRet = obj.CheckNo(Arr,iNo);
		if(bRet == true)
		{
			System.out.println("Number is present");
		}
		else
		{
			System.out.println("Number is not present");		
		}
	}
}
