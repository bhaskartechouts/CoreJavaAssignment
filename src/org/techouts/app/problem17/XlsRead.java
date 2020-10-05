package org.techouts.app.problem17;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class XlsRead {

	static List<String> list = new LinkedList<String>();
	protected static void convertSelectedSheetInXLXSFileToCSV(File xlsxFile, int sheetIdx) throws Exception {
		
        FileInputStream fileInStream = new FileInputStream(xlsxFile);
 
        XSSFWorkbook workBook = new XSSFWorkbook(fileInStream);
        XSSFSheet selSheet = workBook.getSheetAt(sheetIdx);
        Iterator<Row> rowIterator = selSheet.iterator();
        while (rowIterator.hasNext()) {
 
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            StringBuffer sb = new StringBuffer();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (sb.length() != 0) {
                    sb.append(",");
                }
                switch (cell.getCellType()) {
                case STRING:
                    sb.append(cell.getStringCellValue());
                    break;
                case NUMERIC:
                	sb.append(cell.getNumericCellValue());
                    break;
                case BOOLEAN:
                	sb.append(cell.getBooleanCellValue());
                    break;
                default:
                }
            }
            System.out.println(sb.toString());
            list.add(sb.toString());
        }
        workBook.close();
    }
 
    
}
