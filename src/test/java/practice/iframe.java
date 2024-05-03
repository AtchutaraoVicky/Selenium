package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	driver.switchTo().frame("iframeResult");
	Thread.sleep(3000);
	//xpath for the fn
	WebElement fn = driver.findElement(By.id("fname"));
	fn.clear();
	fn.sendKeys("atchuth");
	Thread.sleep(3000);
	//xpath for sn
	WebElement sn = driver.findElement(By.id("lname"));
	sn.clear();
	sn.sendKeys("matta");
	Thread.sleep(3000);
	//click
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
}
}
