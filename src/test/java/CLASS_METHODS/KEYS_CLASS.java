package CLASS_METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KEYS_CLASS {
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	 //use keys class
	 driver.findElement(By.id("email")).sendKeys("atchuth",Keys.TAB,"703612588",Keys.ENTER);
}
}
