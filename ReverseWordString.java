package HackathonAssignment;

import java.util.Scanner;

public class ReverseWordString 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.nextLine();
		String[] arr = str.split(" ",-1);
		input.close();
		
		System.out.println("Reverse of the string word is: ");
		for(int i=arr.length-1; i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
