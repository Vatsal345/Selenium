package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver();
        
        //ParentClassName objName = new ClassName
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("dgfhgdgfydtggzfg");
		driver.findElement(By.id("pass")).sendKeys("gdhgfhgf");
		driver.findElement(By.name("login")).click();

	}

}
