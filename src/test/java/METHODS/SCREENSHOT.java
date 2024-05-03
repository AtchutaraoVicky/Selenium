package METHODS;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SCREENSHOT {
public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    //create a screenshot
    TakesScreenshot ts=(TakesScreenshot) driver;
   File src = ts.getScreenshotAs(OutputType.FILE);
   File dest=new File("C:\\for_selenium\\SELENIUMPROJECT\\screenshot\\GOOGLE.png");
   Files.copy(src, dest);
   Thread.sleep(3000);
   //screenshot for individuval element
    //logo xpath
   WebElement ele = driver.findElement(By.xpath("(//img)[1]"));
   File src1 = ele.getScreenshotAs(OutputType.FILE);
   File dest1=new File("C:\\\\for_selenium\\\\SELENIUMPROJECT\\\\screenshot\\\\GLOGO.png");
   Files.copy(src1, dest1);
   
   
}
}
