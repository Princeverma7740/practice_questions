package practice_questions;

import java.util.*;

public class Print_pattern {
/**
 * @param args
 */
public static void main(String[] args)
{
	System.out.println("*");
	System.out.println("**");
	System.out.println("***");
	System.out.println("****");
	
//	Scanner sc=new Scanner(System.in);
//	//String name=sc.nextLine();
//	String name=sc.next();
//	
//	System.out.println(name);
	
//	*****
//	*****
//	*****
//	*****
	
	System.out.println();
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	
	
	
//	*****
//	*   *
//	*   *
//	*****
	/*int n,m;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	m=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=m;j++)
		{
			if(i==1 || i==n || j==1|| j==m)
			{
				System.out.print("*");
			}
			else
			System.out.print(" ");
			
		}
		System.out.println();
	}
	*/
	
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int i=4;i>=1;i--)
	{
		for(int j=i;j>=1;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5-i+1;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
	System.out.println();
	int counter=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" " +counter++);
		}
		System.out.println();
	}
	
	
	System.out.println();
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if((i+j)%2==0) System.out.print("1");
			else System.out.print("0");
		}
		System.out.println();
	}
	
	System.out.println(); 
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		int space=2*(n-i);
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		int space=2*(n-i);
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=5;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
	
	System.out.println();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=5;j++)
		{
			if(i==1||j==5||i==5||j==1) System.out.print("*");
			else System.out.print(" ");
		}
		System.out.println();
		
	}
	
	
	
	System.out.println();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		} 
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		
	}
	
	System.out.println();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
		}
		for(int j=2;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
	System.out.println();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	for(int i=n;i>=1;i--)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
}

}
