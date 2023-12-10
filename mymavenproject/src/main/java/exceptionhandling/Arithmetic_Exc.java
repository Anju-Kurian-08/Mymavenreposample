package exceptionhandling;

public class Arithmetic_Exc {

	public static void main(String[] args) {
		
		try
		{
			int a=10/0;// arithmetic exception
		}
		
		catch(ArithmeticException e)// e is the object
		{
			System.out.println(e);
			System.out.println("exception handled");
		}

	}

}
