package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> element = driver.findElements(By.linkText("Sortable"));
		System.out.println(element.size());
		
		if (element.size()>0) {
			System.out.println("Sortable Element Present");
		}else {
			System.out.println("Sortable Not Present");
		}
		
		
		List<WebElement> element2 = driver.findElements(By.id("draggable"));
		System.out.println(element2.size());
		
		if (element2.size()>0) {
			System.out.println("draggable Element Present");
		}else {
			System.out.println("draggable Not Present");
		}
		
		System.out.println("-------------------After switching to frame-----------------");
		
		driver.switchTo().frame(0);   //switch by index number
		//driver.switchTo().frame("demo-frame"); //only used in case of id or name attribute available for iframe.
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		element = driver.findElements(By.linkText("Sortable"));
		System.out.println(element.size());
		
		if (element.size()>0) {
			System.out.println("Sortable Element Present");
		}else {
			System.out.println("Sortable Not Present");
		}
		
		
		element2 = driver.findElements(By.id("draggable"));
		System.out.println(element2.size());
		
		if (element2.size()>0) {
			System.out.println("draggable Element Present");
		}else {
			System.out.println("draggable Not Present");
		}
		
		System.out.println("-------------------After switching to main content-----------------");
		
		driver.switchTo().defaultContent();
		
		element = driver.findElements(By.linkText("Sortable"));
		System.out.println(element.size());
		
		if (element.size()>0) {
			System.out.println("Sortable Element Present");
		}else {
			System.out.println("Sortable Not Present");
		}
		
		
		element2 = driver.findElements(By.id("draggable"));
		System.out.println(element2.size());
		
		if (element2.size()>0) {
			System.out.println("draggable Element Present");
		}else {
			System.out.println("draggable Not Present");
		}
		
		
	}

}
