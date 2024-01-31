package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();//set the driver
		
		driver.get("http://google.com");//get the url
		
		driver.manage().window().maximize();
		
		 System.out.println("Current Url:" + driver.getCurrentUrl());
		 
		 driver.navigate().refresh();
		 //driver.close();
	}

}
