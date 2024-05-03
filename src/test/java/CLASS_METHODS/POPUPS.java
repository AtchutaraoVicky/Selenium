package CLASS_METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUPS {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	Thread.sleep(3000);
	//alert popup
			driver.get("https://demo.guru99.com/V4/");
			Thread.sleep(3000);
			//xpath
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("atchuth",Keys.TAB,"12345",Keys.ENTER);
			driver.switchTo().alert().accept();
}
}
