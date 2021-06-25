/*  Write a program which accept matrix from user and return addition of diagonal elements. */

import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow, iCol);
	}

	public int Addition()
	{
		int iSum = 0;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if(i == j)
				{
					iSum = iSum+Arr[i][j];
				}
			}
		}
		return iSum;
	}
}

class Program1
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int iRow = sobj.nextInt();

		System.out.println("Enter the number of columns");
		int iCol = sobj.nextInt();

		Demo obj = new Demo(iRow, iCol);

		obj.Accept();
		obj.Display();

		int ret = obj.Addition();
		System.out.println("Addition of diagonal elements is :"+ret);
	}
}
