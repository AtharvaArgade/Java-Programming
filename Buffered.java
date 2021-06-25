import java.io.*;

class Buffered
{
	public static void main(String arg[])
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(iobj);

		// we can write above two lines or below line
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

		System.out.println("Enter one number");
		int no=0;

		try          // Exception caught by try-catch block
		{
			no=Integer.parseInt(br.readLine());
		}
		catch(IOException obj)
		{

		}

		System.out.println("Entered number is : "+no);
	}
}