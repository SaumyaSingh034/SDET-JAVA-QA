
public class ArmstrongNumber {
	
	//153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
	public static void main(String[] args)
	{
		int num = 153;
		int temp = num;
		int r;
		int sum = 0;
		while(num>0)
		{
			r = num%10;
			sum =  (int) (sum+ Math.pow(r, 3));
			num= num/10;
		}
		System.out.println(sum);
		
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an armstrong");
		}

	}
	

}
