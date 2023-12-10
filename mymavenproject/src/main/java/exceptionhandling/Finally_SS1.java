package exceptionhandling;

public class Finally_SS1 {

	public static void main(String[] args) {
		try
		{
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("exception handled");
		}
         finally
         {
        	 System.out.println("finally block is always executed whether exception handled or not");//followed by try and catch
         }
	}

}
