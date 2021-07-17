
public class LargestSmallestNumberInArray {
	
	public static void main(String[] args)
	{
		int arr[] = {-1,-33,-95,45,66,789,654674,-91};
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest = arr[i];
			}
			else if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
		System.out.println("Largest :: "+largest+" Smallest :: "+smallest);
		
		
		
		
		
		
	}

}
