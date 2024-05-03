package CLASS_METHODS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
    //switch to the frame
	driver.switchTo().frame("iframeResult");
	//clear the FIRST NAME
	WebElement FN = driver.findElement(By.id("fname"));
	//clear the LOST NAME
	WebElement SN = driver.findElement(By.id("lname"));
	//click on the button
	WebElement CL = driver.findElement(By.xpath("//input[@type='submit']"));
    //frame fill
	FN.clear();
	FN.sendKeys("atchuth");
	SN.clear();
	SN.sendKeys("MATTA");
	CL.click();
	
}
}
