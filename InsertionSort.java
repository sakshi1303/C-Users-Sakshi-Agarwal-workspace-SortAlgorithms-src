import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {	
		
		int key=0,pos=0;
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
		for(int i=1;i<arr.length;i++)
		{
			pos=i;
			key=arr[pos];
			while(pos>0 && arr[pos-1]> key)
			{
				arr[pos]=arr[pos-1];
				pos=pos-1;
			}
			arr[pos]=key;
			System.out.println(i+"th iteration");
			for(int k=0;k<arr.length;k++)
				System.out.print(arr[k]+"\t");
			System.out.println();
		}
		System.out.println("Sorted Elements are");
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}

}
