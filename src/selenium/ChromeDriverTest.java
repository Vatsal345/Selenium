package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/chromedriver");
		
		//ClassName ObjName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}

	}

}
