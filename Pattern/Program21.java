/* Write a java program which accept number of rows and number of 
columns from user and display below pattern. 
Input : iRow = 4 iCol = 4 
Output :
 * * * # 
 * * # * 
 * # * * 
 # * * *  
*/

import java.util.*;

class Demo
{
	public void Display(int iRow, int iCol)
	{
		for(int i=1;i<=iRow;i++)
		{
			for(int j=iCol;j>=1;j--)
			{
				if(i == j)
				{
					System.out.print("#\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
	}
}

class Program21
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int iRow = sobj.nextInt();

		System.out.println("Enter number of columns");
		int iCol = sobj.nextInt();

		Demo obj = new Demo();
		obj.Display(iRow, iCol);
	}
}
