import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementinArray {
	
	public static void main(String[] args)
	{
		String names[] = {"Java","C","Python","Ruby","Java","C++","JavaScript"};
		
		//1 - Checking each elemnt //O(n*n)
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate element in array :: "+names[i]);
				}
			}
		}
		System.out.println("Using Hash Set");
		
		
		//2 Using HashSet O(n)
		Set<String> store = new HashSet<String>();
		for(String name : names)
		{
			if(store.add(name) == false)
			{
				System.out.println("Duplicate element in array :: "+name);
			}
		}
		
		//3 Using HapMap O(2n)
		Map<String,Integer> storemap = new HashMap<String, Integer>();
		for(String name : names)
		{
			Integer count = storemap.get(name);
			if(count==null)
			{
				storemap.put(name, 1);
			}
			else
			{
				storemap.put(name, ++count);
			}
		}
		
		Set<Entry<String,Integer>> sentry = storemap.entrySet();
		for(Entry<String, Integer> enty : sentry)
		{
			if(enty.getValue()>1)
			{
				System.out.println("Duplicate element in array :: "+enty.getKey());
			}
		}
	}

}
