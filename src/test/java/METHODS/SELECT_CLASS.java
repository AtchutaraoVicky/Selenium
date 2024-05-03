package METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SELECT_CLASS {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a)[3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("atchuth",Keys.TAB,"matta",Keys.TAB,"123146568",Keys.TAB,"asfgfgu",Keys.ENTER);
     
	//select class
	WebElement day = driver.findElement(By.id("day"));
	//create select class
	Select s=new Select(day);
	s.selectByVisibleText("24");
	Thread.sleep(3000);
	WebElement month= driver.findElement(By.id("month"));
	Select s1=new Select(month);
	s1.selectByVisibleText("Mar");
	Thread.sleep(3000);
	WebElement year= driver.findElement(By.id("year"));
	Select s2=new Select(year);
	s2.selectByVisibleText("2000");
	
	
    


}
}
