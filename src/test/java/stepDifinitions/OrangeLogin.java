package stepDifinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLogin {
	WebDriver driver;
	
	@Before("@Login")
	public void setup() {
		//driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("^I navigate to application URL$")
	public void navigate_to_application() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("^I enter username as ([^\"]*) and password as ([^\"]*)$")
	public void enter_username_and_password(String uname, String pwd) {
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);	
	}
	@And("^I click on Login button$")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	 @Then("^User should be able to login based on ([^\"]*) login status$")
	   public void user_should_be_able_to_login_based_on_login_status(String expected) {
		 String actual=null;
	       try {
	    	   if( driver.findElement(By.xpath("//p[contains(@class,'oxd-alert-content-text')]")).isDisplayed()) 
	           {
	    	     actual="fail";
	           }
	        }
	       catch(Exception e) {
	    	   actual="pass";
	       }
	 Assert.assertEquals(actual, expected);
	 
	    }
	@After("@Login")
	 public void closure() {
		 driver.quit(); 
	 }
}
