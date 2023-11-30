package HackathonAssignment;

import java.util.Scanner;

public class AdditionOperatorForArithmetic {

	static void Subtraction(int m, int n)
	{
		int res = m + (-n);
		System.out.println("Subtraction is: "+res);
	}
	static void Multiplication(int k,int l)
	{
		int mul=0;
		while(l>0)
		{
			mul=mul+k;
			l--;
		}
		System.out.println("Multiplication is: "+ mul);
	}
	static void Division(int x, int y)
	{
		int count=0;
		if(y!=0)
		{
			while(x>y)
			{
				x=x+(-y);
				count++;
			}
			System.out.println("Division is: " +count);
		}
		else
		{
			System.out.println("Number cannot divided by zero.");
		}
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = input.nextInt();
		System.out.print("Enter the first number: ");
		int b = input.nextInt();
		
		input.close();
		Subtraction(a,b);
		Multiplication(a,b);
		Division(a,b);
		

	}

}
