package HackathonAssignment;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CircusProblem {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		TreeMap<Integer, Integer> hm= new TreeMap<Integer, Integer>();
		char ch;
		int count=0;
		do
		{
			System.out.println("Enter the height and weight of a person: ");
			hm.put(input.nextInt(),input.nextInt());
			count++;
			System.out.print("Do you want to enter more(y/n): ");
			ch=input.next().charAt(0);
			
		}while(ch != 'n');
		
		input.close();
		System.out.println("The longest tower length is: "+count);
		for(Map.Entry displaymap: hm.entrySet())
		{
			System.out.println(displaymap.getKey() + " " + displaymap.getValue());
		}
		

	}

}
