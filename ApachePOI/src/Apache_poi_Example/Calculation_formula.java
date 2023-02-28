package Apache_poi_Example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Calculation_formula {
public static void main(String[] args) throws IOException {

	FileInputStream fis=new FileInputStream(".\\Data\\calculation_formula.xlsx");
	XSSFWorkbook woorkbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = woorkbook.getSheetAt(0);
	sheet.getRow(5).getCell(2).setCellFormula("SUM(c2:c4)");
	
	fis.close();
	
	FileOutputStream fos=new FileOutputStream(".\\\\Data\\\\calculation_formula.xlsx");
	woorkbook.write(fos);
	woorkbook.close();
	fos.close();
	
	System.out.println("done");
	
	
	
}

}

