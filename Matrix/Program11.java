import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow, iCol);
	}

	public int BorderAddition()
	{
		int iSum = 0;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if((i==0) || (i==(Arr.length-1)) || (j==(Arr[i].length-1)) || (j==0))
				{
					iSum = iSum + Arr[i][j];
				}
			}
		}

		return iSum;
	}
}

class Program11
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int row = sobj.nextInt();

		System.out.println("Enter number of columns");
		int col = sobj.nextInt();
	
		Demo dobj = new Demo(row, col);
		dobj.Accept();
		dobj.Display();
		int ret = dobj.BorderAddition();
		System.out.println("Addition is:" + ret);
		System.gc();
	}
}