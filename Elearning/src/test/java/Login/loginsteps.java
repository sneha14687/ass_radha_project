package Login;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
WebDriver driver;
	
	@Before
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "C://Sneha//SDET//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void aftertest()
	{
		driver.close();
	}
	
	
	@Given("I am able to naviagte onto the login page")
	public void i_am_able_to_naviagte_onto_the_login_page() {
	    driver.get("http://elearningm1.upskills.in/");
	}
	
	@When("I Enter the username as {string}")
	public void i_enter_the_username_as(String string) {
	    driver.findElement(By.id("login")).sendKeys(string);
	}
	
	@When("I Enter the password as {string}")
	public void i_enter_the_password_as(String string) {
	    driver.findElement(By.id("password")).sendKeys(string);
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
	    driver.findElement(By.id("form-login_submitAuth")).click();
		Thread.sleep(3000);
	}
	@Then("i should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
	       String expected = driver.findElement(By.xpath("//*[@id='homepage-course']/div/p[1]/strong")).getText();
		   Assert.assertEquals(expected, string);
		   Thread.sleep(3000);
		   
	}
}
