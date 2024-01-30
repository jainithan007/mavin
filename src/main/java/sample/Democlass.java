package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.partialLinkText("Log")).click();
	}

}
