package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstone {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoblaze.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("Laptops")).click();
	    
            Thread.sleep(3000);
		
		
	      driver.findElement(By.linkText("sony vaio i5")).click();
	      
	      driver.findElement(By.linkText("Add to cart")).click();
	      
	    
	    
	} 

}
