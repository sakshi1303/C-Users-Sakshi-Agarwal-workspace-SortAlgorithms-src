package algo;

import java.util.Scanner;

public class Heap {

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
		Heap h=new Heap();
		h.maxHeap(arr,n);
		System.out.println("The sorted array elements are:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");


	}

	private void maxHeap(int[] arr, int n) {
		
		
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr, i, 0);
		}
		for(int k=0;k<n;k++)
			System.out.print(arr[k]+" ");
		System.out.println();
	}

	private void heapify(int[] arr, int n, int i) {
		
		int l=2*i+1;
		int r=2*i+2;
		int max=i;
		System.out.println("left="+l+"right="+r);
		System.out.println("max is "+max+" i= "+i);
		if(l<n && arr[l]>arr[i] && arr[l]>arr[max])
		{
			int temp= arr[l];
			arr[l]=arr[i];
			arr[i]=temp;
			max=l;
			System.out.println("l="+l+"r="+r);
		}
		if(r<n && arr[r]>arr[i] && arr[r]>arr[max])
		{
			int temp=arr[r];
			arr[r]=arr[i];
			arr[i]=temp;
			max=r;
			System.out.println("l="+l+" r="+r);
		}
		/*System.out.println("Intermediate Elements are:-");
		for(int k=0;k<n;k++)
			System.out.print(arr[k]+" ");
		System.out.println();*/
		System.out.println("max="+max+" i="+i);
		if(max!=i)
			heapify(arr,n,max);
		System.out.println("Intermediate  Elements are:-");
		for(int k=0;k<n;k++)
			System.out.print(arr[k]+" ");
		System.out.println();
	}
		
		
}
