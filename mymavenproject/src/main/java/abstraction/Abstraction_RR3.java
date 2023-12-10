package abstraction;

public class Abstraction_RR3 extends Abstraction_RR2{
	
	public void sample()
	{
		System.out.println("this is my sample abstract method definition");
	}
   public void details()
   {
	   System.out.println("this is my details abstract method definition");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction_RR3 obj=new Abstraction_RR3();
		obj.sample();
		obj.details();
		obj.details1();
		//obj.sample1();
	}

}
