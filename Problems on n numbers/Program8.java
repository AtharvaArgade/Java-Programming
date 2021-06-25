/* Write java program which accept N numbers from user and accept 
one another number as NO , return index of last occurrence of that NO. 
Input : N : 6 
 NO: 66 
 Elements : 85 66 3 66 93 88 
Output : 3 
Input : N : 6 
 NO: 93 
 Elements : 85 66 3 66 93 88 
Output : 4 
Input : N : 6 
 NO: 12 
 Elements : 85 11 3 15 11 111 
Output : -1
*/

import java.util.*;

class ArrayDemo
{
	public int LastOcc(int Arr[], int iNo)
	{
		int i = 0;

		for(i=Arr.length-1;i>=0;i--)
		{
			if(Arr[i] == iNo)
			{
				break;
			}
		}

		if(i < 0)
		{
			return -1;
		}
		else
		{
			return i;
		}
	}
}

class Program3
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
		int iRet = obj.LastOcc(Arr,iNo);
		System.out.println("Element is found at index : "+iRet);
	}
}