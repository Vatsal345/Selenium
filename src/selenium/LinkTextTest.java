package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		
		//Thread.sleep(2000);
		
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		wait.until(ExpectedConditions.urlContains("https://about.google/"));
		String expectedUrl = "https://about.google/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if (expectedTitle.equals(actualTitle) & actualUrl.contains(expectedUrl))  {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		
		
		

	}

}
