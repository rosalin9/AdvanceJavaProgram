package HackathonAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size= input.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the value in the array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=input.nextInt();
		}
		
		input.close();
		
		for(int i=0;i<size-1;i++)
		{
			int min=arr[i];
			int temp;
			for(int j=i;j<size;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("After sorting the values in the array:");
		System.out.println(Arrays.toString(arr));

	}

}
