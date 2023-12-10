package Interface;

public class Class_SS3 implements Interfac_Parent_SS1,Interfac_Parent_SS2 {
	
	public void display() {
		System.out.println("this is the common method from 2 parent class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_SS3 obj=new Class_SS3();
		obj.display();
		
	}

}
