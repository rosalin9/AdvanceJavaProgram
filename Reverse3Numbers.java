package HackathonAssignment;

import java.util.Arrays;

public class Reverse3Numbers 
{

	public static void main(String[] args)
	{
		int arr[] = {3,2,4,7,0,3,1,5,8,4};
		int n=arr.length;
		int r=n%3;
		for(int i=0; i<n-r; i=i+3)
		{
			if(arr[i]>arr[i+1] && arr[i]>arr[i+2])
			{
				int temp=arr[i+2];
				arr[i+2]=arr[i];
				arr[i]=temp;
			}
			else if(arr[i]>arr[i+1] && arr[i]<arr[i+2])
			{
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
			else if(arr[i]<arr[i+1] && arr[i]>arr[i+2])
			{
				int temp=arr[i+2];
				arr[i+2]=arr[i];
				arr[i]=temp;
			}
			else if(arr[i+1]>arr[i+2])
			{
				int temp=arr[i+2];
				arr[i+2] = arr[i+1];
				arr[i+1]=temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
