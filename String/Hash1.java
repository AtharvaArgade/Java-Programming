import java.util.*;

class Demo
{
	public void CharacterFrequency(String str)
	{
		char Arr[] = str.toCharArray();
		int Frequency = 0;
		
		HashMap <Character,Integer> hobj = new HashMap<Character,Integer>();
		for(char ch : Arr)
		{
			if(hobj.containsKey(ch))
			{
				Frequency = hobj.get(ch);
				hobj.put(ch,Frequency+1);
			}
			else
			{
				hobj.put(ch,1);   // Inserting first time so value is 1
			}
		}
		System.out.println(hobj);
	}
}


class Hash1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the first string");
		String str = sobj.nextLine();
		
		Demo dobj = new Demo();
		dobj.CharacterFrequency(str);
	}
}


