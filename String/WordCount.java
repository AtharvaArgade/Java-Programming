import java.util.*;

class Demo
{
	public int WordCount(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");   //  [ ] it will consider  _ _ as both seperate spaces and //s will consider _ _ as single pair.		String Arr[] = temp.split(" ");
		String Arr[] = temp.split(" ");
		return Arr.length;
	}
}

class Program7
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the first string");
		String str = sobj.nextLine();
		
		Demo dobj = new Demo();
		int ret = dobj.WordCount(str);

		System.out.println("Number of words are :"+ret);
	}
}


