import java.util.*;

class Demo
{
	public String Reverseword(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");  
		String Arr[] = temp.split(" ");
		String output = "";
		
		for(int i=0;i<Arr.length;i++)
		{
			StringBuffer bobj = new StringBuffer(Arr[i]);
			output = output + " " + bobj.reverse();
			bobj = null;
		}

		return output.trim();
	}
}

class Program13
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the first string");
		String str = sobj.nextLine();
		
		Demo dobj = new Demo();
		String ret = dobj.Reverseword(str);
		System.out.println(ret);
	}
}


