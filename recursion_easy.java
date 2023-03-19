package practice_questions;

public class recursion_easy {
	public static void printNumber(int n)
	{
		if(n==5) return ;
		else System.out.println(n);
		printNumber(n+1);
		
	}
	
	public static void SumNatural(int n,int i,int sum)
	{	sum +=i;
		if(i==n) 
		{	System.out.println(sum);return;} 
		
		SumNatural(n,i+1,sum);
	}

	public static  void main(String[] args)
	{
		int n=0;
		printNumber(n);
		int sum=0;
		int m=10;
		SumNatural(m,0,sum);
	}
}
