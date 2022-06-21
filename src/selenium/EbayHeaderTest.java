package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> header = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		System.out.println(header.size());
		
		for (int i=0; i<header.size(); i++) {
			System.out.println(header.get(i).getText());
		}

	}

}
