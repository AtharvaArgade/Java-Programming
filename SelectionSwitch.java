// We need to accept the standard of the student and display the time of the exam depends on its standard
// Exam of 7th std is at 9am
// Exam of 8th std is at 10:30am
// Exam of 9th std is at 11am
// Exam of 10th std is at 11:30am

import java.lang.*;
import java.util.Scanner;

class SelectionSwitch
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Please enter your standard");
		int standard=sobj.nextInt();

		switch(standard)
		{
			case 7:
				System.out.println("Your exam is at 9am. All the best..");
			break;
			case 8:
				System.out.println("Your exam is at 10:30am. All the best..");
			break;
			case 9:
				System.out.println("Your exam is at 11am. All the best..");
			break;
			case 10:
				System.out.println("Your exam is at 11:30am. All the best..");
			break;
			default:
				System.out.println("Your exam standard is wrong");
		
		}

		
	}
}