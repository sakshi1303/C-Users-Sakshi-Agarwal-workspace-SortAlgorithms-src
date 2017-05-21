package algo;

import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
		
		int sum=0;
		int res=Integer.MIN_VALUE;
		for(int i=1;i<=arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i+j>n)
					break;
				sum=subArray(arr,i,j);
				if(sum>res)
					res=sum;
			}
			System.out.println("result="+res);
		}
		System.out.println("Final result="+res);
	}

	public static int subArray(int[] arr,int i, int j) {
		
		int sum=0;
		for(int k=j;k<(i+j);k++)
		{
			sum=sum+arr[k];
			System.out.print(arr[k]+" ");
		}
		System.out.println("sum="+sum);
		return sum;
	}

}
