package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_class {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	//xpath for the cursor placed element 
	WebElement ele = driver.findElement(By.xpath("//a[@class='gb_J']"));
     //actions class
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.moveToElement(ele).doubleClick().contextClick().perform();


}
}
