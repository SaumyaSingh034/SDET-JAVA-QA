import java.util.ArrayList;
import java.util.Arrays;

import javax.sound.sampled.ReverbType;

public class Practice_Code {

	public static void main(String[] args) {
		
		
		String s = "Saumya";
		char c[] = s.toCharArray();
		int index = 0;
		int j =0;
		for(int i=0;i<s.length()-1;i++)
		{
			for( j=0;j<i;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println("Duplicate char : "+c[i]);
				}
			}
			if(j==i)
			{
				c[index++] = c[i];
			}
		}
	}

}
