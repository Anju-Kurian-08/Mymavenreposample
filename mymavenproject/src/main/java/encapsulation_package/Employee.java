package encapsulation_package;

public class Employee {
	
	int id;
	String name;
	Address address; //reference object of first class
	Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address; 
	}
	
	public void sample()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	

	public static void main(String[] args) {
		
		Address address1 =new Address("kumily","kerala","India");
		Address address2 =new Address("pampady","kerala","TN");
		Employee e =new Employee(1759,"anju",address1);
		Employee e1=new Employee(1749,"alex",address2);
		e.sample();
		e1.sample();
		
	}

}
