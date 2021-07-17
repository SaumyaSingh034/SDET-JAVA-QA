
public class SingletonConcept {
	//create private constructor
	// create public static method returning the object of singlestonClass
	
	
	private static SingletonConcept sc = null;
	String str;
	
	private SingletonConcept()
	{
		str = "Hey I am getting define under private constructor of Singleston class";
	}
	public static String openBrowser()
	{
		String s = "Hi I am open browser";
		return s;
	}
	
	public static SingletonConcept getInstace()
	{
		if(sc==null)
			sc = new SingletonConcept();
		return sc;
	}
	
	
	public static void main(String[] args)
	{
		SingletonConcept x = SingletonConcept.getInstace();
		SingletonConcept y = SingletonConcept.getInstace();
		SingletonConcept z = SingletonConcept.getInstace();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		System.out.println(z.openBrowser());
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		System.out.println(z.openBrowser());
		
	}

}
