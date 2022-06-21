package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radioButtons = driver.findElements(By.name("group1"));
		System.out.println(radioButtons.size());
		driver.manage().window().maximize();
		
		for(WebElement a : radioButtons) {
			if(a.isSelected()) {
			System.out.println(a.getAttribute("value")+"----"+a.isSelected());
		}
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		for(WebElement a : radioButtons) {
			if(a.isSelected()) {
			System.out.println(a.getAttribute("value")+"----"+a.isSelected());
		}
		}
		

	}

}
