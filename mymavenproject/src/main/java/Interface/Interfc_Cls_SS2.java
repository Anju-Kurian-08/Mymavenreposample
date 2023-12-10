package Interface;

public class Interfc_Cls_SS2 implements Interfc_SS1 {
	
	public void display()
	{
		System.out.println("this is my abstract method definition from interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfc_Cls_SS2 obj=new Interfc_Cls_SS2();
		obj.display();
	}

}
