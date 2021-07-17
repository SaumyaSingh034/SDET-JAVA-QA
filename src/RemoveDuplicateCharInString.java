import java.util.Arrays;

public class RemoveDuplicateCharInString {
	
	public static void main(String[] args)
	{
		String s = "HHHHellllooooooo";
		char str[] = s.toCharArray();
		int len = str.length;
		removeDuplicate(str,len);
	}
	public static void removeDuplicate(char str[], int length)
	{
		int index=0;
		int j;
		for(int i=0;i<length;i++)
		{
			for(j=0;j<i;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println("Duplicate character found : "+str[i]);
					break;
				}
			}
			if(j==i)
			{
				str[index++] = str[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(str, index)));
	}

}
