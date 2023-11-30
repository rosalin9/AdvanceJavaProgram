package HackathonAssignment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		StringBuffer str = new StringBuffer(input.nextLine());
		
		input.close();
		System.out.println("Reverse of the string is : ");
		System.out.println(str.reverse());

	}

}
