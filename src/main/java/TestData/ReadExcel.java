package TestData;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	//Creating workbook instance that refers to .xls file
    //XSSFWorkbook wb;
	
 
public  void readExcel() throws IOException
 {

		try {
			//Prepare the path of excel file

    String filePath = System.getProperty("user.dir")+"\\src\\TestDataExcel.xlsx";
 //String filePath = "N://Testing//TestDataExcel.xlsx";
 //Create an object of File class to open xlsx file
    File file = new File(filePath);
    
    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream;

	inputStream = new FileInputStream(file);    
    System.out.println(inputStream);
     XSSFWorkbook workbook = new XSSFWorkbook(inputStream);	
    System.out.println(workbook.getNumberOfSheets());
     //Creating a Sheet object using the sheet Name
     XSSFSheet sheet=workbook.getSheet("STUDENT_DATA");
    System.out.println(sheet.getFirstRowNum());
    //Create a row object to retrieve row at index 1
    XSSFRow row2=sheet.getRow(1);
    
    //Create a cell object to retreive cell at index 5
    XSSFCell cell=row2.getCell(1);
    
    //Get the address in a variable
    String address= cell.getStringCellValue();
    
    //Printing the address
    System.out.println("Address is :"+ address);
   

			// TODO Auto-generated catch block
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
 }
}
