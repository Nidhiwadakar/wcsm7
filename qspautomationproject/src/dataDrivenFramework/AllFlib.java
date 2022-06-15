package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class AllFlib {
	

	
	public String readExcelData(String excelPath,String sheetName,int rowcount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) wb.getSheet(sheetName);
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(rowcount);
		Cell cell = (Cell) row.getCell(cellCount);
		String data = ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
		return data;
	}
	
	
	public int getrowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) wb.getSheet(sheetName);
		int rc = ((org.apache.poi.ss.usermodel.Sheet) sh).getLastRowNum();
		return rc;
		
	}
	
	
	public void writeExcelData(String excelPath,String sheetName,int rowcount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);
		
		org.apache.poi.ss.usermodel.Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
	}
  
	


}




