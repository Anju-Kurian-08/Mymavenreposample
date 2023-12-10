package Interface;

public class Interfac_Class_Child implements Interfac_Parent1,Interfac_Parent2{
	
	public void sample()
	{
		System.out.println("this is my 1st parent class method");
	}
 public void display() {
	 System.out.println("this is my 2nd parent class method");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfac_Class_Child obj=new Interfac_Class_Child();
		obj.display();
		obj.sample();

	}

}
