package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDBankFooterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");

		List<WebElement> footer = driver.findElements(By.xpath("//div[starts-with(@class,'td-footer-links')]/a"));
		System.out.println(footer.size());
		
		for (int i=0; i<footer.size(); i++) {
			System.out.println(footer.get(i).getText());
		}

	}

}
