package encapsulation_package;

public class Finally_Study {
	
	final int a=100;
	public void finalsample()
	{
		a=40;
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finally_Study obj=new Finally_Study();
		obj.finalsample();
	}

}
