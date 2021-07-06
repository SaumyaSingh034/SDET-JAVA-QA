
public class RemoveJunkCharacters {
	
	public static void main(String[] args)
	{
		/**
		 * Here we will be using Regular Expression-->
		 * [^a-zA-Z0-9]
		 */
		String actual = "*&))(*&% SAUMYA^&**$)SIN*^^*GH((&&&&&& 847926710";
		String checking = "A2AA22AA";
		
		String actualData = "2ABhaiibfb89466ga7g6aju2";
		String data = "57HAN87HK9H7n4689z7f909g";
		String intData = "";
		String stringData = "";
		
		
//		System.out.println(actual.replaceAll("[^a-zA-Z0-9]", ""));
//		System.out.println(checking.replaceAll("[0-9]", ""));
//		
		if(actualData.replaceAll("[^0-9]", "") != null)
		{
			 intData = intData+data.replaceAll("[^0-9]", "");
			
		}//else if (data.replaceAll("[^a-zA-Z]", "") != null) {
			
		stringData = stringData+data.replaceAll("[^a-zA-Z]", "");
			
		
		System.out.println("Integer Dta aonly--->  "+intData);
		System.out.println("Here we are expecting STring data Only----->"+stringData);
		
	}

}
