package excel_reading_program;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_Table_reading_example1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
           File MyFile = new File("G:\\important software for testing\\5th march excelsheet1.xlsx");
           
        String name = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
        
       System.out.println(name);
       
       String name1 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(name1);
	
	String name2 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(name2);
	
	String name3 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(name3);
	
	double value = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(2).getCell(0).getNumericCellValue();
	System.out.println(value);
	
	double value1 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(2).getCell(1).getNumericCellValue();
	System.out.println(value1);
	
	boolean result = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(3).getCell(0).getBooleanCellValue();
	System.out.println(result);
	
	boolean result1 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(3).getCell(1).getBooleanCellValue();
	System.out.println(result1);
	
	String Data = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(4).getCell(0).getStringCellValue();
	System.out.println(Data);
	
String Data1 = WorkbookFactory.create(MyFile).getSheet("sheet1").getRow(4).getCell(1).getStringCellValue();
System.out.println(Data1);
	
	}

}

