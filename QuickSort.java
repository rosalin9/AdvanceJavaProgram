package HackathonAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort 
{
	static void quickSort(int[] arr, int p, int r)
	{
		if(p<r)
		{
			int q = partition(arr,p,r); // pivot element
			quickSort(arr,p,q-1);
			quickSort(arr,q+1,r);
		}
	}
	
	static int partition(int[] arr, int p, int r)
	{
		int pivot = arr[r];
		int pindex = p-1;
		for(int i=0;i<r;i++)
		{
			if(arr[i]<=pivot)
			{
				pindex++;
				int temp=arr[i];
				arr[i]=arr[pindex];
				arr[pindex]=temp;
			}
		}
		pindex++;
		int temp=arr[pindex];
		arr[pindex]=arr[r];
		arr[r]=temp;
		return pindex;
	}
	
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n= input.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the element in the array: ");
		for(int i=0; i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		input.close();
		quickSort(arr,0,n-1);
		System.out.println("Array after sorting: ");
		System.out.println(Arrays.toString(arr));
	}
}
