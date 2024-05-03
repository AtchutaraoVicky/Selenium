package CLASS_METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROP_DOWN_CLASS {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	//click the new account
	driver.findElement(By.xpath("(//a)[3]")).click();
	Thread.sleep(3000);
	//keys class used
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ATCHUTH",Keys.TAB,"MATTA",Keys.TAB,"7036121546",Keys.TAB,"Atchutarao-12",Keys.ENTER);
    //day xpath
	WebElement day = driver.findElement(By.id("day"));
	//select class
	Select s=new Select(day);
	s.selectByVisibleText("4");
	//month xpath
	WebElement month = driver.findElement(By.id("month"));
	//select class
	Select s1=new Select(month);
	s1.selectByVisibleText("Feb");
	//year xpath
	WebElement year = driver.findElement(By.id("year"));
	//select class
	Select s2=new Select(year);
	s2.selectByVisibleText("2001");





}
}
