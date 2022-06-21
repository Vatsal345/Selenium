package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndFwdButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
	}

}
