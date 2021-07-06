
public class FactorialNumber {
	
	public static void main(String[] args)
	{
		int num = 5;
		int factorial;
		factorial = getFact(num);
		System.out.println("Factorial of "+num+" is : "+factorial);
	}
	public static int getFact(int num)
	{
		
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		return fact;
	}

}
