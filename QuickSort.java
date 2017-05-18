package algo;

import java.util.Scanner;

public class QuickSort {

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
		int left=0, right=n-1;
		
		quicksort(arr,left,right);
		
		System.out.println("The sorted array elements are:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}

	public static void quicksort(int[] arr, int left, int right) {
		
		if(left<right){
			int pi=partition(arr,left,right);
			System.out.println("pi="+pi);
			System.out.println("Splitting left half");
			System.out.println("left="+left+"right="+(pi-1));
			quicksort(arr,left,pi-1);
			System.out.println("Splitting right half");
			System.out.println("left="+(pi+1)+"right="+right);
			quicksort(arr,pi+1,right);
		}
		
	}

	public static int partition(int[] arr, int left, int right) {
		
		int pivot=arr[left];
		int temp;
		int pos=0;
		while(left<right)
		{
			while(pivot<arr[right] && pivot==arr[left])
				right--;
			if(left!=right)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				pivot=arr[right];
			}
			while(pivot>arr[left] && pivot==arr[right])
				left++;
			if(left!=right)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				pivot=arr[left];
			}
		}
		if(left==right)
			pos=right;
			
		return pos;
		
	}

	

}
