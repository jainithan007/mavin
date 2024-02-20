package Task21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class Thirdbutton {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// switch to the top frame
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		
		// three frames on the page
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		String eleSize = String.valueOf(frames.size());
		if (eleSize.equals("3")) {
			System.out.println("There are three frames present in this page");
		} else {
			System.out.println("There is no three frames present in this page");
		}
		
		// left
       driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
		
         
		//verify left frame
       
    
       
       WebElement body1 = driver.findElement(By.tagName("body"));
		String leftText = body1.getText();

        
        if(leftText.equals("LEFT")) {
        	
        	System.out.println("show the left key" + leftText);
        }
        	else {
        		 
        		System.out.println("not show the key");
        	}  		
        	
        // topframe
        driver.switchTo().parentFrame();
        
        //middle
        
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        
          WebElement body2 =  driver.findElement(By.tagName("body"));
          String middletext = body2.getText();
          
          if(middletext.equals("MIDDLE")) {
        	  
        	  System.out.println("show the middle key"+ middletext );
          }
          
          else {
        	  System.err.println("not showing the key");
        		  
        	  
        	  
          }
          driver.switchTo().parentFrame();
          
          
          driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
          
        WebElement body3 = driver.findElement(By.tagName("body"));
        
        String righttext = body3.getText();
        
        
        if(righttext.equals("RIGHT")) {
        	
        	System.out.println("show the right key" + righttext );
        }
        else {
        	
        	System.out.println("no showing the key");
        	
        	
        }
        	
           driver.switchTo().defaultContent();
        	
        	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
            
            WebElement body4 = driver.findElement(By.tagName("body"));
            
            String buttomttext = body4.getText();
            
            
            if(buttomttext.equals("BOTTOM")) {
            	
            	System.out.println("show the right key" + buttomttext );
            }
            else {
            	
            	System.out.println("no showing the key");
        	
        }
            driver.switchTo().parentFrame();
            
            
            String url = driver.getCurrentUrl();
            
            if (url.contains("nested_frames")) {
            	
            	System.err.println("showing the current url" + url);
            }
            else {
            	System.out.println("not showing the current url");
            }
          
          
          
         
          
          
          
        }
	
	      

         
         
         
		
		
		
		
		
		
		  
		
	}	
		
	
	
	
	
