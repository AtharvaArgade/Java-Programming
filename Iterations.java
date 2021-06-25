// Accept number from user and display all the numbers till that number
// Input : 5
// Output : 1 2 3 4 5

import java.lang.*;
import java.util.Scanner;

class Iterations
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);		

		System.out.println("Please enter the number");
		int No = sobj.nextInt();
		int icnt=0;

		System.out.println("for loop");	
		for(icnt=1;icnt<=No;icnt++)
		{
			System.out.println(icnt);   
		}            
 
		System.out.println("while loop");
		icnt=1;          
		while(icnt<=No)    
		{
			System.out.println(icnt);    
			icnt++;                     
		}            

		System.out.println("do-while loop");
		icnt=1;      // 1
		do
		{
			System.out.println(icnt);     
			icnt++;                      
		}while(icnt<=No);                      
		
	}
}
