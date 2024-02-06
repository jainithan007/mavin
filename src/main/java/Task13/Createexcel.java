package Task13;
       import org.apache.poi.ss.usermodel.*;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		import java.io.FileOutputStream;
		import java.io.IOException;

		public class Createexcel {
		    public static void main(String[] args) {
		        try (Workbook workbook = new XSSFWorkbook()) {
		            Sheet sheet = workbook.createSheet("Sheet1");
		            Row row = sheet.createRow(0);
		            Cell cell = row.createCell(0);
		            cell.setCellValue("Hello  Excel Workbook");

		            try (FileOutputStream fileOut = new FileOutputStream("workbook.xlsx")) {
		                workbook.write(fileOut);
		            }

		            System.out.println("Excel workbook created successfully.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		

	}


