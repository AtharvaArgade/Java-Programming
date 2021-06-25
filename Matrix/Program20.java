//  Write a program which accept matrix and check whether the matrix is identity matrix or not. 

import java.util.*;

class Demo 
{
	public boolean Identity(int Arr[][], int iRow, int iCol)
	{
		int i = 0, j = 0;

		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr[i].length;j++)
			{
				if(((i == j) && (Arr[i][j] != 1)))
				{
					break;
				}
				else if((i != j) && (Arr[i][j] != 0))
				{
					break;
				}
			}
		}

		if((i == iRow) && (j == iCol))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Program20
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int iRow = sobj.nextInt();

		System.out.println("Enter the number of columns");
		int iCol = sobj.nextInt();

		int Arr[][] = new int[iRow][iCol];

		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Arr[i][j] = sobj.nextInt();
			}
		}

		Demo obj = new Demo();

		boolean ret = obj.Identity(Arr, iRow, iCol);
		if(ret == true)
		{
			System.out.println("It is Identity matrix");
		}
		else
		{
			System.out.println("It is not identity matrix");
		}
	}
}
