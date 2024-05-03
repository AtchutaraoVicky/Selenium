package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takescreenshot {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	//screenshot for the face book,,by using screen shot method
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\for_selenium\\SELENIUMPROJECT\\screenshot\\facebook.png");
	Files.copy(src, dest);
	Thread.sleep(3000);
	//single element catch the photo by using the xpath of the element
	WebElement ele = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	File src1 = ele.getScreenshotAs(OutputType.FILE);
	File dest1=new File("C:\\for_selenium\\SELENIUMPROJECT\\screenshot\\FACEBOOKLOGO.png");
	Files.copy(src1, dest1);
	
}
}
