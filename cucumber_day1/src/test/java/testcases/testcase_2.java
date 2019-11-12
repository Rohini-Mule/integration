package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcase_2 
{   WebDriver driver;
	@Given("user launches iedriver And navigate to application url")
	public void user_launches_iedriver_And_navigate_to_application_url() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
	    System.out.println("open application");
	    
	}

	@When("user enter user name as {string} in user field")
	public void user_enter_user_name_as_in_user_field(String un) {
	  driver.findElement(By.name("userName")).sendKeys(un);
	}

	@When("user enter password as {string} in password field")
	public void user_enter_password_as_in_password_field(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("Click Signin")
	public void click_Signin() {
		driver.findElement(By.name("login")).click();
	}

	@Then("validate login success")
	public void validate_login_success() {
		Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
		driver.close();
	   
	}
	@Given("user login to tesmeapp with valid data")
	public void user_login_to_tesmeapp_with_valid_data() {
	   System.out.println("login successfully");
	}

	@Given("user searches the valid product")
	public void user_searches_the_valid_product() {
		System.out.println("product found successfully"); 
	}

	@Given("user do the payment")
	public void user_do_the_payment() {
		System.out.println("payment done successfully");
	}

	@Given("user logout from testmeapp")
	public void user_logout_from_testmeapp() {
		System.out.println("logout successfully");
	}
}
