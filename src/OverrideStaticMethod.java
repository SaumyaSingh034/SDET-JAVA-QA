
public class OverrideStaticMethod extends Override_Static_Method{
	
	public static void display()
	{
		System.out.println("Hi I am static from drived class");
	}
	
	public void print()
	{
		System.out.println("Hi I am non-static method from derived class");
	}
	
	
	public static void main(String[] args)
	{
		Override_Static_Method osm = new OverrideStaticMethod();
		osm.display();
		osm.print();
		
	}

}
