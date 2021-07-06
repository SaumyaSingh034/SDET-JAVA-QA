
public class NaturalNumbers {

	public static void main(String[] args) {
		int num = 3;
		int sum = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++)

			{
				sum += i;
			}
			System.out.println("Sum of Natural Numbers are : " + sum);
		}
		else
		{
			System.out.println("You have entered incorrect number");
		}
	}
	
}
