package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");  //provide the path of the file
		
		Workbook wb = WorkbookFactory.create(fis); //make the file ready for read operation
		
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1"); //get into the sheet
		
		Row row = sh.getRow(2); //get the desired row
		
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(1); //get the desired col/cell
		
		String data = cell.getStringCellValue(); //read the data frome that cell
		
		System.out.println(data); //print the data
		
		
		
		
		
		
		
		
		

	}

}
