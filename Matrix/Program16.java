// . Write a program which accept matrix and swap the contents of consecutive rows.  

import java.util.*;

class Demo 
{
	public void Display(int Arr[][], int iRow, int iCol)
	{
		int temp = 0;
		for(int i=0;i<Arr.length;i=i+2)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				
				temp = Arr[i][j];
				Arr[i][j] = Arr[i+1][j];
				Arr[i+1][j] = temp;
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

class Program5
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

		obj.Display(Arr, iRow, iCol);
	}
}

