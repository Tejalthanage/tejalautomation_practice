package Apache_poi_Example;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FillBackground {
 
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		XSSFRow row = sheet.createRow(1);
		XSSFCellStyle style = workbook.createCellStyle();
		style.setFillBackgroundColor(IndexedColors.LIGHT_BLUE.getIndex());
		style.setFillPattern(FillPatternType.FINE_DOTS);
		XSSFCell cell1 = row.createCell(1);
		cell1.setCellValue("welcome");
		cell1.setCellStyle(style);
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		XSSFCell cell2 = row.createCell(2);
		cell2.setCellValue("Selenium");
		cell2.setCellStyle(style);
		FileOutputStream fos=new FileOutputStream(".\\Data\\style.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("Done");
		
		
		
	}
}

