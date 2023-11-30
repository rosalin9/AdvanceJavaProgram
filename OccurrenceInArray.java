package HackathonAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurrenceInArray 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size= input.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the value in the array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=input.nextInt();
		}
		input.close();
		
		Arrays.sort(arr);
		int value=0;
		ArrayList<Integer> unique = new ArrayList<Integer>(); 
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<size;i++)
		{
			int count=1;
			for(int j=i+1; j<size; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					value=arr[i];
					arr[j]=0;
				}	
			}
			if(count>1 && arr[i] != 0)
			{
				hm.put(value,count);
			}
			else if(arr[i] != 0)
			{
				unique.add(arr[i]);
			}
		}
		System.out.print("Unique numbers are: ");
		for(Integer val:unique)
		{
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println("Duplicate numbers are: ");
		for(Map.Entry displaymap: hm.entrySet())
		{
			System.out.println("Value: " + displaymap.getKey()+" Occurance: "+ displaymap.getValue());
		}
		
	}

}
