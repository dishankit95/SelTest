package pro1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;






public class test2 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","/home/dishankit/Desktop/ProJars/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/");
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	String home = driver.getWindowHandle();
	driver.findElement(By.linkText("Window")).click();
	Thread.sleep(2000);
	List<WebElement>  btns = driver.findElements(By.tagName("button"));
	for(WebElement b:btns) {
		if(b.getText().contains("Open Multiple Windows")) {
			b.click();
			break;
		}
	}
	Set<String> hans = driver.getWindowHandles();
	System.out.println(hans.size());

	for(String han:hans) {
		driver.switchTo().window(han);
		if(!han.equals(home)) {
			driver.close();
		}
		
	}
	
	
	
	
	
	
}}