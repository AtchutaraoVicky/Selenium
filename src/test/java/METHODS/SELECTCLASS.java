package METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SELECTCLASS {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a)[3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("atchuth",Keys.TAB,"matta",Keys.TAB,"754545",Keys.TAB,"Atchuthg2",Keys.ENTER);
    
	//select class
	WebElement day = driver.findElement(By.id("day"));
	//day
	Select s=new Select(day);
	s.selectByVisibleText("25");
	Thread.sleep(3000);
	//month
	WebElement month = driver.findElement(By.id("month"));
	Select s1=new Select(month);
	s1.selectByVisibleText("Mar");
    Thread.sleep(3000);
	//year
	WebElement year = driver.findElement(By.id("year"));
	Select s2=new Select(year);
	s2.selectByVisibleText("2020");
	
	



}
}
