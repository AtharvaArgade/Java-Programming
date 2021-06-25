import java.util.*;

import Marvellous.MarvellousArrayX;

class Sorting extends MarvellousArrayX
{
	public Sorting(int isize)
	{
		super(isize);
	}

	public void Insertion_Sort()
	{
		int i, j, key;

		for(i=1;i<Arr.length;i++)
		{
			key = Arr[i];
			j = i-1;

			while((j>=0) && (Arr[j]>key))
			{
				Arr[j+1] = Arr[j];
				j = j-1;
			}

			Arr[j+1] = key;
		}
	}
}

class Insertion
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

		obj.Insertion_Sort();

		System.out.println("Elements after sorting");
		obj.Display();
	}
}
