// Write a program which accept matrix and check whether the matrix is Sparse matrix or not.  
// Sparse matrix is a matrix with the majority of its elements equal to zero. 

import java.util.*;

class Demo 
{
	public boolean Sparse(int Arr[][])
	{
		int iCnt1 = 0, iCnt2 = 0;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if(Arr[i][j] == 0)
				{
					iCnt1++;
				}
				else
				{
					iCnt2++;
				}
			}
		}

		if(iCnt1 > iCnt2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Program21
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

		boolean ret = obj.Sparse(Arr);
		if(ret == true)
		{
			System.out.println("It is Sparse matrix");
		}
		else
		{
			System.out.println("It is not Sparse matrix");
		}
	}
}

