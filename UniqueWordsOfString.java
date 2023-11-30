package HackathonAssignment;

import java.util.Scanner;

public class UniqueWordsOfString 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = new String(input.nextLine());
		
		String[] arr = str.split(" ",-1);
		input.close();
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equalsIgnoreCase(arr[j]))
				{
					count++;
					arr[j]="";
				}
			}
			if(count==1 && arr[i] != "")
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}
}
