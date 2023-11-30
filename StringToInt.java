package HackathonAssignment;

import java.util.Scanner;

public class StringToInt 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = input.next();
		
		try
		{
			int n = Integer.parseInt(str);
			System.out.print("Output: "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			input.close();
		}
		
	}
}
