import java.util.*;

import Marvellous.MarvellousArray;

class Searching extends MarvellousArray
{
	public Searching(int iSize)
	{
		super(iSize);
	}

	public boolean CheckSorted() // Increasing order
	{
		int i = 0;

		for(i = 0;i<Arr.length-1;i++)
		{
			if(Arr[i] > Arr[i+1])
				break;
		}

		if(i == Arr.length-1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}

class Sort1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		Searching obj = new Searching(no);
		obj.Accept();
		obj.Display();

		boolean bret = obj.CheckSorted();
		if(bret == true)
		{
			System.out.println("Array is Sorted");
		}		
		else
		{
			System.out.println("Array is not Sorted");
		}
	}
}
