package CLASS_METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ACTIONS_CLASS {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	//xpath for the select element of the move
	WebElement ele = driver.findElement(By.xpath("//a[@class='gb_J']"));
	//create actions class
     Actions act =new Actions(driver);
     act.moveToElement(ele).doubleClick().contextClick().perform();
     
	
	
}
}
