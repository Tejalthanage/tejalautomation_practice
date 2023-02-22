package Apache_poi_Example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class ReadData_FromExcel {

	public static void main(String[] args) throws IOException {
		
		String path=".\\Data\\Country.xlsx";
		//ring path="C:\\Users\\sai\\eclipse-workspace\\ApachePOI\\Data\\Country.xlsx";
		FileInputStream InputStream=new FileInputStream(path);
		XSSFWorkbook Workbook=new XSSFWorkbook(InputStream);
		XSSFSheet Sheet = Workbook.getSheet("Sheet1");
		Iterator sheetItrator = Sheet.iterator();
		while(sheetItrator.hasNext())
		{
			 XSSFRow row = (XSSFRow) sheetItrator.next();
			 Iterator cellIterator = row.cellIterator();
			 while(cellIterator.hasNext())
			 {
				 XSSFCell cell=(XSSFCell) cellIterator.next();
				 switch(cell.getCellType())
				 {
				 case STRING : System.out.print(cell.getStringCellValue()); 
				      break;
				 case NUMERIC :System.out.print(cell.getNumericCellValue());
				    break;
				 case BOOLEAN : System.out.print(cell.getBooleanCellValue());
				    break;
				 }
				 System.out.print(" | ");
			 }
			 System.out.println();
		}
		
	}
	
}
