package KIng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();		
		
		driver.get("https://amazon.in");
		
		driver.findElement(By.xpath("//img[@src='https://images-eu.ssl-images-amazon.com/images/G/31/img22/Fashion/Event/Jupiter22/GW/Phase-1/QC/PC/MF-186-116-4._SY116_CB609357628_.jpg']")).click();
		
		

		
		
		
		
		
		
		//driver.findElement(By.id("nav-link-accountList")).click();		
		//driver.findElement(By.id("ap_email")).sendKeys("9581596664");
	    
	

		

		
	
		
	}

}
