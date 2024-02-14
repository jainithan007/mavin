package Task13;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import org.apache.poi.ss.usermodel.*;

		public class Sheet1 {
		    public static void main(String[] args) throws IOException {
		        Workbook workbook = WorkbookFactory.create(true); 
		        Sheet sheet = workbook.createSheet("Sheet1"); 
		        Row row = sheet.createRow(0); 
		        Cell cell = row.createCell(0); 
		        cell.setCellValue("Hello"); 

		        
		        try (FileOutputStream fileOut = new FileOutputStream("example.xlsx")) {
		            workbook.write(fileOut);
		            System.out.println("Excel file created successfully!");
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            try {
		                workbook.close();
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        }
		    }
		

	}


