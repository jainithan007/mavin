package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	     String title = driver.getTitle();
	     
	     System.out.println("page title:" + title);
        
	      String currenturl =  driver.getCurrentUrl();
	      
	      System.out.println("page currenturl:"+ currenturl);
	      
	      
	         String pagesource   = driver.getPageSource();
	         System.out.println("pagesource:" + pagesource);

	         
}

}