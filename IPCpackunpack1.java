import java.util.*;

class IPC
{
	public int Pack(int no1, int no2, int no3, int no4)
	{
		return ((no1<<24) | (no2<<16) | (no3<<8) | no4);
	}

	public void Unpack(int no)
	{
		int no1 = 0, no2 = 0, no3 = 0, no4 = 0;
		
		no4 = no & 0x000000ff;
		no3 = no >> 8;
		no3 = no3 & 0x000000ff;
		no2 = no >> 16;
		no2 = no2 & 0x000000ff;
		no1 = no >>24;

		System.out.println("First number : " + no1);
		System.out.println("Second number : " + no2);
		System.out.println("Third number : " + no3);
		System.out.println("Fourth number : " + no4);
	}
}

class IPCpackunpack1
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
		System.out.println("Packed number is : "+iRet);
		
		obj.Unpack(iRet);
	}
}