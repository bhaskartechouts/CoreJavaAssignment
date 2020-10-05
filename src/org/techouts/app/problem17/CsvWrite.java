package org.techouts.app.problem17;

import java.io.File;
import java.io.FileWriter;
import com.opencsv.CSVWriter;
public class CsvWrite extends XlsRead{
   public static void main(String[] args) throws Exception {
       File myFile = new File("filexsl/student.xls");
       int sheetIdx = 0; 
       convertSelectedSheetInXLXSFileToCSV(myFile, sheetIdx);
       CSVWriter writer = new CSVWriter(new FileWriter("D:/text/output.csv"));
       for(String str : list) {
    	   String line[] = str.split(",");
    		   writer.writeNext(line);
    		   System.out.println(str);
       }
       writer.flush();
   }
}
