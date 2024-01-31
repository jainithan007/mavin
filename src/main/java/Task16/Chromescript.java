package Task16;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Chromescript {
	 

		public static void main(String[] args) {
	       
	      
	     
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get(" https://www.demoblaze.com/");
	     
	       driver.manage().window().maximize();
	       
	       String exceptedtitle = "STORE" ;
	       String actualtitle  = driver.getCurrentUrl();
	       if(actualtitle.equals(exceptedtitle)) {
	    	   
	    	   System.out.println("pageloading on correct website");
	       }
	    	   
	    	   else {
	    		   
	    		   System.out.println("page not loaded on correct website");
	    		   
	    	   }
	    	   driver.close();
	       }
	        
	       
	      
	    }
	


	
	