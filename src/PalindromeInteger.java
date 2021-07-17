
public class PalindromeInteger {
	
	public static void main(String[] args)
	{
		int num = 141;
		int temp = num;
		int r, sum=0;
		
		while(num > 0)
		{
			r = num %10;
			sum = (sum * 10) + r;
			num = num/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Palindrome---");
		}
		else
		{
			System.out.println("Non- Palindrome");
		}
	
	}

}
