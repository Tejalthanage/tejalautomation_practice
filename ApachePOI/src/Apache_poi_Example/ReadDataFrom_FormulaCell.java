package Apache_poi_Example;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadDataFrom_FormulaCell {

	public static void main(String[] args) throws IOException {
				FileInputStream file=new FileInputStream(".\\Data\\Formula_Read.xlsx");
				XSSFWorkbook workbook=new XSSFWorkbook(file);
		        XSSFSheet Sheet = workbook.getSheet("Sheet1");
		        int rows=Sheet.getLastRowNum();
		        int cols=Sheet.getRow(0).getLastCellNum();
		        System.out.println(rows);
		        System.out.println(cols);
		        for(int r=0;r<=rows;r++)
		        {
		        	 XSSFRow row = Sheet.getRow(r);
		        	 for(int c=0;c<cols;c++)
		        	 {
		        		 XSSFCell cell = row.getCell(c);
		        		 switch(cell.getCellType())
		        		 {
		        		 case STRING:System.out.print(cell.getStringCellValue()); break;
		        		 case NUMERIC:System.out.print(cell.getNumericCellValue());break;
		        		 case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
		        		 case FORMULA:System.out.print(cell.getNumericCellValue());break;
		        		 }
		        		 System.out.print(" | ");
		        	 }
		        	 System.out.println();
		        }
		file.close();
	}
}
