package HackathonAssignment;

import java.util.Scanner;

public class LongestPalindromeInString 
{

	static String PrintsubString(String s)
	{
		String res="";
		int i,j,k;
		for(i=0;i<s.length();i++)
		{
			for(j=i,k=i;j>=0 && k<s.length() && s.charAt(j)==s.charAt(k);j--,k++)
			{
				if(res.length()<k-j+1)
				{
					res=s.substring(j,k+1);
				}
			}
			for(j=i,k=i+1;j>=0 && k<s.length() && s.charAt(j)==s.charAt(k);j--,k++)
			{
				if(res.length()<k-j+1)
				{
					res=s.substring(j,k+1);
				}
			}
		}
		
		return res;
		
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str= input.next();
		
		input.close();
		
		System.out.println(PrintsubString(str));
		
		
	}

}
