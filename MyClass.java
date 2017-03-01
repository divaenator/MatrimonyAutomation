package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import com.thoughtworks.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	 public static void main(String[] args) {
	        
	        //String tagName = "";
	        try 
	        {
	        	WebDriver driver = new ChromeDriver();
	        	//WebDriver driver = new FirefoxDriver();
	        	
		        String baseUrl = "https://profile.tamilmatrimony.com/login/";
		        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		        String subWindowHandler = null;

		        

	        driver.get(baseUrl); 
	       
	        driver.findElement(By.xpath("/html/body[@id='close']/center/div[@id='fixed-topnavbar']/div[4]/div[@id='lp-container']/div/div[@class='wrapper paddt20']/div[@id='formdiv']/div[@id='mydiv']/div[@id='rndcorner']/div[@id='log']/div/div/div/form/div[@class='lheight120'][1]/input[@id='ID']")).sendKeys("physelvasics@gmail.com");
	        driver.findElement(By.xpath("/html/body[@id='close']/center/div[@id='fixed-topnavbar']/div[4]/div[@id='lp-container']/div/div[@class='wrapper paddt20']/div[@id='formdiv']/div[@id='mydiv']/div[@id='rndcorner']/div[@id='log']/div/div/div/form/div[@class='lheight120'][2]/input[@id='PASSWORD']")).sendKeys("mcaphytcs");
	        driver.findElement(By.xpath("/html/body[@id='close']/center/div[@id='fixed-topnavbar']/div[4]/div[@id='lp-container']/div/div[@class='wrapper paddt20']/div[@id='formdiv']/div[@id='mydiv']/div[@id='rndcorner']/div[@id='log']/div/div/div/form/div[@class='fleft paddl15']/input[@class='button small']")).click();
	        driver.findElement(By.xpath("//*[@id=\"fixed-topnavbg\"]/div/ul/div[1]/li[4]/div/div[1]/a")).click();
	       //start loop
	        Set<String> handles = driver.getWindowHandles(); // get all window handles
	        Iterator<String> iterator = handles.iterator();
	        while (iterator.hasNext()){
	            subWindowHandler = iterator.next();
	        }
	        
	        driver.findElement(By.xpath("//*[@id=\"chk2\"]")).click();
	   
	        driver.findElement(By.xpath("//*[@id=\"msgall\"]")).click();
	   
	        	driver.switchTo().window(subWindowHandler); // switch to popup window
            // perform operations on popup
				        //driver.switchTo().defaultContent(); // optional, use only if driver is already in an iframe
			
				        WebElement contform = driver.findElement(By.name("contactform"));//("iframe[src*='../mailbox/inbwritemsg.php*']"));
				        // there are other overloads (by frame name, index, id) and locators can be used here.
				        driver.switchTo().frame(contform);
				        // make sure your locator here is correct
				        WebElement submitbtn = driver.findElement(By.id("unew-pop-button hdtxt1 boldtxt submitbtn")); // I doubt this is correct
				        WebElement msgbox = driver.findElement(By.id("message_id")); // I doubt this is correct

				        // from your screenshot, I'd suggest By.cssSelector("[id*='userDetailsBean.lastName'] input")
				        msgbox.sendKeys("selva kalyaanam");
				        submitbtn.click();
				        
				        driver.findElement(By.xpath("//*[@id=\"innercont\"]/div[2]/div/div[4]/div[2]/div[3]/a")).click();
	        //<a class="new-pop-button hdtxt1 boldtxt submitbtn" style="text-decoration:none;" title="Send Message" onclick="javascript: textareaSubmit(1,'profile.tamilmatrimony.com');">Send Message</a>
				      //*[@id="innercont"]/div[2]/div/div[4]/div[2]/div[3]/a
				        driver.switchTo().window(parentWindowHandler);  // switch back to parent window

	        //*[@id="innercont"]/div[2]/div/div[4]/div[2]/div[3]/a
	        
	       //Iframe 
	        //driver.findElement(By.linkText("Send Message")).click();
	        	//driver.switchTo().(driver.findElement(By.id("iframecontact")));
	        	//driver.switchTo().(driver.findElement(By.xpath("//*[@id=\"ResultContainer\"]")));
		        //driver.switchTo().frame(driver.findElement(By.id("iframecontact")));
		        driver.switchTo().frame(driver.findElement(By.id("iframename")));
		        //driver.findElement(By.xpath("message_id")).clear();
		       driver.findElement(By.xpath("//html/body/form/div/div/div[2]/div/div[4]/div[2]/div[3]/a")).click();
		        //driver.switchTo().defaultContent();
	        
	        //driver.findElement(By.xpath("//*[@id=\"newpopbx\"]/div/div")).click();
	        //driver.findElement(By.xpath("//*[@id=\"msgall\"]")).click();
	        //driver.findElement(By.xpath("//*[@id=\"msgall\"]")).click();
	        
	      
	      
	        // TimeUnit.SECONDS.sleep(5);
	       /* driver.findElement(By.id("ID")).sendKeys("physelvasics@gmail.com");
	        TimeUnit.SECONDS.sleep(5);
*/
	      
	        //driver.close();
	        System.exit(0);
	        }
	        catch(Exception e){
	        	System.out.println(e.getMessage());
	        } 
	 }

	
}
