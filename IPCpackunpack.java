import java.util.*;

class IPC
{
	public int Pack(int no1, int no2, int no3, int no4)
	{
		int output  = 0x00000000;
		no1 = no1<<24;
		no2 = no2<<16;
		no3 = no3<<8;

		output = no1 | no2 | no3 | no4;

		return output;
	}

	public void Unpack(int output)
	{
		int no1 = 0, no2 = 0, no3 = 0, no4 = 0;
		int iMask = output;

		no1 = iMask>>24;

		iMask = output;
		iMask = iMask>>16;
		int iMask2 = 0x000000ff;
		no2 = iMask & iMask2;

		iMask = output;
		iMask = iMask>>8;
		no3 = iMask & iMask2;

		iMask = output;
		no4 = iMask & iMask2;

		System.out.println("No1 :"+no1+" No2 : "+no2+" No3 : "+no3+" No4 : "+no4);
	}
}

class IPCpackunpack
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Please enter first number");
		int no1 = sobj.nextInt();

		System.out.println("Please enter second number");
		int no2 = sobj.nextInt();

		System.out.println("Please enter third number");
		int no3 = sobj.nextInt();

		System.out.println("Please enter fourth number");
		int no4 = sobj.nextInt();

		IPC obj = new IPC();
		int iRet = obj.Pack(no1, no2, no3, no4);
		System.out.println(iRet);
		
		obj.Unpack(iRet);
	}
}