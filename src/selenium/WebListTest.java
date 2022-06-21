package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		//WebElement leftFooter = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		//List<WebElement> allLinks = leftFooter.findElements(By.tagName("a"));
		
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		System.out.println(allLinks.size());
		
		//System.out.println(allLinks.get(0).getText());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}
	}

}
