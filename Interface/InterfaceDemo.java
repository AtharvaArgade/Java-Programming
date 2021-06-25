
interface Figures
{
	public float PI=3.14f;

	public float Area(float radius);
	public float Circumference(float radius);
}

class Circle implements Figures
{
	public float Area(float radius)
	{
		return PI * radius * radius;
	}
	public float Circumference(float radius)
	{
		return 2 * PI * radius;
	}
}

class InterfaceDemo
{
	public static void main(String arg[])
	{
		Circle obj = new Circle();
		System.out.println("Area is : "+obj.Area(10.5f));
		System.out.println("Circumference is : "+obj.Circumference(10.5f));
		System.out.println("Value of PI is : "+Figures.PI);
	}
}