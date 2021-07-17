
public class Palindrome_String {
	
	public static void main(String[] args)
	{
		String s = "Madam";
		String rev = "";
		
		for(int i = s.length()-1; i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(" Reverse of String is : "+rev);
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}
	}

}
