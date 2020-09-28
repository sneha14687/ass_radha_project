package Mail;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MailSteps {
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

	@Given("Elearning is logged in")
	public void elearning_is_logged_in() throws InterruptedException 
	{
		driver.get("http://elearningm1.upskills.in/");
        driver.findElement(By.id("login")).sendKeys("snehashree");
        driver.findElement(By.id("password")).sendKeys("Varad@124");
        driver.findElement(By.id("form-login_submitAuth")).click();
		Thread.sleep(3000);
        
    }	
 
    @When("I click on compose button")
    public void i_click_on_compose_button() throws InterruptedException 
    {
    	driver.findElement(By.xpath("//*[@id='profileCollapse']/div/ul/li[2]/a")).click();
    	Thread.sleep(3000);
    }
 
    @When("I Enter Send to mail as {string}")
    public void i_enter_send_to_mail_as(String string) {
    driver.findElement(By.xpath("//*[@id='compose_message']/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("sk@gmail.com");    
    }
    
    @When("I Enter subject as {string}")
    public void i_enter_subject_as(String string) {
    driver.findElement(By.id("compose_message_title")).sendKeys("Hi For Testing");
    }
    
    @When("I Enter message as {string}")
    public void i_enter_message_as(String string) {
    driver.findElement(By.xpath("/html[1]/body[1]")).sendKeys("Hello Mr Naveen,(/n) This is for Testing (/n)");
    }
    
    @When("I click on send message button")
    public void i_click_on_send_message_button() throws InterruptedException {
    driver.findElement(By.id("compose_message_compose")).click();
    Thread.sleep(3000);
    }

    @Then("I should get acknowledgement")
    public void i_should_get_acknowledgement() {
    String message = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/div[1]")).getText();
    System.out.println(message);
    }
}
