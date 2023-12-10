package collection;

import java.util.*; //import all  or
//import java.util.ArrayList;
//import java.util.List;

public class Collectn_SS1_ArrayList {
	
	

	public static void main(String[] args) {
		
		//ArrayList<Integer>obj =new ArrayList<Integer>(); or
		List<Integer>obj =new ArrayList<Integer>();
		obj.add(12);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		obj.add(16);
		
	
		obj.remove(1); //to remove any data in index 
		//obj.addAll(obj);
		//obj.addAll(3, obj);
		//obj.clear();
		System.out.println(obj);
		System.out.println(obj.contains(17));
		System.out.println(obj.indexOf(14));
		
	
	}

}
