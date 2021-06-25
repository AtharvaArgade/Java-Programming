import java.util.*;

class Digits
{
	boolean CheckArmStrong(int iNo)
	{
		int iCnt = 0, temp = iNo, iSum = 0, iDigit = 0, iPow;
		
		while(temp != 0)
		{
			iCnt++;
			temp = temp/10;
		}

		temp = iNo;

		while(temp != 0)
		{
			iDigit = temp%10;
			iPow = 1;
			for(int i=1;i<=iCnt;i++)
			{
				iPow = iPow*iDigit ;
			}
			iSum = iSum +iPow;
			temp = temp/10;
		}

		if(iNo == iSum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Armstrong
{
	public static void main(String arg[])
	{
		int no ;
		boolean ret;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		no = sobj.nextInt();
		
		Digits dobj = new Digits();
		
		ret = dobj.CheckArmStrong(no);
		if(ret == true)
		{
			System.out.println("It is Armstrong number");
		}
		else
		{
			System.out.println("It is not Armstrong number");
		}
	}
}