import java.lang.*;

class Arithematic
{
	public int no1, no2;

	public Arithematic()
	{
		System.out.println("Default constructor");
		no1 = 0;
		no2 = 0;
	}
	public Arithematic(int x, int y)
	{
		System.out.println("Parametrised constructor");
		no1 = x;
		no2 = y;
	}
	public int Addition()
	{
		int ans = 0;
		ans = no1 + no2;
		return ans;
	}

	public int Substraction()
	{
		int ans = 0;
		ans = no1 - no2;
		return ans;
	}
}

class Marvellous
{
	public static void main(String xyz[])
	{
		Arithematic obj1 = new Arithematic();
		Arithematic obj2 = new Arithematic(50,30);

		int ret = obj2.Addition();
		System.out.println(ret);
		
		ret = obj2.Substraction();
		System.out.println(ret);
	}
}




