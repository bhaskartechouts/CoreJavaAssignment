package org.techouts.app.problem14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Manager extends Employee{

	public void create() throws IOException{
		File f = new File("D:/text/Manager.xls");
		f.createNewFile();
	}
	public void write() throws IOException{
		
		 XSSFWorkbook workbook = new XSSFWorkbook();
	      
	      XSSFSheet spreadsheet = workbook.createSheet( " Employee Info ");

	      XSSFRow row;
	      
		Map < String, Object[] > empinfo = new TreeMap < String, Object[] >();
	      empinfo.put( "1", new Object[] {
	         "ID", "NAME", "Rating" , "StarYear" });
	      
	      empinfo.put( "2", new Object[] {
	         "01", "Bhaskar", "5", "2019" });
	      
	      empinfo.put( "3", new Object[] {
	         "02", "Akhil", "4" , "2018"});
	      
	      empinfo.put( "4", new Object[] {
	         "03", "Vicky", "3" , "2017"});
	      
	      empinfo.put( "5", new Object[] {
	         "04", "Sunny", "2" , "2016"});
	      
	      Set < String > keyid = empinfo.keySet();
	      int rowid = 0;
	      
	      for (String key : keyid) {
	         row = spreadsheet.createRow(rowid++);
	         Object [] objectArr = empinfo.get(key);
	         int cellid = 0;
	         
	         for (Object obj : objectArr){
	            Cell cell = row.createCell(cellid++);
	            cell.setCellValue((String)obj);
	         }
	      }
	      FileOutputStream out = new FileOutputStream(
	    	         new File("D:/text/Manager.xls"));
	    	      
	    	      workbook.write(out);
	    	      out.close();
	}
	public void read(){
		 try {
		        FileInputStream file = new FileInputStream(new File("D:/text/Manager.xls"));

		        XSSFWorkbook workbook = new XSSFWorkbook(file);
		        XSSFSheet sheet = workbook.getSheetAt(0);
		        Iterator<Row> rowIterator = sheet.iterator();
		        while (rowIterator.hasNext())
		        {
		            Row row = rowIterator.next();
		            Iterator<Cell> cellIterator = row.cellIterator();

		            while (cellIterator.hasNext()) 
		            {
		                Cell cell = cellIterator.next();
		                switch (cell.getCellType()) 
		                {
		                    case STRING:
		                        System.out.print(cell.getStringCellValue() + "\t");
		                        break;
		                }
		            }
		            System.out.println("");
		        }
		        file.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	}
	public static void main(String[] args) throws IOException {
		Employee manager = new Manager();
		manager.create();
		manager.write();
		manager.read();
		((Manager) manager).deleteFile();
	}
	public void deleteFile() {
		File file = new File("D:/text/Manager.xls"); 
        
        if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file"); 
        } 
	}

}
