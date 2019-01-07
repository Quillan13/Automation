/**
 * 
 */
package autoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
/**
 * @author quillan.ogle
 *
 */
public class Netsuite {

	public void netSuite() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\quillan.ogle\\eclipse-workspace\\auto\\Jar Files\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp?country=US");
				
		driver.manage().window().maximize();
								
		driver.findElement(By.id("userName")).sendKeys("quillan.ogle@ruralsourcing.com");
		
		driver.findElement(By.id("password")).sendKeys("Marrino131518");
				
		driver.findElement(By.id("submitButton")).click();
		
		try {
			driver.findElement(By.name("answer")).sendKeys("Quiggle");
			driver.findElement(By.name("submitter")).click();

		} catch (Exception e) {
			//ignore
		}
		
		
	}

}
