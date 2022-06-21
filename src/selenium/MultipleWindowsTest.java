package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[starts-with(@class,'header-cross')]")).click();
		driver.findElement(By.name("reebok")).click();
		Thread.sleep(3000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> itr = allWindows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);  //switch to reebok
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);  //switch to adidas
		System.out.println(driver.getTitle());
		driver.quit();
	
		

	}

}
