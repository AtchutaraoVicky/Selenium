package FRAME_WORK;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Dataa_Driven_Frame_work {
public static void main(String[] args) throws IOException {
	//create obj of file(fis)
	FileInputStream fisp=new FileInputStream("C:\\for_selenium\\SELENIUMPROJECT\\src\\main\\java\\FRAME_WORK\\commondata.properties");
	//properties
	Properties p=new Properties();
	p.load(fisp);
	String UN = p.getProperty("name");
	System.out.println(UN);
	String URL = p.getProperty("acter");
	System.out.println(URL);
	
}
}
