package exceptionhandling;

public class Array_Index {
	
	
	public void sample()
	{
		try
		{
		int arr[]= {1,2,3,4};
		System.out.println(arr[10]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Exception handled");
		}	
	}

	
	
		public static void main(String[] args) {
			
			Array_Index obj=new Array_Index();
			obj.sample();

	}

}
