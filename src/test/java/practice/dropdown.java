package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	//xpath for the create account
	driver.findElement(By.xpath("(//a)[3]")).click();
	Thread.sleep(3000);
	//by using select class fill the boxes,,,at a time fill by using keys,class
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("atchuth",Keys.TAB,"matta",Keys.TAB,"5454548",Keys.TAB,"hagdgd2@",Keys.ENTER);
    //fill the date of birth using select class
	 Thread.sleep(3000);
	 WebElement ele = driver.findElement(By.id("day"));
	 Select s=new Select(ele);
	 s.selectByVisibleText("25");
	 Thread.sleep(3000);
	 WebElement month = driver.findElement(By.id("month"));
	 Select s1=new Select(month);
	 s1.selectByVisibleText("Mar");
	 WebElement year = driver.findElement(By.id("year"));
	 Select s2=new Select(year);
	 s2.selectByVisibleText("2000");



}
}
