import java.util.HashMap;

public class DuplicateArray_Hash {
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,1,2,3};
		int n = arr.length;
		removeDuplicates(arr, n);
	}
	
	public static void removeDuplicates(int arr[], int n)
	{
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(map.get(arr[i])==null)
				System.out.println(arr[i]+" ");
			
			map.put(arr[i], true);
		}
	}

}
