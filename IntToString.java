package HackathonAssignment;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int n = input.nextInt();
		
		String str = Integer.toString(n);
		System.out.println("Output: "+ str);
		
		input.close();
		
	}

}
