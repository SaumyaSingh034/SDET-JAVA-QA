
public class NegativeNumber {
	
	public static void main(String[] args)
	{
	int flag = 0;
	int num = 191;
	for(int i =2;i<num;i++)
	{
		if(num%i==0)
		{
			flag = 0;
			break;
			
		}
		else
		{
			flag=1;
		}
	}
	if(flag == 1)
	{
		System.out.println("prime");
	}
	else
	{
		System.out.println("No Prime");
	}
	 
		
	}

}
