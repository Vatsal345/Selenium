package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//CSS selector
		//email
		driver.findElement(By.cssSelector("#email")).sendKeys("dhgfhgjhfhjgj");
				
				
		//PASSWORD
		driver.findElement(By.cssSelector("#pass")).sendKeys("sgdfghjkjkgfghc");
				
				
		//LOGIN - click on login
		driver.findElement(By.cssSelector("button[id^='u_0_d_']")).click();

	}

}
