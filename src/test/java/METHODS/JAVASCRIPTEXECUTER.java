package METHODS;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVASCRIPTEXECUTER {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/s?k=amazon+prime&adgrpid=1322714101714665&hvadid=82669897711050&hvbmt=bb&hvdev=c&hvlocphy=158279&hvnetw=o&hvqmt=b&hvtargid=kwd-82670518517893%3Aloc-90&hydadcr=5621_2377279&tag=msndeskstdin-21&ref=pd_sl_f6wf1fn58_b");
	//scrolldown
	Thread.sleep(3000);
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,5000)");
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,-2000)");
	
}
}
