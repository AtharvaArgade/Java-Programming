/* Write java program which accept N numbers from user and accept 
one another number as NO , return index of first occurrence of that 
NO. 
Input : N : 6 
 NO: 66 
 Elements : 85 66 3 66 93 88 
Output : 1 
Input : N : 6 
 NO: 12 
 Elements : 85 11 3 15 11 111 
Output : -1 
*/

import java.util.*;

class ArrayDemo
{
	public int SearchFirstOcc(int Arr[], int iNo)
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
			return -1;
		}
		else
		{
			return i;
		}
	}
}

class Program2
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
		int iRet = obj.SearchFirstOcc(Arr,iNo);
		System.out.println("Element is found at index : "+iRet);
	}
}
