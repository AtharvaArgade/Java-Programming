// javac Matrix.java -d .  (Command for creating the package)
package Marvellous;

import java.util.*;

public class Matrix
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
}
