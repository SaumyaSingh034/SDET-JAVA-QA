
public class SwapTwoNumbers {
	
	public static void main(String[] args)
	{
		int a = 808;
		int b = 911;
		/**
		 * This can be done by two methods.
		 * 1 - Using 3rd variable
		 * 
		 * 2 - without using 3rd variable
		 */
		
		
		//Using temp variable
//		int temp;
//		System.out.println("Before Swapping---> Value of a : "+a);
//		System.out.println("Before Swapping---> Value of b : "+b);
//		
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("After Swapping---> Value of a : "+a);
//		System.out.println("After Swapping---> Value of b : "+b);
		
		System.out.println("Before Swapping---> Value of a : "+a);
		System.out.println("Before Swapping---> Value of b : "+b);
		
		
		//Without using temp variable
		a = a+b; //a=2, b=3 2+3 =5
		b = a-b; //5-3 = 2
		a = a-b; //2-
		
		System.out.println("After Swapping---> Value of a : "+a);
		System.out.println("After Swapping---> Value of b : "+b);
				
	}

}
