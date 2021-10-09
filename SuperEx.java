class Person
{
	void message()
	{
		System.out.println("This is person class");
	}
}
class Student extends Person
{
	void message()
	{
		System.out.println("This is students class");
	}
void display()
	{
		message();
		super.message();
	}
}
class SuperEx
{
	public staic void main(String args[])
	{
		Student s = new Person();
		Person p = new Person();
		p.message();
		s.display();
		s.message();
	}
}
