package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
			
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(2000);
		
		List<WebElement> notif = driver.findElements(By.className("_24EHh"));
		System.out.println(notif.size());
		
		if (notif.size()>0) {
			//notif.get(0).click();
			driver.findElement(By.className("_24EHh")).click();
		}
		
		Thread.sleep(2000);
		
		
		
		List<WebElement> popup = driver.findElements(By.className("close-btn"));
		System.out.println(popup.size());
		
		if (popup.size()>0) {
			//popup.get(0).click();
			driver.findElement(By.className("close-btn")).click();
		} 
			driver.findElement(By.id("search-key")).sendKeys("computer");
		
		
		
		

	}

}
