package HackathonAssignment;

import java.util.Scanner;

public class CheckPalindrome 
{
	static void numberPalindrome()
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
		int len=arr.length;
		for(int i=0;i<(len/2);i++)
		{
			if(arr[i] != arr[len-i-1])
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
	static void stringPalindrome()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str= input.next();
		input.close();
		int flag=0;
		int size=str.length();
		for(int i=0;i<(size/2);i++)
		{
			if(str.charAt(i) != str.charAt(size-i-1))
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

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("1. Integer Palindrome");
		System.out.println("2. String Palindrome");
		System.out.print("Enter your choice: ");
		int ch = input.nextInt();
		switch(ch)
		{
			case 1:
				numberPalindrome();
				break;
			case 2:
				stringPalindrome();
				break;
			
		}
		input.close();
	}

}
