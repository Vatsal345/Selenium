package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		 //ClassName ObjName = new ClassName();
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=J4PpHCSEA64&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiSjRQcEhDU0VBNjQiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0Mjk3MjAyNSwiaWF0IjoxNjQyOTcwODI1LCJqdGkiOiJhZTkxYjRjOS01OGZhLTQ3YWMtYjgwYS02YTM2MjhkOGEyZGUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.AoY6hoCqgvZa1af4-xVQn0zm6mJv6CoPTh19RwvBjqyEdV_yFBBConQpAmwNYGCVaS1-cAA6qTDabnGeT8HquApyd5EnMsGVHOlYXHZ-CtdbxEXCKh_pHO8tU9QURAxKuezdE42bv3iiJ-IPJ9YDmWWP0-e6U_iXrJKBU6YjzGdxdCk_hQ3W7ENuUIGGory7oNZQYLOMYvEyt7nCMgp76VoBu0aV4EBFsgF2rwJG8qgtA_IPr0bzihkKQ4IhRNUS_dElweN-N2VHJA1bUZLlhpkKSN6OJnD-KUmVkHQaFTfybt5K4cxCElmpsTL_uwqewEQBf2mw7szKc2QyBPIh6g&preferred_environment=");
		 
		 driver.findElement(By.id("usernameInput-input")).sendKeys("fdhgssdhd");
		 driver.findElement(By.id("password-input")).sendKeys("dfgfdghd");
		 driver.findElement(By.id("password-input")).sendKeys(Keys.ENTER);
		 
		 
		 Thread.sleep(2000);
		 
		 String expectedErrorMsg = "Please check your card number / username or password and try again.";
		 String actualErrorMsg = driver.findElement(By.id("globalError")).getText();
		 System.out.println(actualErrorMsg);
		 
		 if(expectedErrorMsg.equals(actualErrorMsg))  {
			 System.out.println("Test Pass");
		 } else {
			 System.out.println("Test Fail");
		 }

	}

}
