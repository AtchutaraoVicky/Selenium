package CLASS_METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAG_AND_DROP {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	//in case dag and drop not work we have to 1st switch to the frame
	//xpath for the src element
	WebElement src = driver.findElement(By.id("div1"));
	WebElement dest = driver.findElement(By.id("div2"));
	Thread.sleep(3000);
	//create actions class
	Actions act=new Actions(driver);
	act.dragAndDrop(src, dest).perform();
	
}
}
