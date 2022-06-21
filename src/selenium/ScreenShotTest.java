package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		//File srcFile = ((TakeScreenShot)driver).getScreenShotAs(OutputType.FILE)    this is webdriver line
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("/Users/vatsalpatel/Desktop/Testing/screenshot.jpg"));

	}

}
