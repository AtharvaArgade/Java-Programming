// Accept the radius of circle from user and calculate its area and circumference

import java.lang.*;
import java.util.*;     // import from the scanner class

class sequence
{
	public static void main(String arg[])
	{
		// create the object of scanner class by connecting with the keyboard ie System.in
		// System.in   Keyboard
		// System.out  Monitor
		// System.err  Monitor

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the radius of circle");	
		float radius;	

		radius = sobj.nextFloat();

		float area=3.14f*radius*radius;
		float circumference= 2*3.14f*radius;

		System.out.println("Area of circle is :"+area);
		System.out.println("Circumference of  circle is :"+circumference);
	}
}