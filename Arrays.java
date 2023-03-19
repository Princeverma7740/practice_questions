package practice_questions;

import java.util.Scanner;

public class Arrays {
public static void main(String[] args)
{
	int[] arr1= new int[4];
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=sc.nextInt();
	}
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
	
	int size=4;
	int x=12;
	int counter=1;
	int matrix[][] =new int[size][size];
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			matrix[i][j]=counter++;
		}
	}
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{   if(x==matrix[i][j])
			System.out.print("index are "+ i+"," +j);
		}
		System.out.println();
	}
}
}
