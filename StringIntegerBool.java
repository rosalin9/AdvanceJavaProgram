package HackathonAssignment;

import java.util.Scanner;

public class StringIntegerBool {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value: ");
		if(input.hasNextInt())
		{
			System.out.println("This input is of type integer");
		}
		else if(input.hasNextLine())
		{
			System.out.println("This input is of type string");
		}
		else if(input.hasNextBoolean())
		{
			System.out.println("This input is of type bool");
		}
		
		input.close();
	}

}
