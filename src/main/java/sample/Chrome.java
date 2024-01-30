package sample;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 ChromeDriver driver = new ChromeDriver(); //set the driver launch the url
	 
	 driver.get("https://www.google.com/"); //load the Url
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.name("q")).sendKeys("SELENIUM BROWSER DRIVER",Keys.ENTER);//it find the search bar using the name,enter the value
	 //driver.close();
	}

}
