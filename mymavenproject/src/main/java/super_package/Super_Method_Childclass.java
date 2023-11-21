package super_package;

public class Super_Method_Childclass extends Super_Method_Call{
	
	public void sample()
	{
		super.sample();
		System.out.println("THIS IS MY PARENT CLASS");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Method_Childclass obj=new Super_Method_Childclass();
		obj.sample();
	}

}
