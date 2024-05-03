package CLASS_METHODS;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SCREENSHOT_SINGLE_ELEMENT {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	//xpath for the single element
	WebElement ele = driver.findElement(By.xpath("//i[@role='img']"));
	Thread.sleep(3000);
	//src element
	File src = ele.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\\\for_selenium\\\\SELENIUMPROJECT\\\\screenshot\\\\LLOGO.png");
	Files.copy(src, dest);
}
}