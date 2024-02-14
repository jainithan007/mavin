package Task13;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public static void main(String[] args) throws IOException {
	
		
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\jai\\eclipse-workspace\\Excel\\workbook1.xlsx");
		
		XSSFSheet sheet = book.getSheetAt(0);
		 int rowcount = sheet.getLastRowNum();
		 int columcount = sheet.getRow(0).getLastCellNum();
		 
		 String[][] data= new String[rowcount][columcount];
		 
		 for (int i =1; i<=rowcount;i++) {
			 
			 XSSFRow row = sheet.getRow(i);
			 
			 for(int j=0;j<columcount;j++) {
				 
				 XSSFCell cell = row.getCell(j);
				 
				 data[i-1][j] = cell.getStringCellValue();
				 System.out.println(cell.getStringCellValue()+" ");
			 }
			 System.out.println();
		 }
	        book.close();	 
	}
}
		 
		 
		
	


