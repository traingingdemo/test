package KIng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findbyid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();		
		
		driver.get("https://amazon.in");
	String myurl = driver.getCurrentUrl();
	System.out.println(myurl);
	
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
	driver.findElement(By.id("nav-search-submit-button")).click();

     String myurl1 = driver.getCurrentUrl();
         System.out.println(myurl1);
         
         driver.navigate().back();
         
         
       String title  = driver.getTitle();
       System.out.println(title);
       
       driver.quit();

}
}

		
		