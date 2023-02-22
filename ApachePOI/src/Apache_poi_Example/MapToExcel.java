package Apache_poi_Example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MapToExcel {
public static void main(String[] args) throws IOException {
	  XSSFWorkbook workbook=new XSSFWorkbook();
      XSSFSheet sheet = workbook.createSheet("Student Data");	
      HashMap<String, String> data=new HashMap<String,String>();
      data.put("101", "Raahi");
      data.put("102", "Mayra");
      data.put("103", "Nayar");
      data.put("104", "Manoj");
      data.put("105", "Tejal");
      int rowcount=0;
      
      for(Map.Entry entry:data.entrySet())
      {
    	  XSSFRow row = sheet.createRow(rowcount++);
    	  row.createCell(0).setCellValue((String)entry.getKey());
    	  row.createCell(1).setCellValue((String)entry.getValue());
      }
      FileOutputStream fos=new FileOutputStream(".\\Data\\Student.xlsx");
      workbook.write(fos);
      workbook.close();
      fos.close();
      System.out.println("excel created successfully");
 }
}
   