
public class CalulatePowerOfNumber {
	public static void main(String[] args)
	{
		int base = 3;
		int exp = 2;
		int res = 1;
		
		while(exp>0)
		{
			res = res*base;
			--exp;
		}
		System.out.println(res);
	}

}
