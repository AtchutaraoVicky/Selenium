package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {
public static void main(String[] args) {
	 WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.guru99.com/V4/");
	 //xpathof the name
	 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("atchuth",Keys.TAB,"ajksfhjasdh",Keys.ENTER);
     driver.switchTo().alert().accept();
    
	 


}
}
