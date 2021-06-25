/* Write Java program which accept number of rows and number of columns 
from user and display below pattern. 
Input : iRow = 3 iCol = 5 
Output : A A A A A 
	 B B B B B 
	 C C C C C 
*/

import java.util.*;

class Demo
{
	public void Pattern(int iRow, int iCol)
	{
		char ch = 'A';
		for(int i=1; i<=iRow; i++, ch++)
		{
			for(int j=1;j<=iCol;j++)
			{
				System.out.print(ch+"\t");
			}
			System.out.println();
		}
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

		Demo obj = new Demo();
		obj.Pattern(iRow, iCol);
	}
}
