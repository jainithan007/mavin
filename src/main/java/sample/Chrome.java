package sample;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
	 ChromeDriver driver = new ChromeDriver(); //set the driver launch the url
	 
	 driver.get("https://www.google.com/"); //load the Url
	   
	
	 driver.manage().window().maximize();
	 
	 WebElement element =  driver.findElement(By.name("q"));
	 
		element.sendKeys("SELENIUM BROWSER DRIVER");
		Thread.sleep(3000);
		
		element.clear();
	 
	
	}

}
