package collection;
import java.util.*;

public class Linkd_Lst {

	public static void main(String[] args) {
	
		LinkedList<Integer>obj=new LinkedList<Integer>();
		obj.add(30);
		obj.add(40);
		obj.add(80);
		obj.add(100);
		obj.add(10);
		
		obj.addAll(obj);
		obj.addAll(3, obj);
		obj.addFirst(21);
		obj.addLast(1000);
		obj.remove(1);
		obj.removeFirst();
		obj.removeLast();
		//obj.clear();
		System.out.println(obj.contains(30));
		
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		System.out.println(obj.indexOf(100));
		System.out.println(obj.size());
		System.out.println(obj);
		

	}

}
