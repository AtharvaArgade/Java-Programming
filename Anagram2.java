import java.util.*;

class StringX
{
	boolean CheckAnagram(String str1, String str2)
	{
		int i = 0;
		int count[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		if(str1.length() != str2.length())
		{
			return false;
		}

		char arr[] = str1.toCharArray();
		char brr[] = str2.toCharArray();

		for(i=0;i<arr.length;i++)
		{
			count[arr[i]-'a']++;
			count[brr[i]-'a']--;
		}

		for(i=0;i<26;i++)
		{
			if(count[i] != 0)
				break;
		}

		if(i == 26)
			return true;
		else
			return false;
	}		
}

class Anagram2
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Please enter the first string");
		String str1 = sobj.nextLine();

		System.out.println("Please enter the second string");
		String str2 = sobj.nextLine();

		StringX obj = new StringX();
		boolean bRet = obj.CheckAnagram(str1, str2);
		if(bRet == true)
		{
			System.out.println("String are anagram");
		}
		else
		{
			System.out.println("String are not anagram");
		}
	}
}