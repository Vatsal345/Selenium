package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vatsalllll@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("grfhsdjhlsgu");
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		
		Thread.sleep(2000);
		
		String expectedMsg = "Incorrect email/password – please check and retry";
		String actualMsg = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(actualMsg);
		
		if (expectedMsg.equals(actualMsg)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	    
	 	

	}

}
