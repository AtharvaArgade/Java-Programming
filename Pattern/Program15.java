/*  Write Java program which accept String from user and display 
below pattern. 
Input : Hello 
Output :
 H 
 H e 
 H e l 
 H e l l 
 H e l l o 
 H e l l 
 H e l 
 H e 
 H 
*/

import java.util.*;

class Demo
{
	public void Display(String str)
	{
		char arr[] = str.toCharArray();
		int k = 0;
		for(int i=0;i<2*str.length()-1;i++)
		{
			if(i < str.length())
			{
				k++;
			}
			else if(i == str.length())
			{
				k= k-1;
			}
			else
			{
				k--;
			}

			for(int j=0;j<k;j++)
			{
				System.out.print(arr[j]+"\t");
			}

			System.out.println();
		}
	}
}

class Program15
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


