package exceptionhandling;

public class Null_Pointer {
	
	
	public void sample()
	{
		try
		{
			String s=null;
			
			System.out.println(s.length());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		
		Null_Pointer obj=new Null_Pointer();
		obj.sample();
	}

}
