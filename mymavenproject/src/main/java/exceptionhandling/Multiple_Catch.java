package exceptionhandling;

public class Multiple_Catch {

	public static void main(String[] args) {
		try
		{
			int i=10/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("exception handled");
		}
        catch(ArrayIndexOutOfBoundsException e)
		{
        	System.out.println(e);
        	System.out.println("exception handled");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("exception handled");
		}
	}

}
