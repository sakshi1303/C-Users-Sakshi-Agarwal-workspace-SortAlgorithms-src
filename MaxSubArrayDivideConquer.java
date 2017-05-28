package algo;

import java.util.Scanner;

public class MaxSubArrayDivideConquer {

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
		int res=subArray(arr,0,n);
		
		System.out.println("Length of Max SubArray="+res);

	}

	private static int subArray(int[] arr, int l, int n) {
		
		if(n==1)
			return arr[0];
		int m=n/2;
		int lsum=subArray(arr,0,m);
		int rsum=subArray(arr,m+1,n-1);
		int sum=maxCrossingSum(arr,n);
		return Math.max(Math.max(lsum,rsum),sum);
	}

	private static int maxCrossingSum(int[] arr, int n) {
		
		int m=n/2;
		int sum=0;
		int lsum=Integer.MIN_VALUE;
		int rsum=Integer.MIN_VALUE;
		for(int i=m-1;i>=0;i--)
		{
			sum=sum+arr[i];
			if(sum>lsum)
				lsum=sum;
		}
		System.out.println("lsum="+lsum);
		sum=0;
		for(int i=m;i<n;i++)
		{
			sum=sum+arr[i];
			if(sum>rsum)
				rsum=sum;
		}
		System.out.println("rsum="+rsum);
		return lsum+rsum;
	}

}
