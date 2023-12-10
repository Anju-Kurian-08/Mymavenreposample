package abstraction;

public class Abstraction_SS2 extends  Abstraction_SS1{

	public void details()
	{
		System.out.println("this is my abstract method's defined method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction_SS2 obj=new Abstraction_SS2();
		obj.details();
		obj.details1(); //if not abstract method needs to be called needs to extend the class of non abstrcat method
	}

}
