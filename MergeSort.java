package HackathonAssignment;

import java.util.Arrays;

public class MergeSort 
{
	static void merge(int arr[], int l, int m, int n)
	{
		int len1 = m-l+1;
		int len2 = n-m;
		
		int leftArr[] = new int[len1];
		int rightArr[] = new int[len2];
		for(int i=0;i<len1;i++)
		{
			leftArr[i]=arr[l+i];
		}
		for(int j=0;j<len2;j++)
		{
			rightArr[j]=arr[m+1+j];
		}
		int i=0,j=0,k=l;
		while(i<len1 && j<len2)
		{
			if(leftArr[i]<=rightArr[j])
			{
				arr[k]=leftArr[i];
				i++;
			}
			else
			{
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<len1)
		{
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<len2)
		{
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	
	static void mergeSort(int arr[],int p,int r)
	{
		if(p<r)
		{
			int q=(p+r)/2;
			
			mergeSort(arr,p,q);
			mergeSort(arr,q+1,r);
	
			merge(arr,p,q,r);
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {6,5,12,10,9,1};
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(arr));
	}
}
