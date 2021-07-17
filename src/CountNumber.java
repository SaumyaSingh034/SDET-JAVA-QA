
public class CountNumber {
	
	public static void main(String[] args)
	{
		int num = 9877; //5
		int r, n = 0;
		
		while(num > 0)
		{
			//r = num%10;
			num= num/10;
			n++;
		}
		
		System.out.println("No. of Integer present is : "+n);
	}

}
