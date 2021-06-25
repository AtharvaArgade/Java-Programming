/* Write Java program which accept number of rows and number of 
columns from user and display below pattern. 
Input : iRow = 3 iCol = 4 
Output : * # * # 
		 * # * # 
		 * # * #  
*/

import java.util.*;

class Pattern
{
	public void Pattern(int iRow, int iCol)
	{
		for(int i=1; i<=iRow; i++)
		{
			for(int j=1;j<=iCol;j++)
			{
				if(j%2 != 0)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("#\t");
				}
			}
			System.out.println();
		}
	}
}

class Program9
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

