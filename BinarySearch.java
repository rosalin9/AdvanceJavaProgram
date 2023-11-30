package HackathonAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] arr =new int[5];
		
		System.out.println("Enter the value in the array: ");

		  for(int i =0; i<5; i++) 
		  { 
			  arr[i] = input.nextInt(); 
		  } 
		  Arrays.sort(arr);
		  System.out.println("Enter the key value to search: ");
		  	int key = input.nextInt();
		  	input.close();
		  	
		  	int res=Binary(arr,key);
		  	if(res==-1)
		  	{
		  		System.out.println("Element not found");
		  	}
		  	else
		  	{
		  		System.out.println("Element found at index: " + res);
		  	}
		  	
	}
	static int Binary(int[] arr1, int k)
	{
		int l=0;
	  	int r=arr1.length-1;
	  	while(l<=r)
	  	{
	  		int m =l+(r-l)/2;
	  		if(arr1[m]==k)
	  		{
	  			return m;
	  		}
	  		if(k>m)
	  		{
	  			l=m+1;
	  		}
	  		else
	  		{
	  			r=m-1;
	  		}
	  		
	  	}
	  	return -1;
	}

}
