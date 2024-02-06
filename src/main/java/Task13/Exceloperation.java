package Task13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloperation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		XSSFWorkbook book = new XSSFWorkbook();
		
		XSSFSheet sheet = book.createSheet();
		
		Object[][] data = {
				
				{"Name","Age","Email"},
				{"John Doe","30","john@test.com"},
				{"Jane Doe","28","john@test.com"},
				{"bob smith","35","jacky@example.com"}, 
				{"Swapnil","37","swapnil@example.com"},
		
		 
	};
     
		int rowcount = 0;
		
		for(Object[] row1 : data) {
			
			XSSFRow row = sheet.createRow(rowcount++);
			
			int columcount = 0;
			for (Object col: row1) {
				XSSFCell cell = row.createCell(columcount++);
				
			
			 
			if(col instanceof String) {
				
				cell.setCellValue((String) col);
			}else if(col instanceof Integer) {
				cell.setCellValue((Integer) col);
				
			}	
				}
		}
		try (
			FileOutputStream output = new FileOutputStream("FirstFile1.xlsx");){
		     book.write(output);
		}
		
}
}
