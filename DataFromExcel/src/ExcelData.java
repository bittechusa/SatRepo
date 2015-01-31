import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;



public class ExcelData 
{
	@Test
	public void getDataFromExcel()
	{
		 try {
		        // Open the Excel file
		        FileInputStream fis = new FileInputStream("C:\\Users\\paion\\Desktop\\excel1.xlsx");
		        // Access the required test data sheet
		        XSSFWorkbook wb = new XSSFWorkbook(fis);
		        XSSFSheet sheet = wb.getSheetAt(0);
		        // Loop through all rows in the sheet
		        // Start at row 1 as row 0 is our header row
		        Iterator<Row> ite = sheet.rowIterator();
				while(ite.hasNext()){
					Row row = ite.next();
					Iterator<Cell> cite = row.cellIterator();
					while(cite.hasNext()){
						Cell c = cite.next();
						System.out.print(c.toString()+"   ");
					} 
					System.out.println();

		        }
		        fis.close();
		        wb.close();
		    } catch (IOException e) {
		        System.out.println("Test data file not found");
		    }   
		}

	}


