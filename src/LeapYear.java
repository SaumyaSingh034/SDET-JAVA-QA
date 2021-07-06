
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double year = 2020;
		
		if(year % 4 ==0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					System.out.println("The given Year is Leap Year : "+year);
				}
				else
				{
					System.out.println("The given Year is Not a Leap Year : "+year);
				}
			}
			else
			{
				System.out.println("The given Year is Leap Year : "+year);
			}
		}else
		{
			System.out.println("The given Year is Not a Leap Year : "+year);
		}

	}

}
