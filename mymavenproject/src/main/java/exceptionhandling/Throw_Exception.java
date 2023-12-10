package exceptionhandling;

public class Throw_Exception {
	
	public void show(int age)
	{
		if(age<18)
		{
			//System.out.println("else code not executes");// works
			throw new ArithmeticException("not eligible to vote");// throw new exception name(message)
		
		}
		else
		{
			System.out.println("eligible to vote");
		}
	}

	public static void main(String[] args) {
	
		Throw_Exception obj=new Throw_Exception();
		obj.show(10);
		//System.out.println("else code not executes"); // not works
		
	}

}
