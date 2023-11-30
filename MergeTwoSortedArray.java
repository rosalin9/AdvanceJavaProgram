package HackathonAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray
{
	
	static void MergeArray(int arr1[], int arr2[],int m, int n)
	{
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		while(i>=0 && j>=0)
		{
			if(arr1[i]>arr2[j])
			{
				arr1[k]=arr1[i];
				i--;
			}
			else
			{
				arr1[k]=arr2[j];
				j--;
			}
			k--;
		}
		System.out.println(Arrays.toString(arr1));
		
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		  int[] array1= new int[10]; 
		  int[] array2 = new int[4]; 
		System.out.println("Enter the value in the first array in sorted order: ");

		  for(int i =0; i<6; i++) 
		  { 
			  array1[i] = input.nextInt(); 
		  } 
		
		System.out.println("Enter the value in the second array in sorted order: ");
		
		  for(int i =0; i<4; i++) 
		  { 
			  array2[i] = input.nextInt(); 
		  } 
		   
		  input.close();
		
		  MergeArray(array1,array2,6,4);
		  
		
	}

}
