// Accept three numbers from user and display the largest number
// Input: 11  8  21
//  Output  :  21

import java.lang.*;
import java.util.Scanner;

class Selection
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter first number");
		int iNo1=sobj.nextInt();
		System.out.println("Enter second number");
		int iNo2=sobj.nextInt();
		System.out.println("Enter third number");
		int iNo3=sobj.nextInt();

		if((iNo1>iNo2) && (iNo1>iNo3))
		{
			System.out.println("Largest number is: "+iNo1);
		}
		else if((iNo2>=iNo1) && (iNo2>=iNo3))
		{
			System.out.println("Largest number is: "+iNo2);
		}
		else
		{
			System.out.println("Largest number is: "+iNo3);
		}
	}
}