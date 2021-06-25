// Write a program which accept matrix and reverse the contents of each column.

import java.util.*;

class Demo 
{
	public void Reverse(int Arr[][], int iRow, int iCol)
	{
		int Temp = 0;
		int k = iRow-1;
		for(int i=0;i<Arr.length/2;i++,k--)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Temp = Arr[i][j];
				Arr[i][j] = Arr[k][j];
				Arr[k][j] = Temp;
			}
		}

		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

class Program19
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

		obj.Reverse(Arr, iRow, iCol);
	}
}