package pro1;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class b {

	@Test
	 void setup() throws MalformedURLException, InterruptedException{
		System.out.println("hello");
		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setBrowserName(BrowserType.CHROME);
		cap.setBrowserName(BrowserType.FIREFOX);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub") , cap);
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("cars");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(21000);
		driver.quit();
		
		
	}

}
