package Task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirdbutton {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// switch to the top frame
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		
		//int framecount = driver.findElement(By.name("//frame"))
		
	    //   WebElement findElement	 = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
		
		 //  if (findElement.isDisplayed()) {
          //  System.out.println("The left frame has text 'LEFT'.");
        //} else {
         //   System.out.println("The left frame does not have text 'LEFT'.");
		
		
       // }
		
		
		//top frame
         driver.switchTo().parentFrame();		
         
         
         //middle frame
         
   //    WebElement middleframeelement  = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
       
     //  if(middleframeelement.isDisplayed()) {
    	   
    	//   System.out.println("themiddlelement" );
    	   
    //   }else {
    	   
    	//   System.out.println("themiddleelement does not have text  " );
       //}
    	 
         
         
         //top frame

         
         
        // driver.switchTo().parentFrame();
         
         //right frame
         
         
         driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
         
         
       
         
         
         
		
		
		
		
		
		
		  
		
		
		
	}

}
