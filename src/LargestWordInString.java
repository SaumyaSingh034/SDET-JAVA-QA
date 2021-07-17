
public class LargestWordInString {
	
	
	public static void main(String[] args)
	{
		String str = "Hi My name is Saumya and I am going to be successful";
		int len = str.length();
		String words[] = str.split(" ");
		String word = "";
		//System.out.println(words[0]);
		//Hi
		//System.out.println(words[1]);
		//System.out.println(words[2]);
		//System.out.println(words[3]);
		//System.out.println(words[4]);
		int n = words[0].length();//2
		try
		{
			for(int i=1;i<=len-1;i++)
			{
				if(n<words[i].length()) //n=2   i=1
				{
					n = words[i].length();
					word = words[i];
					
				
					
					//System.out.println("The largest words in string is "+words[i]+" and length of word is : "+words[i].length());
				}
				
			}
			
		}catch(Exception arrayException )
		{
			
		}
		
		System.out.println(n);
		System.out.println(word);
		System.out.println("The largest words in string is "+word+" and length of word is : "+n);
	}

}
