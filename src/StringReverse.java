
public class StringReverse {
	/**
	 * 
	 * @Author Saumya Singh
	 * 
	 * Interview Question---->
	 * 1 - Reverse any string
	 * 2 - Difference between String and String Buffer
	 * 3 - Can we usr Reverse function with String?---> No
	 */
	public static void main(String[] args)
	{
		String s = "Selenium Testing with Java";
		String reverse = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse = reverse+s.charAt(i);
		}
		System.out.println("Hi I am from String Class---> "+reverse);
	

	
	
	// 2nd Method using STring Buffer
	
	StringBuffer sb = new StringBuffer(s);
	System.out.println("Hi I am from String Buffer Class --------> "+sb.reverse());
	}
}
