import java.util.*;


class Program1
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int row = sobj.nextInt();

		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		int Arr[][] = new int[row][col];

		System.out.println("Enter the elements");
		for(int i = 0; i<Arr.length;i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				Arr[i][j] = sobj.nextInt();
			}
		}

		System.out.println("Entered the elements");
		for(int i = 0; i<Arr.length;i++)
		{
			for(int j = 0; j < Arr[i].length; j++)
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}

		Arr = null;   // call the garbage collector to clean the memory
	}
}