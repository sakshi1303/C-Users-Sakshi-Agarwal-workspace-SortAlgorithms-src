package algo;

import java.util.Scanner;

public class MergeSort {

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
		int l=0, r=n-1;
		MergeSort ms=new MergeSort();
		ms.mergeSort(arr,l,r);
		System.out.println("The sorted array elements are:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");

	}
	
	void mergeSort(int[] arr,int l, int r)
	{
		int m;
		
		if(l<r)
		{	
			m=(l+r)/2;
			System.out.println("left="+l+" mid="+m+" right="+r);
			System.out.println("Spitting left");
			mergeSort(arr,l,m);
			System.out.println("left="+l+" mid="+m+" right="+r);
			System.out.println("Spitting right");
			mergeSort(arr,m+1,r);
			System.out.println("left="+l+" mid="+m+" right="+r);
			merge(arr,l,m,r);
		}
		
	}
	
	void merge(int arr[], int l, int m, int r)
	{	
		int n1=m-l+1;
		int n2=r-m;
		int left[]=new int[n1];
		int right[]=new int[n2];
		System.out.print("Left Half is: ");
		for(int i=0;i<n1;i++)
			left[i]=arr[l+i];
		for(int i=0;i<n1;i++)
			System.out.print(left[i]+" ");
		System.out.println();
		System.out.print("Right Half is: ");
		for(int j=0;j<n2;j++)
			right[j]=arr[m+1+j];
		for(int j=0;j<n2;j++)
			System.out.print(right[j]+" ");
		System.out.println();
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<n1)
		{
			arr[k]=left[i];
			i++;
			k++;	
		}
		while(j<n2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
		System.out.print("Merging: ");
		for(int p=l;p<k;p++)
			System.out.print(arr[p]+" ");
		System.out.println();
		
	}
}