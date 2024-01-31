package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.partialLinkText("Log")).click();
	 
	    driver.findElement(By.id("email")).sendKeys("jainithan446@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("Jai@007");
	    
	    driver.getCurrentUrl(); 
	}

}
