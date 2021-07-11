
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pratice
{
	public static void main(String args[]) 
	{ 
		for(int i=0;i<=5;i++)
		{
			for(int j=5-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	} 
}