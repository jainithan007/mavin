package Task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

          WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
	driver.manage().window().maximize();
		
	
	
	  WebElement  frame  = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
	   
	   driver.switchTo().frame(frame);
		
	
	  //WebElement tagname  =  driver.findElement(By.tagName("p")); 
	  
	
	  
	   WebElement  newWindowText = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
	   
	   
	   newWindowText.clear();
	   
	   newWindowText.sendKeys("hello people");
	  
	  
	  
	 
	  
	 
	  
	 // ptag.clear();
	  
	   
	  
		
		//paragraph.sendKeys("Hello people");
		

	}

}
