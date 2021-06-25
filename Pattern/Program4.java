/*  Write Java program which accept number of rows and number of columns 
from user and display below pattern. 
Input : iRow = 4 iCol = 5 
Output : 4 4 4 4 4 
		 3 3 3 3 3 
		 2 2 2 2 2 
		 1 1 1 1 1 
*/

import java.util.*;

class Demo
{
	public void Pattern(int iRow, int iCol)
	{
		int k = iRow;
		for(int i=1; i<=iRow; i++, k--)
		{
			for(int j=1;j<=iCol;j++)
			{
				System.out.print(k+"\t");
			}
			System.out.println();
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

		Demo obj = new Demo();
		obj.Pattern(iRow, iCol);
	}
}

