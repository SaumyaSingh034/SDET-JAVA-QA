interface K
{
	public void Test();
}
interface L
{
	public void Test2();
}

interface M extends K, L
{
	public void Test3();
}
public class InterfaceConcept implements M {

	@Override
	public void Test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Test3() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args)
	{
		
	}

}
