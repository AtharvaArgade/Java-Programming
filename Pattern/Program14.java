/* Write Java program which accept String from user and display 
below pattern. 
Input : Hello 
Output :
 H e l l o 
 H e l l 
 H e l 
 H e 
 H 
 H e 
 H e l 
 H e l l 
 H e l l 0
*/

import java.util.*;

class Demo
{
	public void Display(String str)
	{
		char arr[] = str.toCharArray();
		
		int k = str.length();
		for(int i=0;i<2*arr.length-1;i++)
		{
			for(int j=0;j<k;j++)
			{
				System.out.print(arr[j]+"\t");
			}
			System.out.println();
			if(i >= str.length()-1)
			{
				k++;
			}
			else
			{
				k--;
			}
		}
	}
}

class Program14
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

