package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		Thread.sleep(2000);
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(suggestion.size());
		
		for (int i=0; i<suggestion.size(); i++) {
			System.out.println(suggestion.get(i).getText());
		}

	}

}
