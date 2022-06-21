package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("canada");
		Thread.sleep(4000);
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(suggestion.size());
		
		for (int i=0; i<suggestion.size(); i++) {
			if (suggestion.get(i).getText().contains("canada")) {
			System.out.println(suggestion.get(i).getText());
		} else {
			System.out.println("Test Fail");
			break;
		}

	}

}
}