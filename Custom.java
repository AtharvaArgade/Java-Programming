import java.util.*;     // util stands for utilities

class Student
{
	public String Name;
	public int Marks;
	public Student(String str, int no)
	{
		this.Name=str;
		this.Marks=no;
	}
	public void Display()
	{
		System.out.println("Name :"+this.Name+" Marks :"+this.Marks);
	}
}
class Custom
{
	public static void main(String arg[])
	{
		LinkedList <Student> ll = new LinkedList<Student>();
		Student sobj1 = new Student("Nikhil",89);
		ll.add(sobj);
		ll.add(new Student("Atharva",92));
		ll.add(new Student("Amar",36));
		ll.add(new Student("Ajay",56));

		//System.out.println("Linked List :"+ll);
		System.out.println("Size of linked list is :"+ll.size());

		Student ref=null;
		Iterator iobj = ll.iterator();
		// Iterator class has two method hasNext and next()
		System.out.println("Contents of linked list are:")
		while(iobj.hasNext())
		{
			ref=(Student)iobj.next();
			ref.Display();
		}
		ll.clear();   // clear the data from linked list.
	}
}