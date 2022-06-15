package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadMultipleData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		for(int i=0;i<=11;i++)
		{
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
			Row row = sh.getRow(i);
			org.apache.poi.ss.usermodel.Cell cell = row.getCell(1);
			String data = cell.getStringCellValue();
			System.out.println(data);


	}
}
}
