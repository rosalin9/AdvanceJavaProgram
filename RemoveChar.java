package HackathonAssignment;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = input.nextLine();
		System.out.print("Enter the character to be removed: ");
		String ch = input.next();
		
		input.close();
		System.out.println(str.replace(ch,""));

	}

}
