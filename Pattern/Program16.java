/* Write Java program which accept String from user and display 
below pattern. 
Input : Hello 
Output : H * * * * 
		 H e * * * 
		 H e l * * 
		 H e l l * 
*/

import java.util.*;

class Demo
{
	public void Display(String str)
	{
		char arr[] = str.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(j <= i)
				{
					System.out.print(arr[j]+"\t");
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

class Program16
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sobj.nextLine();

		Demo obj = new Demo();
		obj.Display(str);
	}
}
