package HackathonAssignment;

import java.util.Scanner;

public class BooleanVariable {

	public static void main(String[] args) 
	{
		
		boolean a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first boolean value: ");
		a=input.nextBoolean();
		System.out.print("Enter second boolean value: ");
		b=input.nextBoolean();
		System.out.print("Enter third boolean value: ");
		c=input.nextBoolean();
		
		input.close();
		
		if(a==true && b==true && c==true)
		{
			System.out.println("All the booleans are true");
		}
		else if(a==true && b==true && c==false)
		{
			System.out.println("Two out of three booleans are true");
		}
		else if(a==true && c==true && b==false)
		{
			System.out.println("Two out of three booleans are true");
		}
		else if(b==true && c==true && a==false)
		{
			System.out.println("Two out of three booleans are true");
		}
		else
		{
			System.out.println("Two out of three booleans are not true");
		}
				

	}

}
