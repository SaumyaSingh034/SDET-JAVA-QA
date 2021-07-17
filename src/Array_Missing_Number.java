
public class Array_Missing_Number {
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,9,10};
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		System.out.println(sum);
		for(int j=1;j<=10;j++)
		{
			sum1 = sum1+j;
		}
		System.out.println(sum1);
		System.out.println("missing number :: "+(sum1-sum));
	}

}
