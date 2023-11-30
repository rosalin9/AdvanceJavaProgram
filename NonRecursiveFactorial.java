package HackathonAssignment;

import java.util.Scanner;

public class NonRecursiveFactorial {

	public static void main(String[] args) 
	{
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		a=input.nextInt();
		
		input.close();
		int fact=1;
		while(a>0)
		{
			fact = fact* a;
			a=a-1;
			
		}
		System.out.println(fact);

	}

}
