package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("dgfhgdgfydtggzfg");
		driver.findElement(By.id("pass")).sendKeys("gdhgfhgf");
		driver.findElement(By.name("login")).click();

	}

}
