package org.techouts.app.problem18;

import java.io.File;
import java.io.FileInputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeDetails {

	public static void read() {
		try {
	        FileInputStream file = new FileInputStream(new File("D:/text/Employe.xls"));

	        XSSFWorkbook workbook = new XSSFWorkbook(file);
	        XSSFSheet sheet = workbook.getSheetAt(0);
	        Iterator<Row> rowIterator = sheet.iterator();
	        while (rowIterator.hasNext())
	        {
	            Row row = rowIterator.next();
	            Iterator<Cell> cellIterator = row.cellIterator();
	            StringBuffer sb = new StringBuffer();
	            while (cellIterator.hasNext()) 
	            {
	                Cell cell = cellIterator.next();
	                if (sb.length() != 0) {
	                    sb.append(",");
	                }
	                switch (cell.getCellType()) 
	                {
	                    case STRING:
	                        System.out.print(cell.getStringCellValue() + "\t");
	                        sb.append(cell.getStringCellValue());
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
	public static void main(String[]arg) {
		EmployeeDetails details = new EmployeeDetails();
		details.read();
		}
}