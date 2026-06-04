package XYZProjectpkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EntireProject {
    WebDriver driver;

    @BeforeTest
    public void browserSetup() {

        driver = new ChromeDriver();

    }

    @Test
    public void bank() {

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

    }

    @AfterTest
    
    
    
    //HOME PAGE
    
    
    
    
    public void home() throws Exception {
    	Thread.sleep(2000);
    	 WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/button"));
         element.click();
         Thread.sleep(2000);
         WebElement elemen=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/button[1]"));
         elemen.click();
         WebElement eleme=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/button"));
         eleme.click();
         Thread.sleep(2000);
         WebElement elemen1=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/button[1]"));
         elemen1.click();
         Thread.sleep(2000);
         
         
   // button clickable
  	     
		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));

		 WebElement button = wait3.until(
		 ExpectedConditions.elementToBeClickable(
	     By.xpath("//button[text()='Customer Login']")));

		 button.click();
    
    
    
        
    //CUSTOMER LOGIN
    
    
    
    
    //hermoin granger
    
        Thread.sleep(2000);
        WebElement dropdown = driver.findElement(By.name("userSelect"));

	    Select select = new Select(dropdown);

	    select.selectByVisibleText("Hermoine Granger");
	    Thread.sleep(2000);
	    WebElement element3=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/button"));
	    element3.click();
	    Thread.sleep(2000);
	    WebElement eleme9=driver.findElement(By.xpath("/html/body/div/div/div[1]/button[2]"));
	    eleme9.click();
	
	 //harry potter
	 
	    WebElement dropdown2 = driver.findElement(By.name("userSelect"));

	    Select select2 = new Select(dropdown2);

	    select2.selectByVisibleText("Harry Potter");

	    Thread.sleep(2000);

	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/button")).click();

	    Thread.sleep(2000);

	    driver.findElement(By.xpath("/html/body/div/div/div[1]/button[2]")).click();

	    Thread.sleep(2000);
	
	 
	 //albus
	   
		 WebElement element11=driver.findElement(By.name("userSelect"));
	     element11.click();
		 Thread.sleep(2000);
		 WebElement element4=driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[5]"));
		 element4.click();
		 Thread.sleep(2000);
		 WebElement element5=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button"));
		 element5.click();
		 Thread.sleep(2000);
		 WebElement elem6=driver.findElement(By.xpath("/html/body/div/div/div[1]/button[2]"));
		 elem6.click();
		 Thread.sleep(2000);
	 
	 
	 //neville
		 
		 WebElement element6=driver.findElement(By.name("userSelect"));
	     element6.click();
		 Thread.sleep(2000);
		 WebElement element7=driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[6]"));
		 element7.click();
		 Thread.sleep(2000);
		 WebElement element8=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button"));
		 element8.click();
		 Thread.sleep(2000);
	
    
   
    
    //DEPOSIT
    
    
 
  
    
	     WebElement element42 = driver.findElement(
	     By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]"));
	     element42.click();
		 Thread.sleep(2000);
		 WebElement element52=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
		 element52.click();
		 Thread.sleep(2000);
		 WebElement element62=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
		 element62.sendKeys("100");
		 Thread.sleep(2000);
		 WebElement element72=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"));
		 element72.click();
		 Thread.sleep(2000);
		 WebElement element32=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
	     element32.click();
	     Thread.sleep(2000);
	     WebElement elemen17=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
		 elemen17.sendKeys("10.2");
		 Thread.sleep(2000);
		 WebElement elemen72=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"));
		 elemen72.click();
		 Thread.sleep(2000);
		 WebElement elemen3 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
		 elemen3.clear();
		 elemen3.sendKeys("0");
		 WebElement elemen4=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"));
		 elemen4.click();
		 WebElement elemen5 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input"));
		 elemen5.clear();
		 elemen5.sendKeys("1234567887896766");
		 Thread.sleep(2000);
		 WebElement elemen6=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button"));
		 elemen6.click();
	 
		 
	 // Select account
