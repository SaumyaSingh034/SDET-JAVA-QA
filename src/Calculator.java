import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first and second number : ");
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		double result=0;
		
		System.out.println("Enter operator (+ , - , * , /)");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			result = first + second;
			break;
		case '*':
			result = first * second;
			break;
		case '-':
			result = first - second;
			break;
		case '/':
			result = first / second;
			break;
		default:
			System.out.println("Enter correct operator");
			
			
		}
		System.out.println(result);
	}

}
