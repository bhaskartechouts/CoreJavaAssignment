package org.techouts.app.problem16;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CsvRead {
	static List<String> list = new LinkedList<>();
	public static void main() throws Exception  
	{  
		String line ;  
		String splitBy = ",";  
		try   
		{  
			BufferedReader br = new BufferedReader(new FileReader("filexsl/output.csv"));  
			while ((line = br.readLine()) != null)     
			{  
				list.add(line);
			}  
		}   
		catch (IOException e)   
		{  
			e.printStackTrace();  
		}   
	}  
}
