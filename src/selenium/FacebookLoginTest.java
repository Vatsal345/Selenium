package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//EMAIL
		//1. By ClassName - Not working because of compound class name and spaces in the class name.
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sfsgdhghsh");
		
		//2. CSS selector
		//driver.findElement(By.cssSelector(null))  - need to learn in detail first.
		
		//3. id - working (first choice among all)
		//driver.findElement(By.id("email")).sendKeys("fhjdgs");
		
		//4. Linktext - Not working because it must have a "href" or "a" tag to use this
		//driver.findElement(By.linkText(null))  - only for link
		
		//5. name - working (first choice among all like id attribute)
		driver.findElement(By.name("email")).sendKeys("hsdgfsdb");
		
		//6. partialLinktext - same as linktext
		//driver.findElement(By.partialLinkText(null))    
		
		//7. TagName - must be unique to work or else the tag name used for execution comes very first
		//driver.findElement(By.tagName("input")).sendKeys("sdjfhgfghs"); - Not working in this case
		
		//8. Xpath - it is used in the case where all other options are not working. takes more than for execution among all
		//driver.findElement(By.xpath(null))  - need to learn in details
		
		
		//PASSWORD
		// name
		driver.findElement(By.name("pass")).sendKeys("sjdhjhgf");
		
		
		//LOGIN - click on login
		driver.findElement(By.name("login")).click();

	}

}
