package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(2000);
		
		WebElement electronic = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
        builder.moveToElement(electronic).build().perform();
        
        Thread.sleep(2000);
        
        List<WebElement> topCategory = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
        System.out.println(topCategory.size());
        
        for (WebElement list : topCategory) {
        	System.out.println(list.getText());
        }
		
	}

}
