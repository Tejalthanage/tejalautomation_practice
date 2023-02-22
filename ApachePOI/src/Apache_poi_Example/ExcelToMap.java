package Apache_poi_Example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToMap {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\Data\\Student.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Student Data");
		HashMap<String, String> data=new HashMap<String, String>();
		int row = sheet.getLastRowNum();
		for(int r=0;r<row;r++)
		{
		   String key=sheet.getRow(r).getCell(0).getStringCellValue();
		   String value=sheet.getRow(r).getCell(1).getStringCellValue();
		   data.put(key, value);
		   }
		
		for(Map.Entry entry:data.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		workbook.close();
		fis.close();
	}

}
