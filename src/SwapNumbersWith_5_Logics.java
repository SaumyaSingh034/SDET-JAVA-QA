
public class SwapNumbersWith_5_Logics {
	
	public static void main(String[] args)
	{
		int a = 10;
		int b= 90;
		
		/*
		 * Logic 1  - Using third variable
		 
		System.out.println("Before Swapping variables --> a = "+a+" b = "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		
		System.out.println("After Swapping variables --> a = "+a+" b = "+b);
		
		*/
		
		/*
		 * Logic 2 - With out using third variable
		 
		System.out.println("Before Swapping variables --> a = "+a+" b = "+b);
		a = a+b; // 10+90 = 100
		b = a-b; // 100-90 = 10
		a = a-b; // 100-10 = 90
		
		System.out.println("After Swapping variables --> a = "+a+" b = "+b);
		
		*/
		
		/*
		 * Logic 3- With out using third variabe
		 
		System.out.println("Before Swapping variables --> a = "+a+" b = "+b);
		a = a*b; // 10*90 = 900
		b = a/b; // 900/90 = 10
		a = a/b; // 900/10 = 90
		
		System.out.println("After Swapping variables --> a = "+a+" b = "+b);
		*/
		/*
		 * Logic 4 - With using bitwise operator
		 * 
		 
		
		System.out.println("Before Swapping variables --> a = "+a+" b = "+b);
		a = a^b; // 10*90 = 900
		b = a^b; // 900/90 = 10
		a = a^b; // 900/10 = 90
		
		System.out.println("After Swapping variables --> a = "+a+" b = "+b);
		
		*/
		/*
		 * Logic 5 - In SIngle Statement
		 */
		System.out.println("Before Swapping variables --> a = "+a+" b = "+b);
		
		b = a+b-(a=b); 
		
		System.out.println("After Swapping variables --> a = "+a+" b = "+b);

	}

}
