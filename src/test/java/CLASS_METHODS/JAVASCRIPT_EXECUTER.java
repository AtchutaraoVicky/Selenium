package CLASS_METHODS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JAVASCRIPT_EXECUTER {
public static void main(String[] args) throws Throwable {
	WebDriver  driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_8b9xsvs1gj_b&adgrpid=136127568877&hvpone=&hvptwo=&hvadid=617721249835&hvpos=&hvnetw=g&hvrand=5288511628908885800&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-29089840&hydadcr=5716_2362046&gclid=EAIaIQobChMIzb_CydrGhQMV46NmAh2IMwPlEAAYASAAEgI0I_D_BwE");
	//java script executer
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,4000)");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-1000)");
}
}
