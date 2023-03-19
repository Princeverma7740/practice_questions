package practice_questions;

import java.util.Scanner;

public class stringbuilderexample {
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("PPrincce");
		sb.append("e");
		sb.append("k");
		sb.append("k");
		sb.append("k");
		sb.append("k");
		sb.append("k");
		sb.append("k");
		sb.append("k");
//		Scanner sc =new Scanner(System.in);
//		sb=sc.nextLine();
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
	sb.setCharAt(2, 'P');
	System.out.println(sb);
	sb.insert(0,'K');
	System.out.println(sb);
	
	sb.delete(0, 2);
	System.out.println(sb);
	
	
	//reverse a string
	for(int i=0;i<sb.length()/2;i++)
	{
		int front=i;
		int back=sb.length()-1-i;
		char f=sb.charAt(front);
		char b=sb.charAt(back);
		sb.setCharAt(front, b);
		sb.setCharAt(back, f);
	}
	System.out.println(sb);
	}
	
}
