//  Write a program which accept matrix and reverse the contents of each row.  

import java.util.*;

class Demo 
{
	public void Reverse(int Arr[][], int iRow, int iCol)
	{
		int Temp = 0;
		int k = 0;
		for(int i=0;i<Arr.length;i++)
		{
			k = iCol;
			for(int j=0;j<k;j++,k--)
			{
				Temp = Arr[i][j];
				Arr[i][j] = Arr[i][k-1];
				Arr[i][k-1] = Temp;
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

class Program18
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
