/*   Write java program which accept N numbers from user and accept 
Range, Display all elements from that range 
Input : N : 6 
 Start: 60 
  End : 90 
 Elements : 85 66 3 76 93 88 
Output : 66 76 88 

Input : N : 6 
 Start: 30  
 End : 50 
 Elements : 85 66 3 76 93 88 
Output :  
*/

import java.util.*;

class ArrayDemo
{
	public void Range(int Arr[], int iStart, int iEnd)
	{
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]>iStart) && (Arr[i]<iEnd))
			{
				System.out.print(Arr[i]+ "\t");
			}
		}
	}
}

class Program4
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

		System.out.println("Enter Starting range");
		int iStart = sobj.nextInt();

		System.out.println("Enter ending range");
		int iEnd = sobj.nextInt();

		ArrayDemo obj = new ArrayDemo();
		obj.Range(Arr,iStart, iEnd);
	}
}

