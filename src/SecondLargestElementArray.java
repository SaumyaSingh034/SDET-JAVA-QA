
public class SecondLargestElementArray {
	
	public static void main(String[] args)
	{
		int[] arr = {-99,-1,24,55,99,100,101,105};
		int largest = 0, secondLargest=0;
		for(int i=0;i<arr.length;i++)
		{
			largest = Math.max(largest, arr[i]);
		}
		System.out.println(largest);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=largest)
			{
				secondLargest = Math.max(secondLargest, arr[i]);
			}
		}
		System.out.println(secondLargest);
	}

}
