package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(dropdown.size());
		
		for (WebElement all : dropdown) {
			System.out.println(all.getText());
		}
		
		

	}

}
