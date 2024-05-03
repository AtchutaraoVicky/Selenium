package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	Thread.sleep(3000);
	//xpath for the img
	WebElement src = driver.findElement(By.id("div1"));
	Thread.sleep(3000);

	//xpath for the img drop
	WebElement dest = driver.findElement(By.id("div2"));
	Thread.sleep(3000);

	//create actions class
	Actions act=new Actions(driver);
	act.dragAndDrop(src, dest).perform();
}
}
