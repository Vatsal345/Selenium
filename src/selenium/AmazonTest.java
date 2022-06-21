package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vatsal_vgp@yahoo.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("ap_password")).sendKeys("jhsfdvjfb");
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(2000);
		
		String expectedMsg = "Your password is incorrect";
		String actualMsg = driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();
		
		if (expectedMsg.equals(actualMsg))  {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
		
	}

}
