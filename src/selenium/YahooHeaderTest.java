package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> header = driver.findElements(By.xpath("//ul[contains(@class,'_yb_1kaaw _yb_12pq8')]/li"));
		System.out.println(header.size());
		
		for (int i=0; i<header.size(); i++) {
			System.out.println(header.get(i).getText());
		}
		

	}

}
