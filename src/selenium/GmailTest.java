package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.id("identifierId")).sendKeys("vatsallllll@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		Thread.sleep(3000);
		
		String expectedMsg = "Couldn’t find your Google Account";
		String actualMsg = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(actualMsg);
		
		if(expectedMsg.equals(actualMsg))  {
			System.out.println("Test Pass");
		} else  {
			System.out.println("Test Fail");
		}
		
		
		
	}

}
