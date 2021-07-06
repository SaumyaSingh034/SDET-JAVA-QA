import java.util.Scanner;

public class Pratice {
	
	public static void main(String[] args)
	{
		int year = 1900;
		
		if( year % 4 == 0) {
			if(year % 100 ==0)
			{
				if(year % 400 ==0)
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("Not an leap Year");
				}
			}else
			{
				System.out.println("Leap Year");
			}
		}else
		{
			System.out.println("Not an Leap Year");
		}
}
}
