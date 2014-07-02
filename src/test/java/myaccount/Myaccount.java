package myaccount;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;




public class Myaccount {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
          driver = new FirefoxDriver();
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          driver.manage().window().maximize();
          
    }
    
	@Given("^The user is on Frog Home Page$")
	public void The_user_is_on_Frog_Home_Page() {
	    driver.get("http://ww1.thomascook.com/");
	    driver.findElement(By.cssSelector("img.login")).click();

	}

	@When("^The user enters \"([^\"]*)\" in Email Address text field$")
	public void The_user_enters_in_Email_Address_text_field(String arg1) {
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(arg1);

	}

	@When("^user enters \"([^\"]*)\" in Password text field$")
	public void user_enters_in_Password_text_field(String arg1) {
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(arg1);

	}

	@When("^clicks on the \"([^\"]*)\" button$")
	public void clicks_on_the_button(String arg1) {
	    driver.findElement(By.id("register-user")).click();

	}

	@Then("^User should see MYACCOUNT Page$")
	public void User_should_see_MYACCOUNT_Page() {
	    // Express the Regexp above with the code you wish you had

	}

	@After
	  public void tearDown() throws Exception {
	    driver.quit();

	  }
}



