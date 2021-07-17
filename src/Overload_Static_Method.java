
public class Overload_Static_Method {
	
	public static void foo()
	{
		System.out.println("Hi I am from foo");
	}
	
	public static void foo(int a)
	{
		System.out.println("Hi I am from foo int a = "+a);
	}
	
	public static void main(String[] args)
	{
		foo();
		foo(10);
	}

}
