
public class StringManipulation {
	
	public static void main(String[] args)
	{
		String s = "Hello I am from Pune and learning Selenium with Java and I enjoy learning";
		System.out.println(s.length());
		
		System.out.println(s.charAt(6));
		System.out.println(s.indexOf('o'));
		
		System.out.println(s.indexOf('e', s.indexOf('e')));
		int count = 0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i) == 'e')
			{
				count++;
			}
		}
		System.out.println("The number of occurence of e is : "+count);
		
		System.out.println(s.replace('e', 'o'));
	}

}
