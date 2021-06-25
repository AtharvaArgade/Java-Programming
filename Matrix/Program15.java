// . Write a program which accept matrix and display addition of elements From each column.  

import java.util.*;

class Demo 
{
	public void Display(int Arr[][], int iRow, int iCol)
	{
		int Add[] = new int[iCol];

		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Add[j] = Add[j]+Arr[i][j];
			}
		}
		for(int i=0;i<Add.length;i++)
		{
			System.out.print(Add[i]+"\t");
		}
	}
}

class Program4
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
