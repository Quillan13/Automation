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
public class OpenAir {

	public void openAir() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\quillan.ogle\\eclipse-workspace\\auto\\Jar Files\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("https://www.openair.com");
				
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginBtn")).click();
						
		driver.findElement(By.id("input_company")).sendKeys("RSI");
		
		driver.findElement(By.id("input_user")).sendKeys("quillan.ogle");
		
		driver.findElement(By.id("input_password")).sendKeys("Marrino13");
		
		driver.findElement(By.id("oa_comp_login_submit")).click();
		
		
	}

}
