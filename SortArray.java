package HackathonAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray 
{
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
		int temp;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("after sorting the values of the array are:");
		System.out.println(Arrays.toString(arr));
	}
}
