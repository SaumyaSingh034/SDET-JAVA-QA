import java.util.HashMap;

public class RemoveDuplicateAndPutInHashMap {
	
	
	static void removeDumps(int arr[], int n)
	{
		HashMap<Integer, Boolean> mp = new HashMap<>();
		
		for(int i =0; i < n; i++)

	{
			//If element is not there in HashMap
			if(mp.get(arr[i])==null)
				System.out.println(arr[i]+" ");
			mp.put(arr[i], true);
	}
	}
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,5,7,2,1,2,1,1,2,7,8,9};
		int n = arr.length;
		removeDumps(arr, n);
		
	}

}
