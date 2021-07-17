
public class StringSwapWithoutTemp {
	
	public static void main(String[] args)
	{
		String a = "Hello";
		String b = "World";
		System.out.println("Before Swapping : ");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		
		
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("After Swapping : ");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		
	}

}
