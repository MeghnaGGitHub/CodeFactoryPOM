package datadriven;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class ExcelDataReader 
{
	String filepath="C:\\Users\\Meghna\\Desktop\\DataDriven\\MyCSV.xlsx";
	String sheetName="MySheet";
	try 
	{
		FileInputStream file=new FileInputStream(new File(filepath));
	}
	catch(IOException e)
	{
		System.out.println("File not found");
	}
}
