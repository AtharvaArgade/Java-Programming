import java.util.*;

class StringX
{
	boolean CheckAnagram(String str1, String str2)
	{
		int k = 0, iCnt1 = 0, iCnt2 = 0, iCnt3 = 0;
		char arr[] = str1.toCharArray();
		char brr[] = str2.toCharArray();
		char ch;

		if(arr.length != brr.length)
		{
			return false;
		}

		while(k != (arr.length))
		{
			ch = arr[k];
			for(int i = 0;i<arr.length;i++)
			{
				if(arr[i] == ch)
				{
					iCnt1++;
				}
			}

			for(int j = 0;j<brr.length;j++)
			{
				if(brr[j] == ch)
				{
					iCnt2++;
				}
			}

			if(iCnt1 == iCnt2)
			{
				iCnt3++;
			}
			k++;
		}
		if(iCnt3 == arr.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Annagram
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