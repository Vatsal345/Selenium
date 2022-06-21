package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AliExpressTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(2000);
		
		WebElement women = driver.findElement(By.linkText("Women's Fashion"));
		Actions builder = new Actions(driver);
        builder.moveToElement(women).build().perform();
        
        Thread.sleep(2000);
        
        List<WebElement> subCategory = driver.findElements(By.xpath("(//dl[@class='sub-cate-items'])[1]//a"));
        System.out.println(subCategory.size());
        
        for (WebElement list : subCategory) {
        	System.out.println(list.getText());
        }

	}

}
