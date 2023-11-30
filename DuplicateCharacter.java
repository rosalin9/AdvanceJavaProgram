package HackathonAssignment;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = input.nextLine();
		
		input.close();
		
		char[] str1 = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			int count=1;
			for(int j=i+1; j<str.length();j++)
			{
				if(str1[i]==str1[j] && str1[i] != ' ')
				{
					count++;
					str1[j]=0;
				}
			}
			if(count>1 && str1[i] != 0)
			{
				System.out.print(str1[i]+ " ");
			}
		}
		

	}

}
