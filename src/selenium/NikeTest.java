package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		Thread.sleep(2000);
		
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
        builder.moveToElement(men).build().perform();
        
        Thread.sleep(2000);
        
        List<WebElement> subCategory = driver.findElements(By.xpath("(//div[@id='DesktopMenu-0-1-0']/div//div)[2]/a"));
        System.out.println(subCategory.size());
        
        for (WebElement list : subCategory) {
        	System.out.println(list.getText());
        }

	}

}
