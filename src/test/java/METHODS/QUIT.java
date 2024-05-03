package METHODS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QUIT {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_7nz3nh37er_e&adgrpid=1323813657261162&hvadid=82738617292972&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=156428&hvtargid=kwd-82739282108858:loc-90&hydadcr=5625_2377262");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.quit();
}
}
