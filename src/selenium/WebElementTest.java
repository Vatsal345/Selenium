package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver();
        
        //ParentClassName objName = new ClassName
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("dgfhgdgfydtggzfg");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("gdhgfhgf");
		
		WebElement clickButton = driver.findElement(By.name("login"));
		clickButton.click();


	}

}
