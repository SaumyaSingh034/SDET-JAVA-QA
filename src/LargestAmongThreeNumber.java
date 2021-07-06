
public class LargestAmongThreeNumber {
	
	public static void main(String[] args)
	{
		int x = 15;
		int y = 15;
		int z = 15;
		
		if(x >= y)
		{
			if(x >= z)
			{
				System.out.println("X is the largest Number : "+x);
			}
			else
			{
				System.out.println("Z is the largest Number : "+z);
			}
		}
		else if(y >= z)
		{
			System.out.println("Y is the largest Number : "+y);
		}
		else
		{
			System.out.println("Z is the largest Number : "+z);
		}
	}

}
