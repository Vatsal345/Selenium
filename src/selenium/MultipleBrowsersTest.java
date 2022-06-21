package selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		//FileInputStream f = new FileInputStream("/Users/vatsalpatel/Desktop/Testing/prop.properties");
		//Properties prop = new Properties();
		//prop.load(f);
		//String browser = prop.getProperty("browser");
		
		String browser = "Firefox";  // chrome,safari
		WebDriver driver;
		
		if (browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		//ClassName ObjName = new ClassName();
		driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/chromedriver");
		driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.safari.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/safaridriver");
		driver = new SafariDriver();
		}
		

		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("jfhdbavhjdak");;
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("gdhgfhgf");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}

}
