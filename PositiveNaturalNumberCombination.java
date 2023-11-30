package HackathonAssignment;

import java.util.Scanner;

public class PositiveNaturalNumberCombination {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int i,j,k,sum;
		System.out.println("Enter the positive natural number: ");
		int n= input.nextInt();
		
		input.close();
		for(i=0; i<=n/2+1; i++)
		{
			sum=0;
			for(j=i; j<=n/2+1; j++)
			{
				sum=sum+j;
				if(sum==n)
				{
					break;
				}
			}
			if(j<=n/2+1)
			{
				for(k=i; k<=j; k++)
				{
					System.out.print(k + " ");
				}
				System.out.println();
			}
		}
		
		

	}

}
