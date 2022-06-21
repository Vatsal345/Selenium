package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("canada");
		Thread.sleep(4000);
		
		List<WebElement> suggesation = driver.findElements(By.xpath("//div[@class='aajZCb']//ul/li"));
		System.out.println(suggesation.size());
		
		for(int i=0; i<suggesation.size(); i++) {
			System.out.println(suggesation.get(i).getText());
		}

	}

}
