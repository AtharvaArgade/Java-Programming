import java.util.*;

import Marvellous.MarvellousArrayX;

class Sorting extends MarvellousArrayX
{
	public Sorting(int isize)
	{
		super(isize);
	}

	public void Selection_Sort()
	{
		int i, j, index, temp;
		index = 0;

		for(i = 0;i < Arr.length;i++)
		{
			index = i;
			for(j = i;j < Arr.length;j++)
			{
				if(Arr[index] > Arr[j])
					index = j; 
			}
			temp = Arr[i];
			Arr[i] = Arr[index];
			Arr[index] = temp;
		}
	}
}

class Selection
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		int no = sobj.nextInt();

		Sorting obj = new Sorting(no);
		obj.Accept();
		System.out.println("Elements before sorting");
		obj.Display();

		obj.Selection_Sort();

		System.out.println("Elements after sorting");
		obj.Display();
	}
}
