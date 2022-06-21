package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximiseWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();

	}

}
