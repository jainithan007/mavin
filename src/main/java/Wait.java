import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
	//	driver.findElement(By.id("alert")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	//	wait.until(ExpectedConditions.alertIsPresent());
		
	//	Alert alert = driver.switchTo().alert();
	//	 alert.accept();
		
		 
		 //driver.findElement(By.xpath("//button[@id='populate-text']")).click();
		// WebElement testtobe  = driver.findElement(By.className("target-text"));
		 
		// WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
		 //wait1.until(ExpectedConditions.textToBePresentInElement(testtobe,  "site"));
		//System.out.println(testtobe .getText());
		
		driver.findElement(By.id("display-other-button")).click();
		
		
	  WebElement enable	 =  driver.findElement(By.id("hidden"));
	  
	  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	
	   wait1.until(ExpectedConditions.visibilityOf(enable));
	
	
	
	   System.out.println(enable.getText());
		
		
		driver.findElement(By.id("enable-button")).click();
		
		WebElement button = driver.findElement(By.id("disable"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		
		
		button.click();
		
		System.out.println(button.getText());
		
		
		
	}

	
	}


