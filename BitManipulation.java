package practice_questions;

public class BitManipulation {
public static void main(String[] args) {
	int number=30;
	int pos=4;
	int mask=1<<pos;
	if((number & mask)==0) System.out.println("NOtset");
	else System.out.println("bit is set");
	
	int setbit=number|mask;
	System.out.println(setbit);
	
	int clearbit= number & (~mask);
	System.out.println(clearbit);
	
	if((number & mask)==0) number=number|mask;
	else number=number &(~mask);
	
	System.out.println(number);
	
}
}
