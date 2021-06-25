/* Write Java program which accept N numbers from user and display 
all such elements which are even and divisible by 5. 
Input : N : 6 
Elements : 85 66 3 80 93 88 
Output : 80
*/

import java.util.*;

class ArrayDemo
{
	public void Display(int arr[])
	{
		for(int i= 0;i<arr.length;i++)
		{
			if((arr[i]%5 == 0) && (arr[i]%2 == 0))
			{
				System.out.println(arr[i]);
			}
		}
	}
}

class Program3
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
		obj.Display(arr);
	}
}