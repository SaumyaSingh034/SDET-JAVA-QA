
public class Pattern_Program_Mindtree {
	
	/*
	 * 
	 **
	 ***
	 ****
	 */
	public static void main(String[] args)
	{
		/*
		 * 1 - Pattern -->
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 *
		 */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		/*
		 * 1
		 * 1 2
		 * 1 2 3 
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		/*
		 * A
		 * B B
		 * C C C
		 * D D D D
		 * E E E E E
		 */
		char last = 'E';
		char alphabet = 'A';
		
		for(int i=1;i<=(last - 'A' +1);i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(alphabet+" ");
			}
			++alphabet;
			System.out.println();
		}
		
		/*
		 * * * * *
		 * * * *
		 * * *
		 * *
		 * 
		 */
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		 1 2 3 4 5
		 1 2 3 4
		 1 2 3 
		 1 2 
		 1
		 */
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*
		 *5 4 3 2 1
		 *5 4 3 2 
		 *5 4 3
		 *5 4
		 *5
		 */
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		/*
		 * 1 1 1 1 1
		 * 2 2 2 2 
		 * 3 3 3 
		 * 4 4
		 * 5
		 */
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		/*
		 * Floyd Triangle
		 * 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	
	}

}
