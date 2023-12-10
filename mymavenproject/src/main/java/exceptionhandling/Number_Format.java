package exceptionhandling;

public class Number_Format {

	public static void main(String[] args) {
		
		try
		{
			String s="anju";
			int a=Integer.parseInt(s);
		}
		
		catch(NumberFormatException e)
		{
		System.out.println(e);	
		System.out.println("exception handled");
		}

	}

}
