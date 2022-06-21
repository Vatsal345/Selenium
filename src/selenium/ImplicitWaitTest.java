package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "/Users/vatsalpatel/Desktop/SeleniumJars/geckodriver");
		
		//ClassName ObjName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver();
        
        //ParentClassName objName = new ClassName
        WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //Max time. Not usually fixed all the time
		//Thread.sleep(2000);
		
		WebElement signUp = driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]"));
		signUp.click();
		
		//Thread.sleep(4000); fixed time it will wait for that particular time
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Patel");
		
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("3654761618");
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("dhfgbjkss");
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Mar");
		//Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		selectDay.selectByVisibleText("18");
		//Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("1994");
		//Thread.sleep(2000);
		
		WebElement sex = driver.findElement(By.xpath("//input[@value='2']"));
		sex.click();
		//Thread.sleep(2000);
		
		WebElement clickSignUp = driver.findElement(By.name("websubmit"));
		clickSignUp.click();
		

	}

}
