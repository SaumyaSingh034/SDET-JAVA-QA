
public class PrimeNumber {
	public static void main(String[] args)
	{
		int num = 45;
		boolean flag = false;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				
				flag = false;
				break;
			}else
			{
				flag = true;
			}
		}
		if(flag==true)
		{
			System.out.println("Prime Number");
			
		}else
		{
			System.out.println("Not a Prime Number");
		}
	}

}
