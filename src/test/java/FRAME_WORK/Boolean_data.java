package FRAME_WORK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean_data {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\for_selenium\\SELENIUMPROJECT\\src\\test\\resources\\testdata1.xlsx");
	 
	boolean data = WorkbookFactory.create(fis).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
	System.out.println(data);
}
}
