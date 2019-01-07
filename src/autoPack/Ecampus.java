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
public class Ecampus {

	public void eCampus() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\quillan.ogle\\eclipse-workspace\\auto\\Jar Files\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("https://ecampus.phoenix.edu/portal/portal/public/login.aspx");
				
		driver.manage().window().maximize();
						
		driver.findElement(By.id("ctl00_leftColumn_ctl00_txtUserName")).sendKeys("Quillan13");
		
		driver.findElement(By.id("ctl00_leftColumn_ctl00_txtUserPass")).sendKeys("Marrino13");
		
		driver.findElement(By.id("ctl00_leftColumn_ctl00_btnLogin")).click();
				
		
	}

}
