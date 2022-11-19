package org.encuplations;

import java.util.ArrayList;
import java.util.List;

public class Next extends Creat{
	public static void main(String[] args) {
		Next n = new Next();
		n.setAge(20);
		n.setName("main");
		Next m = new Next();
		m.setAge(30);
		m.setName("kiruba");
		
		List<Creat> a = new ArrayList<> ();
		a.add(n);
		a.add(m);
		System.out.println(a.get(1));;
		
	}
	
	 
		
		
		
		
	
	

}
