/*  Write Java program which accept number of rows and number of columns 
from user and display below pattern. 
Input : iRow = 3 iCol = 4 
Output : 1 2 3 4 
		 5 6 7 8 
		 9 10 11 12 
*/

import java.util.*;

class Demo
{
	public void Pattern(int iRow, int iCol)
	{
		int k = 1;
		for(int i=1; i<=iRow; i++)
		{
			for(int j=1;j<=iCol;j++, k++)
			{
				System.out.print(k+"\t");
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

		Demo obj = new Demo();
		obj.Pattern(iRow, iCol);
	}
}

