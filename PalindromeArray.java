package HackathonAssignment;

import java.util.Scanner;

public class PalindromeArray {

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
		int flag=0;
		for(int i=0;i<(size/2);i++)
		{
			if(arr[i] != arr[size-i-1])
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("It's a Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
