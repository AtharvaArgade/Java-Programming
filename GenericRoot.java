import java.util.*;

// 927  -> 18 -> 9
// 9975 -> 30 -> 3

class Digits
{
	int GenRoot(int iNo)
	{
		int iSum = iNo;

		while(iSum > 9)
		{
			iNo = iSum;
			iSum = 0;
			while(iNo != 0)
			{
				iSum = iSum + (iNo % 10);
				iNo = iNo / 10;
			}
		}
		
		return iSum;
	}
}
class GenericRoot
{
	public static void main(String arg[])
	{
		int no , ret;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		no = sobj.nextInt();
		
		Digits dobj = new Digits();
		
		ret = dobj.GenRoot(no);
		System.out.println("Generic root is : "+ret);
	}
}