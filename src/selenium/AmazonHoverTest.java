package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		Thread.sleep(2000);
		
		WebElement hover = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions builder = new Actions(driver);
        builder.moveToElement(hover).build().perform();
        
        Thread.sleep(2000);
        
        List<WebElement> subCategory = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
        System.out.println(subCategory.size());
        
        for (WebElement list : subCategory) {
        	System.out.println(list.getText());
        }

	}

}
