package HackathonAssignment;

import java.util.Scanner;

public class FindIntegerUpperLower 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.nextLine();
		
		input.close();
		int Dcount=0;
		int Ucount=0;
		int Lcount=0;
		for(Character c: str.toCharArray())
		{
			if(Character.isDigit(c))
			{
				Dcount++;
			}
			else if(Character.isUpperCase(c))
			{
				Ucount++;
			}
			else if(Character.isLowerCase(c))
			{
				Lcount++;
			}
		}
		System.out.println("Total number of integers in string is: "+ Dcount);
		System.out.println("Total number of uppercase letter in string is: "+ Ucount);
		System.out.println("Total number of lowercase letter in string is: "+ Lcount);

	}

}
