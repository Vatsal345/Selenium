package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTrendingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		//WebElement trending = driver.findElement(By.xpath("//div[@class='srch-m trendingNowTextList']"));
		//List<WebElement> links = trending.findElements(By.tagName("a"));
		//System.out.println(links.size());
		
		List<WebElement> trending = driver.findElements(By.xpath("//div[@class='srch-m trendingNowTextList']//a"));
		System.out.println(trending.size());
		
		for (WebElement a : trending) {
			System.out.println(a.getText());
		}


	}

}
