import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow, int iCol)
	{
		super(iRow, iCol);
	}

	public void RowAddition()
	{
		int iSum = 0;
		for(int i=0;i<Arr.length;i++)
		{
			iSum = 0; 
			for(int j=0;j<Arr[i].length;j++)
			{
				iSum = iSum + Arr[i][j];
			}
			System.out.println("Addition of "+(i+1)+" row is :"+iSum);
		}
	}
}
class Program10
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
		dobj.RowAddition();
	
		System.gc();
	}
}