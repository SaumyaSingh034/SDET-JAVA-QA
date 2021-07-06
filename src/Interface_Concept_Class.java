interface A
{
	public void Test();
}

interface B
{
	public void Test1();
	public void Test2();
}

interface C
{
	public void Test3();
	public void Test4();
}

interface D extends A, B, C
{
	public void Test5();
}


public class Interface_Concept_Class implements D{

	@Override
	public void Test() {
		System.out.println("Test()");
		
	}

	@Override
	public void Test1() {
		System.out.println("Test1()");
		
	}

	@Override
	public void Test2() {
		System.out.println("Test2()");
		
	}

	@Override
	public void Test3() {
		System.out.println("Test3()");
		
	}

	@Override
	public void Test4() {
		System.out.println("Test4()");
		
	}

	@Override
	public void Test5() {
		System.out.println("Test5()");
		
	}
	public static void main(String[] args)
	{
		Interface_Concept_Class ic = new Interface_Concept_Class();
		ic.Test();
		ic.Test1();
		ic.Test2();
		ic.Test3();
		ic.Test4();
		ic.Test5();
	}
	
	

}
