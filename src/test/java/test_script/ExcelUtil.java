package test_script;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil 
{
	public static Object[][] readExcelData(String filepath, String sheetName) throws IOException
	{
		FileInputStream fis=new FileInputStream(new File(filepath));
		Workbook workbook=new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int colCount=sheet.getRow(0).getLastCellNum();
		
		Object [][] data=new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) 
		{
			Row row=sheet.getRow(i);
			
			for(int j=0;j<colCount;j++)
			{
				Cell cell=row.getCell(j);
				data [i-1][j]=cell.toString(); 
			}
		}
		workbook.close();
		return data;
	}
}
