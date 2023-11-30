package HackathonAssignment;

import java.util.Scanner;

public class RecursionFactorial 
{
	static int fact(int n)
	{
		if(n>=1)
		{
			return n*fact(n-1);
		}
		else 
		{
			return 1;
		}
	}

	public static void main(String[] args) 
	{
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		a=input.nextInt();
		
		input.close();
		
		System.out.println(fact(a));

	}

}
