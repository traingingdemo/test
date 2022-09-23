package KIng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	Thread.sleep(5000);
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);

driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	
	
	}
	//String f= driver.findElement(By.id("nav-logo-sprites")).getText();
	//System.out.println(f);
		

		
	}


