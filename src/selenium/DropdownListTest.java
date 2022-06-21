package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		
		List<WebElement> category = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(category.size());
		
		for(int i=0; i<category.size(); i++) {
			System.out.println(category.get(i).getText() +"-----"+ category.get(i).isSelected()) ;
			
		}
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		
		s.selectByIndex(2);  // art
		Thread.sleep(2000);
		
		s.selectByValue("2984");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Books");
		
		System.out.println("----------------------------------------------------------");
		
		for(int i=0; i<category.size(); i++) {
			System.out.println(category.get(i).getText() +"-----"+ category.get(i).isSelected()) ;
			
		}

	}

}
