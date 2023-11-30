package HackathonAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfAllCharacter 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = input.nextLine();
		
		input.close();
		
		char[] str1 = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
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
			if(str1[i] != ' ')
			{
				hm.put(str1[i], count);
			}
		}
		System.out.println("Display occurance of all character: ");
		for(Map.Entry displaymap: hm.entrySet())
		{
			System.out.println("Character " + displaymap.getKey() + " Occurance " + displaymap.getValue());
		}
	}

}
