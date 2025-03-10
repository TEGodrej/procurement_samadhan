package GenericUtilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

	public class ExcelUtility {

	    public  String  readDataFromExcel(String sheetName, int rowNum, int columnNum) {
	        FileInputStream fileInputStream = null;
	        Workbook workbook = null;

	        try {
	            fileInputStream = new FileInputStream("C:\\Users\\testing.engineer\\git\\procurement_samadhan\\final\\samadhan_Procurement_Farmer\\testData\\SamadhanTestData.xlsx"); 
	            // Create the workbook (for .xlsx files, use XSSFWorkbook)
	            workbook = new XSSFWorkbook(fileInputStream);
	            
	            // Get the sheet
	            Sheet sheet = workbook.getSheet(sheetName);
	            
	            if (sheet == null) {
	                System.out.println("Sheet not found.");
	                return null;
	            }
	            
	            // Get the row and the cell
	            Row row = sheet.getRow(rowNum);
	            if (row == null) {
	                System.out.println("Row " + rowNum + " not found.");
	                return null;
	            }
	            
	            Cell cell = row.getCell(columnNum);
	            if (cell == null) {
	                System.out.println("Cell " + columnNum + " not found.");
	                return null;
	            }
	            
	            // Get the value from the cell
	            String value = cell.getStringCellValue();
	            System.out.println("Value from row " + rowNum + ", column " + columnNum + ": " + value);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (fileInputStream != null) {
	                    fileInputStream.close();
	                }
	                if (workbook != null) {
	                    workbook.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
			return sheetName;
	    }
	}

