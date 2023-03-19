package practice_questions;

import java.util.*;
public class ArrayListExample {
public static void main(String[] args)
{
	ArrayList<Integer> l =new ArrayList<Integer>();
	//
	//add elements
	l.add(2);
	l.add(3);
	l.add(3);
	System.out.println(l);
	//get element
	
	int ele=l.get(0);
	System.out.println(ele);
	
	//add between at i index add(i,number)
	l.add(1,1);
	System.out.println(l);
	
	//set element
	l.set(0, 5);
	System.out.println(l);
	
	//delete element
	l.remove(3);
	System.out.println(l);
	
	//size
	System.out.println(l.size());
	
	//sort
	Collections.sort(l);
	System.out.println(l);
}
}
