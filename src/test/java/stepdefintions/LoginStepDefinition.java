package stepdefintions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import KiteClass.CapstoneWebAutomationProjectMashal.LoginApplication;
import KiteClass.CapstoneWebAutomationProjectMashal.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
		
	    WebDriver driver;
	    LoginApplication NewLoginApplication;
	    LoginPage NewLoginpage;

	    @Given("User is navigating to Url {string}")
	    public void user_is_navigating_to_Url(String url) throws InterruptedException {
	    	
	    	
	    	Thread.sleep(3000);
	        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); 
	        driver = new ChromeDriver();
	        driver.get("https://admin-demo.nopcommerce.com");
	        
	        
	        
	        NewLoginApplication = new LoginApplication(url, "email","password","login");
	        System.out.println("The Given STEP: ");
	        System.out.println("Url: " + NewLoginApplication.getUrl());
    }

    @When("User is adding {string} and {string}")
    public void user_is_adding_and_Email_password(String email, String admin) throws InterruptedException {
    	Thread.sleep(30000);
        
    	System.out.println("The When STEP:");
    	System.out.println("Email: " + NewLoginApplication.getEmail()+ "\npassword:" + NewLoginApplication.getPassword());
    	driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
    	driver.findElement(By.id("password")).sendKeys(admin);
    	
    }

    @Then("User is clicking on {string} button")
    public void user_is_clicking_on_button(String button) throws InterruptedException {
    	Thread.sleep(3000);
        System.out.println("\nThis is the Then STEP: ");
        System.out.println("Login: "+ NewLoginApplication.getLogin());
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
        
    }

}
