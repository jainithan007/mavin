package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi2 {
	public static void main(String[] args) {		
WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.guvi.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement  loginbutton	= driver.findElement(By.xpath("//a[@class='nav-link  text-primary text-center px-4']"));
		
		loginbutton.click();
			
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jainithan446@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hdfc@007");
		
	    WebElement	submitbutton  =   driver.findElement(By.xpath("//a[@id='login-btn']"));
	    
	    submitbutton.click();
	    
	    String userlogin = driver.getTitle();
	    
	    if(userlogin.equals(userlogin)) {
	    	
	    	System.out.println("loginsuccessful");
	    	
	    }else {
	    	
	    	System.out.println("loginfail ");
	    }
	    	//driver.close();
	}

}
