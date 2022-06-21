package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/Best-Sellers-generic/zgbs/?ref_=nav_cs_bestsellers");
		
		WebElement header = driver.findElement(By.id("nav-main"));
		List<WebElement> links = header.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//for (int i=0; i<links.size(); i++) {
			//System.out.println(links.get(i).getText());
		//}
		
		for (WebElement h : links) {
			System.out.println(h.getText());
		}
		
		

	}

}
