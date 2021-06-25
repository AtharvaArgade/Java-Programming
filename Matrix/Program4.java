import java.util.*;

class Matrix
{
	public int Arr[][];

	public Matrix(int iRow, int iCol)
	{
		Arr = new int[iRow][iCol];
	}

	protected void finalize()
	{
		Arr = null;
	}

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i = 0; i<Arr.length;i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				Arr[i][j] = sobj.nextInt();
			}
		}
	}

	public void Display()
	{
		System.out.println("Entered the elements");
		for(int i = 0; i<Arr.length;i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public int Addition()
	{
		int iSum = 0;
		for(int i = 0; i<Arr.length;i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				iSum = iSum + Arr[i][j];
			}
		}
		return iSum;
	}
}

class Program4
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int row = sobj.nextInt();

		System.out.println("Enter number of columns");
		int col = sobj.nextInt();
	
		Matrix mobj = new Matrix(row, col);
		mobj.Accept();
		mobj.Display();
		int iRet = mobj.Addition();

		System.out.println("Addition is :"+iRet);

		System.gc();
	}
}