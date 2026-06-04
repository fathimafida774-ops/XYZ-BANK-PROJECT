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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManagerPage {
	WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @Test
    public void managerlogin() throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement managerBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(text(),'Bank Manager Login')]")));
        managerBtn.click();
        
        Thread.sleep(2000);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement addCustomerTab = wait1.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//button[contains(text(),'Add Customer')])[1]")));

        addCustomerTab.click();
        Thread.sleep(2000);
        
        
        WebElement openAccountTab = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(text(),'Open Account')]")));

        openAccountTab.click();
        Thread.sleep(2000);

        
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("userSelect")));
        
        WebElement customersTab = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(text(),'Customers')]")));

        customersTab.click();

       
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Search Customer']")));
        Thread.sleep(2000);
        
        
       
        //ADD CUSTOMER
        
        
        

         WebElement addCustomer = wait1.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//button[contains(text(),'Add Customer')])[1]")));

         addCustomerTab.click();

         WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	     // First Name
	     WebElement fname = wait11.until(
	             ExpectedConditions.visibilityOfElementLocated(
	                     By.xpath("//input[@placeholder='First Name']")));
	
	     fname.sendKeys("Rinaf");
	
	     // Last Name
	     WebElement lname = wait11.until(
	             ExpectedConditions.visibilityOfElementLocated(
	                     By.xpath("//input[@placeholder='Last Name']")));
	
	     lname.sendKeys("fida");
	
	     // Post Code
	     WebElement postcode = wait11.until(
	             ExpectedConditions.visibilityOfElementLocated(
	                     By.xpath("//input[@placeholder='Post Code']")));
	
	     postcode.sendKeys("673001");
	    	Thread.sleep(2000);
	
	     
	     WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	     WebElement submitBtn = wait111.until(
	             ExpectedConditions.elementToBeClickable(
                     By.xpath("//button[text()='Add Customer']")));
	     submitBtn.click();
	    	Thread.sleep(2000);
	
	     Alert alert = driver.switchTo().alert();
	
	     alert.accept();
	     
	   // Test1
	     
	     WebElement Nname = wait11.until(
	             ExpectedConditions.visibilityOfElementLocated(
	                     By.xpath("//input[@placeholder='First Name']")));
	
	     fname.sendKeys("65432");
	     WebElement lname1 = wait11.until(
	             ExpectedConditions.visibilityOfElementLocated(
	                     By.xpath("//input[@placeholder='Last Name']")));
	
	     lname.sendKeys("fida");
	
	     WebElement postcode1 = wait11.until(
	             ExpectedConditions.visibilityOfElementLocated(
	                     By.xpath("//input[@placeholder='Post Code']")));
	
	     postcode1.sendKeys("673001");
	    	Thread.sleep(2000);
	
	     
	     WebDriverWait wait1111 = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	     WebElement submitBtn1 = wait111.until(
	             ExpectedConditions.elementToBeClickable(
	                     By.xpath("//button[text()='Add Customer']")));
	     submitBtn1.click();
	    	Thread.sleep(2000);
	
	    	   Alert alert1 = driver.switchTo().alert();

  	     alert.accept();
  	     
  	     //test2
  	     
	     WebElement name2 = wait11.until(
	             ExpectedConditions.visibilityOfElementLocated(
	                     By.xpath("//input[@placeholder='First Name']")));
	     name2.sendKeys("fathima{{}]");
	     
	     WebElement name1 = wait11.until(
	             ExpectedConditions.visibilityOfElementLocated(
	                     By.xpath("//input[@placeholder='Last Name']")));

	     lname.sendKeys("#%*()");

	     WebElement postcod = wait11.until(
	             ExpectedConditions.visibilityOfElementLocated(
	                     By.xpath("//input[@placeholder='Post Code']")));

	     postcod.sendKeys("abcd***");
	    	Thread.sleep(2000);

	     
	     WebDriverWait wait11111 = new WebDriverWait(driver, Duration.ofSeconds(20));

	     WebElement submitBtn2= wait111.until(
	             ExpectedConditions.elementToBeClickable(
	                     By.xpath("//button[text()='Add Customer']")));
	     submitBtn1.click();
	    	Thread.sleep(2000);

	    	   Alert alert2 = driver.switchTo().alert();

	  	  alert.accept();
  	     
	  	     //Test3  lengthy
	  	     
	  	     
		     WebElement name4 = wait11.until(
		             ExpectedConditions.visibilityOfElementLocated(
		                     By.xpath("//input[@placeholder='First Name']")));
		     name4.sendKeys("asdfghhjkllpoiuytreewqzcvbnnmmmm");
		     
		     WebElement name5 = wait11.until(
		             ExpectedConditions.visibilityOfElementLocated(
		                     By.xpath("//input[@placeholder='Last Name']")));

		     name5.sendKeys("nmbnvcvzxsdasweerfgtyghyujkioklopkhgfg");

		     WebElement postcod4 = wait11.until(
		             ExpectedConditions.visibilityOfElementLocated(
		                     By.xpath("//input[@placeholder='Post Code']")));

		     postcod4.sendKeys("09876543212345656778788989990000008878678677676765765657678");
		    	Thread.sleep(2000);

		     
		     WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));

		     WebElement sbmtbtn= wait111.until(
		             ExpectedConditions.elementToBeClickable(
		                     By.xpath("//button[text()='Add Customer']")));
		     submitBtn1.click();
		    	Thread.sleep(2000);

		    	   Alert alert4 = driver.switchTo().alert();

		  	     alert.accept();	  
		  	     
		  
	  	     
	 //Empty field
  	     
