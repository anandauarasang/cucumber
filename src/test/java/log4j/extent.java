package log4j;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extent {
	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports("extent.html", true);
		ExtentTest test = extent.startTest("google search  test one", "validate google search functionalites");
		WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   
		   test.log(LogStatus.INFO, "Starting test case");
		   driver.get("https://google.com");
		   test.log(LogStatus.PASS,"navigate to google.com");
		   driver.findElement(By.name("q")).sendKeys("automation");
		   test.log(LogStatus.PASS,"entered text in searchbox");
		   driver.close();
			  driver.quit();
			  test.log(LogStatus.PASS,"closed the browser");
			  test.log(LogStatus.INFO, "test completed");
			  extent.flush();
		}

}
