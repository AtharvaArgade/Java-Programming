// Write a program which accept matrix and one number from user and return frequency of that number.  

import java.util.*;

class Demo 
{
	public int Frequency(int Arr[][], int iRow, int iCol, int iNo)
	{
		int iCnt = 0;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if(Arr[i][j] == iNo)
				{
					iCnt++;
				}
			}
		}
		return iCnt;
	}
}

class Program2
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

		System.out.println("Enter the number");
		int iNo = sobj.nextInt();

		Demo obj = new Demo();

		int ret = obj.Frequency(Arr, iRow, iCol, iNo);
		System.out.println("Frequency of element is :"+ret);
	}
}