//	  	   WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	  	WebElement submitBtn0 = wait.until(
//	  	        ExpectedConditions.elementToBeClickable(
//	  	                By.xpath("//button[@type='submit']")));
//
//	  	submitBtn.click();
//	  	
//	  	WebElement fname0 = driver.findElement(
//	  	        By.xpath("//input[@placeholder='First Name']"));
//
//	  	String validation = fname.getAttribute("validationMessage");
//
//	  	System.out.println(validation);
//	  	     
//	  	
//	  	WebElement fname7 = driver.findElement(
//	  	        By.xpath("//input[@placeholder='First Name']"));
//
//	  	fname7.clear();   // Keep field empty
//
//	  	driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
//	  	
	  	
	// button clickable
		  	     
		  	     
//	  	WebDriverWait wait98= new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	  	WebElement button11= wait.until(
//	  	        ExpectedConditions.elementToBeClickable(
//	  	                By.xpath("//button[text()='open accound']")));
//
//	  	button11.click();
//	  	Thread.sleep(2000);
//	  	button11.clear();
//	  	
//  	     
//	  	WebDriverWait wait65 = new WebDriverWait(driver, Duration.ofSeconds(20)); 
//	  	button11.click();
	 
	  	
	  	//Test4 data store
	  	
	  	
	  	     
//        driver.findElement(
//                By.xpath("//button[contains(text(),'Customers')]")).click();
//
//                
//                Thread.sleep(2000);
//
//                
//                String tableText = driver.findElement(
//                By.xpath("//table")).getText();
//
//                if(tableText.contains("Rinaf")) {
//
//                    System.out.println("Customer displayed successfully");
//
//                } else {
//
//                    System.out.println("Customer not found");
//
//                }
//
        
        
        
        
        
        
        
        
        
        //OPEN ACCOUNT
        
        

        WebDriverWait wait22= new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement openAccount = wait2.until(
            ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")
            )
        );

        openAccount.click();
        
        
     // Customer dropdown
        
        
        WebElement customer = wait22.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("userSelect")));

        Select cus = new Select(customer);

        cus.selectByVisibleText("Harry Potter");

        // Currency dropdown
        
        
        WebElement currency = driver.findElement(By.id("currency"));

        Select cur = new Select(currency);

        cur.selectByVisibleText("Dollar");
        
        Thread.sleep(2000);
        
     
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
        
        
        Thread.sleep(2000);
        
     // Handle Alert
        
        
        driver.switchTo().alert().accept(); 
        
        Thread.sleep(2000);
        
 // Customer2
        
        
        WebElement customer2 = wait22.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("userSelect")));

        Select cus2 = new Select(customer);

        cus.selectByVisibleText("Ron Weasly");

        WebElement currency2 = driver.findElement(By.id("currency"));

        Select cur2 = new Select(currency);

        cur.selectByVisibleText("Rupee");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
        
        Thread.sleep(2000);
        
        driver.switchTo().alert().accept(); 
        
        Thread.sleep(2000);
        
        
        //same customer different currency
        
        
        WebElement customer5 = wait22.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("userSelect")));

        Select cus5 = new Select(customer);

        cus.selectByVisibleText("Ron Weasly");

        WebElement currency6 = driver.findElement(By.id("currency"));

        Select cur6 = new Select(currency);

        cur.selectByVisibleText("Pound");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
        
        Thread.sleep(2000);
        
        driver.switchTo().alert().accept(); 
        
        Thread.sleep(2000);
        
        
        //no customer selected
        
        
        Select cur3 = new Select(driver.findElement(By.id("currency")));

        cur3.selectByVisibleText("Rupee");

        driver.findElement(By.xpath("//button[text()='Process']")).click();

        Thread.sleep(2000);

        cur3.selectByIndex(0);
        
        
        // no currency selected
        
        Select cus4 = new Select(driver.findElement(By.id("userSelect")));

        cus4.selectByVisibleText("Harry Potter");

        driver.findElement(By.xpath("//button[text()='Process']")).click();

        Thread.sleep(2000);

        cus.selectByIndex(0);

       
        
        
        
        
        
        //CUSTOMERS
        
        
        
        WebElement customersBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(text(),'Customers')]")));

        customersBtn.click();
        
        //filter
        
        
        Thread.sleep(2000);
        
        WebElement filter = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")));
        filter.sendKeys("Harry"); 
        Thread.sleep(2000);
        
        filter.clear();
        
        //delete
        
        
        Thread.sleep(2000);
        
        WebElement delete = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[5]/button")));
        delete.click() ; 
        Thread.sleep(2000);
        
        
        WebElement naviagtion = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/thead/tr/td[3]/a")));
        naviagtion.click();
        Thread.sleep(2000);
        
        
        
        driver.quit();
    } 
        
    
        

    
}