//		 select.selectByVisibleText("1003");
//	
//		 WebDriverWait wait0= new WebDriverWait(driver, Duration.ofSeconds(10));
//	
//		 // Wait for amount field
//		 WebElement holder = wait3.until(
//		 ExpectedConditions.elementToBeClickable(
//		 By.xpath("//input[@placeholder='amount']")));
//
//	 
//		 WebElement depo = null;
//		 // Enter amount
//		 depo.clear();
//		 depo.sendKeys("100");
//
//		 Thread.sleep(2000);
//
//		 driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//		 depo.clear();
//		 depo.sendKeys("0");
		 
		 

			// Select account
			 
//		 WebElement dropdown7 = driver.findElement(By.id("accountSelect"));
//			
//		 Select select7 = new Select(dropdown);
//			
//		 select.selectByVisibleText("1002");
//			
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			
//				 // Wait for amount field
//		 WebElement amount0 = wait.until(
//		 ExpectedConditions.elementToBeClickable(
//		 By.xpath("//input[@placeholder='amount']") ));
//
//			 
//			 
//			 // Enter amount
//		 amount0.clear();
//		 amount0.sendKeys("100");
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//button[@type='submit']")).click();
//		 amount0.clear();
//		 amount0.sendKeys("abc");
//		 Thread.sleep(2000);
	 
	 //Backbutton
	 
//		 WebElement elemen8=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
//		 elemen8.click();
	 
	 
	 
    
	 
	 
	 //WITHDRAWL
	 
	 
	 
	 
		 Thread.sleep(2000);
	
	     driver.findElement(
	         By.xpath("//button[contains(text(),'Withdrawl')]")
	     ).click();
	
	     
	     
	     Thread.sleep(2000);
	
	     WebElement amount9 = driver.findElement(
	         By.xpath("//input[@placeholder='amount']")
	     );
	
	     amount9.sendKeys("500");
	     Thread.sleep(2000);
	     
	     driver.findElement(
	         By.xpath("//button[@type='submit']")
	     ).click();
	     
	     Thread.sleep(2000);
	
	     WebElement amount10 = driver.findElement(
	         By.xpath("//input[@placeholder='amount']")
	     );

	     amount10.sendKeys("");
	     Thread.sleep(2000);
	     
	     driver.findElement(
	         By.xpath("//button[@type='submit']")
	     ).click();
	     Thread.sleep(2000);
	     
	     WebElement amount2 = driver.findElement(
	             By.xpath("//input[@placeholder='amount']")
	         );
	     Thread.sleep(2000);
	     
	
	     amount2.sendKeys("0");
	
	     Thread.sleep(2000);
	         
	     driver.findElement(
	             By.xpath("//button[@type='submit']")).click();
	      Thread.sleep(2000);
         
// spinner 
         
         amount2.clear();
         
         WebElement amount4 = driver.findElement(
         	    By.xpath("//input[@placeholder='amount']"));

         amount2.sendKeys("-4");

         Thread.sleep(2000);
         	
         driver.findElement(
         	    By.xpath("//button[contains(text(),'Withdraw')]")).click();
         Thread.sleep(2000);
         	 
          amount2.clear();
         	 
         WebElement amount5 = driver.findElement(
		                By.xpath("//input[@placeholder='amount']"));
	     Thread.sleep(2000);
	            

		 amount2.sendKeys("2.5");

		 Thread.sleep(2000);
		            
		 driver.findElement(
		                By.xpath("//button[@type='submit']") ).click();
		 Thread.sleep(2000);
		            
		amount2.clear();
	            	 
         WebElement amount6 = driver.findElement(
		                By.xpath("//input[@placeholder='amount']"));
	     Thread.sleep(2000);
	            

		 amount2.sendKeys("100000");

		 Thread.sleep(2000);
		            
		 driver.findElement(
		                By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		            
		 amount2.clear();
		          
		          
		            
           // Transaction list
		          
		          
		  driver.findElement(By.xpath("//button[contains(text(),'Withdrawl')]")).click();

		  driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("100");
		  Thread.sleep(2000);

		  driver.findElement(By.xpath("//button[@type='submit']")).click();

		  driver.findElement(By.xpath("//button[contains(text(),'Transactions')]")).click();

		     
		          

    
    
  
    	driver.quit();
    }
    
    
    
}
