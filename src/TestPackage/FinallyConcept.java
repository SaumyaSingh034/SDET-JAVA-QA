package TestPackage;

public class FinallyConcept {
	public static void main(String[] ags)
	{
		//show();
		test1();
	}
	
	public static void show()
	{
		try
		{
			System.out.println("This is from try block");
		}catch(Exception e)
		{
			System.out.println("This is from catch block");
		}
		finally
		{
			System.out.println("this is from finally block");
		}
	}
	
	public static void test1()
	{
		int i = 10;
		try
		{
			System.out.println("This is from try block");
			int k = i/0;
		}catch(ArithmeticException e)
		{
			System.out.println("This is from catch block");
		}
		finally
		{
			System.out.println("this is from finally block");
		}
	}

}
