package FRAME_WORK;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numaric_data {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\for_selenium\\SELENIUMPROJECT\\src\\test\\resources\\testdata1.xlsx");
	 
	 double data = WorkbookFactory.create(fis).getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
	System.out.println(data);
}
}
