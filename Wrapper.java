class Wrapper
{
	public static void main(String arg[])
	{
		// Primitive datatype
		int i = 11;
		char ch = 'A';

		// AutoBoxing
		Integer iobj = i;
		Character cobj = ch;
		Integer iobj1 = new Integer(11);     // we get memory in heap section

		System.out.println("Value of integer is :"+iobj);
		System.out.println("Value of Character is :"+cobj);

		// Unboxing
		int j = iobj;
		char c = cobj;

		System.out.println("Value of integer is :"+j);
		System.out.println("Value of Character is :"+c);
	}
}
