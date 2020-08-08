package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class arraylistss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al =new ArrayList();
		
		al.add("Style");
		al.add("Ballon");
		al.add("Java");
		al.add("Selenium");
		al.add("Apple");
		
		System.out.println(al.get(1));
		
		LinkedList<String> ll=new LinkedList();
		ll.add("Jamun");
		ll.add("Angur");
		ll.add("mango");
		ll.add("guava");
		
		System.out.println(ll.get(2));
		
	}

}
