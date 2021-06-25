import java.io.*;

class Buffered1
{
	public static void main(String arg[]) throws IOException    
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter one number");
		int no=0;

		no=Integer.parseInt(br.readLine());
		
		System.out.println("Entered number is : "+no);
	}
}
