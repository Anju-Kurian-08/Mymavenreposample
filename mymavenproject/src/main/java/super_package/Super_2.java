package super_package;

public class Super_2 extends Super_Keyword{
	
	int a=79;
	
	public void sample()
	{
		System.out.println(super.a);
		System.out.println(a);
		
	}
public static void main(String args[])
{
	Super_2 obj=new Super_2();
	obj.sample();
}
}
