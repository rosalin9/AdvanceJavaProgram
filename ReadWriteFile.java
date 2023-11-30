package HackathonAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Stack;

public class ReadWriteFile 
{

	public static void main(String[] args) throws Exception 
	{
		String userDir = System.getProperty("user.dir");
		String filepath = userDir + "\\files\\ReadFile.txt";
		
		String filepath1 = userDir + "\\files\\WriteFile.txt";
		FileReader ofileReader = new FileReader(filepath);
		BufferedReader obufferedReader = new BufferedReader(ofileReader);
		Stack<String> lines= new Stack<String>();
		
		FileWriter ofileWriter = new FileWriter(filepath1);
		BufferedWriter obufferedWriter = new BufferedWriter(ofileWriter);
		
		
		String str = obufferedReader.readLine();
		  while(str != null) 
		  { 
			  lines.push(str);
			  str = obufferedReader.readLine();
		  }
		  while(!lines.empty())
		  {
			  obufferedWriter.write(lines.pop());
			  obufferedWriter.write("\n");
		  }
		  obufferedReader.close();
		  obufferedWriter.close();

	}

}
