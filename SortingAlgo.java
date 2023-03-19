package practice_questions;

import java.util.Scanner;

public class SortingAlgo {
public static void main(String[] args)
{	//int size;
//	Scanner sc=new Scanner(System.in);
//	size=sc.nextInt();
//	
//	int arr[]=new int[size];
//	for(int i=0;i<size;i++)
//	{
//		arr[i]=sc.nextInt();
//	}
//	
//	
	
//	//bubble sort
//	for(int i=0;i<size-1;i++)
//	{
//		for(int j=0;j<size-i-1;j++)
//		{
//			if(arr[j]>arr[j+1])
//			{
//				int temp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=temp;
//			}
//		}
//	}
//	for(int i=0;i<size;i++)
//	{
//		System.out.print(arr[i]+ " ");
//	}
	int arr2[]= {3,5,7,2,1,6,77,55,44,33,22,33,44};
	//selection sort
	for(int i=0;i<arr2.length-1;i++)
	{
		int smallest=i;
		for(int j=i+1;j<arr2.length;j++)
		{
			if(arr2[smallest]>arr2[j])
			{
				smallest=j;
			}
		}
		int temp=arr2[smallest];
		arr2[smallest]=arr2[i];
		arr2[i]=temp;
	}
	for(int i=0;i<arr2.length;i++)
	{
		System.out.print(arr2[i]+ " \n");
	}
	
	
	//insertion sort 
	for(int i=1;i<arr2.length;i++)
	{
		int curr=arr2[i];
		int j=i-1;
		while(j>=0 && arr2[j]>curr)
		{
			arr2[j+1]=arr2[j];
			j--;
		}
		arr2[j+1]=curr;
	}
	for(int i=0;i<arr2.length;i++)
	{
		System.out.print(arr2[i]+ " ");
	}
}
}
