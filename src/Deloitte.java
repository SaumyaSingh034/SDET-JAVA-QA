
public class Deloitte {
	
	public static void main(String[] args)
	{
		String a = "60";
		String b = "5";
		String actualValue = "";
		int value;
		
		if(a.equalsIgnoreCase(a.replaceAll("[^a-zA-Z]", "")))
		{
			if(b.equalsIgnoreCase(b.replaceAll("[^a-zA-Z]", "")))
			{
				actualValue = a+b;
				System.out.println("hey I am String + String = "+actualValue);
			}else if(b.equalsIgnoreCase(b.replaceAll("[^0-9]", "")))
			{
				actualValue = a+b;
				System.out.println("Hi I am String + int = "+actualValue);
			}
			
		}
		else if (a.equalsIgnoreCase(a.replaceAll("[^0-9]", ""))) {
			
			
			if(b.equalsIgnoreCase(b.replaceAll("[^a-zA-Z]", "")))
			{
				actualValue = a+b;
				System.out.println("hey I am int + String = "+actualValue);
			}
			else if(b.equalsIgnoreCase(b.replaceAll("[^0-9]", "")))
			{
				value = Integer.parseInt(a) + Integer.parseInt(b);
				System.out.println("Hey this is Int + Int = "+value);
			}
			
		}
		else
		{
			System.out.println("Seems like value you choosen is nethier satisfying any condition");
		}
	}

}
