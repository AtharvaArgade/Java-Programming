/*  Write a program which accept matrix from user and display transpose of the 
matrix.  */

import java.util.*;

class Demo 
{
	public void Transpose(int Arr[][])
	{
		int Temp = 0;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=i+1;j<Arr[i].length;j++)
			{
				Temp = Arr[i][j];
				Arr[i][j] = Arr[j][i];
				Arr[j][i] = Temp;
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

class Program17
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

		obj.Transpose(Arr);
	}
}
