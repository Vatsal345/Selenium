package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
			
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/");
			
			Thread.sleep(3000);
			
			WebElement career = driver.findElement(By.linkText("Careers"));
			JavascriptExecutor jre = (JavascriptExecutor)driver;
			
			//option 1 to scroll down
			System.out.println(career.getLocation());
			//jre.executeScript("window.scrollBy(0,4500)");
			//career.click();
			
			//option 2 scroll until the element found
			//jre.executeScript("argument[0].scrollIntoView(true)", career);
			//career.click();
			
			//option 3 direct find element and click
			jre.executeScript("arguments[0].click()", career);

	}

}
