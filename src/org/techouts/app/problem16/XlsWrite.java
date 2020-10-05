package org.techouts.app.problem16;

import java.io.File;
import java.io.FileOutputStream;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsWrite extends CsvRead{
   public static void main(String[] args) throws Exception {
	   main();

      XSSFWorkbook workbook = new XSSFWorkbook();
      
      XSSFSheet spreadsheet = workbook.createSheet( " Employee Info ");

      XSSFRow row;
      int rowid = 0;
      int i = list.size()-1;
      int j = 0;
      for (String rowsCreated : list) {
         row = spreadsheet.createRow(rowid++);
         Object [] objectArr = null;
         if(j <= i){
         objectArr = list.get(j).split(",");
         j++;
         }
         int cellid = 0;
         for (Object obj : objectArr){
            Cell cell = row.createCell(cellid++);
            cell.setCellValue((String)obj);
         }
         System.out.println();
      }
      FileOutputStream out = new FileOutputStream(
         new File("D:/text/Writesheet.xls"));
      
      workbook.write(out);
      out.close();
      System.out.println("Writesheet.xls written successfully");
   }
}
