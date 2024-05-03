package METHODS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTHENTICATION_POPUP {
public static void main(String[] args) throws Throwable {
	
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.guru99.com/V4/");
     driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("atchuth",Keys.TAB,"123456789",Keys.ENTER);
 	Thread.sleep(3000);
 	Alert alt = driver.switchTo().alert();
 	alt.accept();
 	Thread.sleep(3000);
 	System.out.println(alt.getText());
}
}
