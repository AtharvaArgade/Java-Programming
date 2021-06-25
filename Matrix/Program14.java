// Write a program which accept matrix and return largest number from both the diagonals  

import java.util.*;

class Demo 
{
	public int Maximum(int Arr[][], int iRow, int iCol)
	{
		int iMax = Arr[0][0];
		int k = iRow-1;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if((i == j) ||(i+j == k))
				{
					if(Arr[i][j] > iMax)
					{
						iMax = Arr[i][j];
					}
				}
			}
		}
		return iMax;
	}
}

class Program3
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

		int ret = obj.Maximum(Arr, iRow, iCol);
		System.out.println("Maximum diagonal element is :"+ret);
	}
}