package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Flib {
	
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
}
