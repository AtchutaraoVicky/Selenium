package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class java_script_executer {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_7nz3nh37er_e&adgrpid=1323813657261162&hvadid=82738617292972&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=116074&hvtargid=kwd-82739282108858:loc-90&hydadcr=5625_2377262");
    //scroll down the page by using java script executer
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,5000)");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-2000)");



}
}
