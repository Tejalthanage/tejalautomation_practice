package Apache_poi_Example;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedtata_Excel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
	    XSSFSheet Sheet = workbook.createSheet("emp_info");
	    Object empdata[] []= {{"emp_id","Name","Job"},
	    		{101,"Manoj","Manager"},
	    		{102,"Raahi","ennginieer"},
	    		{103,"Tejal","Tester"},
	    			    };
	      int row = empdata.length;
	      int col =empdata[0].length;
	      System.out.println(row);
	      System.out.println(col);
	      for(int r=0;r<row;r++)
	      {
	    	  XSSFRow SheetRow = Sheet.createRow(r);
	    	  for(int c=0;c<col;c++)
	    	  {
	    		  XSSFCell Sheetcell = SheetRow.createCell(c);
	    		  Object value = empdata[r][c];
	    		  if(value instanceof String)
	    			  Sheetcell.setCellValue((String)value);
	    		  if(value instanceof Integer)
	    			  Sheetcell.setCellValue((Integer)value);
	    		  if(value instanceof Boolean)
	    			  Sheetcell.setCellValue((Boolean)value);
	    		  
	    	  }
	      }
	      String FilePath=".\\Data\\Employee.xlsx";
	      FileOutputStream outputStream =new FileOutputStream(FilePath);
	     workbook.write(outputStream);
	     outputStream.close();
	     
	     System.out.println("Emp data is created");
	}
}
