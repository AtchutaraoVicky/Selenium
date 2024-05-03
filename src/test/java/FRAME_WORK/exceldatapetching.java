package FRAME_WORK;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

public class exceldatapetching {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream fis=new FileInputStream("C:\\for_selenium\\SELENIUMPROJECT\\src\\test\\resources\\testdata1.xlsx");
	 
	String data = WorkbookFactory.create(fis).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	Thread.sleep(3000);
	 double data1 = WorkbookFactory.create(fis).getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
	System.out.println(data1);
}
}
