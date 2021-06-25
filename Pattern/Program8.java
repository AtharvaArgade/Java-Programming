/* Write Java program which accept number of rows and number of 
columns from user and display below pattern. 
Input : iRow = 3 iCol = 5 
Output : 5 4 3 2 1 
		 5 4 3 2 1 
		 5 4 3 2 1 
*/

import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		for(int i=1; i<=iRow; i++)
		{
			for(int j=iCol;j>=1;j--)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}

class Program8
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int iRow = sobj.nextInt();

		System.out.println("Enter the number of columns");
		int iCol = sobj.nextInt();

		Pattern obj = new Pattern();
		obj.Pattern(iRow, iCol);
	}
}