package RegStepDef;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
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
	
	@Given("I am able to naviagte onto the elarning page")
	public void i_am_able_to_naviagte_onto_the_elarning_page() throws InterruptedException {
        driver.get("http://elearningm1.upskills.in/");
        driver.findElement(By.xpath("//*[@id='login-block']/div/ul/li[1]/a")).click();
        Thread.sleep(3000);
	}
	
	@When("I Enter the first name as {string}")
	public void i_enter_the_first_name_as(String string) {
	    driver.findElement(By.id("registration_firstname")).sendKeys("sneha6");
	}
	
	@When("I Enter the last name as {string}")
	public void i_enter_the_last_name_as(String string) {
	    driver.findElement(By.id("registration_lastname")).sendKeys("kumbhar");
	}
	
	@When("I Enter the email as {string}")
	public void i_enter_the_email_as(String string) {
	    driver.findElement(By.id("registration_email")).sendKeys("sneha14687@gmail.com");
	}
	
	@When("I Enter the user name as {string}")
	public void i_enter_the_user_name_as(String string) {
	    driver.findElement(By.id("username")).sendKeys("ssk_12338");
	}
	
	@When("I Enter the pass as {string}")
	public void i_enter_the_pass_as(String string) {
	    driver.findElement(By.id("pass1")).sendKeys("varad");
	}
	
	@When("I Enter the confirm password as {string}")
	public void i_enter_the_confirm_password_as(String string) {
	    driver.findElement(By.id("pass2")).sendKeys("varad");
	}
	
	@When("I click on the register button")
	public void i_click_on_the_register_button() throws InterruptedException {
	    driver.findElement(By.id("registration_submit")).click();
		Thread.sleep(3000);
	}
	@Then("I should see the message")
	public void I_should_see_the_message() throws InterruptedException {
		   String msg1 = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/p[1]")).getText();
		   System.out.println(msg1);
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a/img")).click();
		   String inbox = driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[3]/a")).getText();
		   Assert.assertEquals(inbox, "Inbox");
		   
	}
}
