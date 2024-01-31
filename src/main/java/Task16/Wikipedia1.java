package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver(); //driver
		
		driver.get("https://www.wikipedia.org/"); //url
		
		driver.manage().window().maximize(); //navigate
		
		driver.findElement(By.name("search")).sendKeys("Artificial intelligence",Keys.ENTER);
		//driver.findElement(By.name("go")).click();
		
		driver.findElement(By.linkText("History")).click();  
		
		System.out.println("Title of the History section:" + driver.getTitle() );
	
	}
}
