package algo;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("The unsorted array elements are:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
		HeapSort hs=new HeapSort();
		hs.maxHeap(arr,n);
		System.out.println("The sorted array elements are:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");

	}
	void maxHeap(int[] arr, int n)
	{
		//System.out.println("Build Heap-");
		//for(i=0;i<n;i++)
			//System.out.println(min[i]);
			
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
			
		}
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	
		//for(int i=0;i<arr.length;i++)
			//System.out.print(arr[i]+"\t");
	}

	void heapify(int[] arr, int n, int i)
	{
		int l=2*i+1;
		int r=2*i+2;
		int max=i;
		System.out.println("left="+l+"right="+r);
		if(l<n && (arr[l]>arr[max]))
			max=l;	
		if(r<n && (arr[r]>arr[max]))
			max=r;
		if(max!=i)
		{
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
			heapify(arr,n,max);
		}
		System.out.println("Intermediate  Elements are:-");
		for(int k=0;k<n;k++)
			System.out.print(arr[k]+" ");
		System.out.println();
	}
}
