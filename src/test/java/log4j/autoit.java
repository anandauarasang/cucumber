package log4j;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoit {
	@Test
	public static void test()throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   driver.get("https://pdfhost.io/");
		     
		   driver.findElement(By.xpath("//div[@class='jss213 FileUpload-upload-card-actions']")).click();
		
		   Runtime.getRuntime().exec("C://Users/HP/Desktop/opal/autpIT/pdfuploadscript1.exe");
		   Thread.sleep(8000);
		   driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		 
		    //driver.close();
	}

}
