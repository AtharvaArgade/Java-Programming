import java.util.*;

import Marvellous.MarvellousArray;

class Searching extends MarvellousArray
{
	public Searching(int iSize)
	{
		super(iSize);
	}

	public boolean SearchLinear(int no)
	{
		int i = 0;
		for(i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == no)
				break;
		}

		if(i == Arr.length)
			return false;
		else
			return true;
	}

	public boolean SearchBinary(int no)
	{
		int istart = 0; 
		int iend = Arr.length-1;
		int imid = (istart+iend)/2;

		while(istart <= iend)
		{
			if(Arr[imid] == no)
			{
				break;
			}
			else
			{
				if(no < Arr[imid])
				{
					iend = imid-1;
				}
				else
				{
					istart = imid + 1;
				}
				imid = (istart + iend)/2;
			}
		}
		if(Arr[imid] == no)
		{
			return true;
		}
		else
		{
			return false;
		}
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

class BinarySearch
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int no = sobj.nextInt();

		Searching obj = new Searching(no);
		obj.Accept();
		obj.Display();

		System.out.println("Enter the element to search");
		no = sobj.nextInt();

		boolean bret = obj.SearchBinary(no);
		if(bret == true)
		{
			System.out.println("Element is there in array");
		}		
		else
		{
			System.out.println("Element is not present in array");
		}
	}
}
