package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy1 
{
	WebDriver driver;
	@Given("user open application Testme app")
	public void user_open_application_Testme_app() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp");
	    System.out.println("open application");
	}

	@When("user click on sign in")
	public void user_click_on_sign_in() {
		driver.findElement(By.linkText("SignIn")).click();
		 System.out.println("click on sign");
	}

	@Then("user click on register")
	public void user_click_on_register() {
		driver.findElement(By.linkText("New User?Register Here")).click();
		 System.out.println("click on registeration");
	}

	@When("user enter userName as {string} in userName field")
	public void user_enter_userName_as_in_userName_field(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
		 System.out.println("enter user name");
	   
	}

	@When("user enter firstName as {string} in firstName field")
	public void user_enter_firstName_as_in_firstName_field(String fn) {
		driver.findElement(By.name("firstName")).sendKeys(fn);
		 System.out.println("enter first name");
	    
	}

	@When("user enter lastName as {string} in lastName field")
	public void user_enter_lastName_as_in_lastName_field(String ln) {
		driver.findElement(By.name("lastName")).sendKeys(ln);
		 System.out.println("enter lastname");
	}

	@When("user enter Password as {string} in password field")
	public void user_enter_Password_as_in_password_field(String pw) {
		driver.findElement(By.name("password")).sendKeys(pw);
		 System.out.println("enter password");
	}

	@When("user enter Confirmpassword as {string} in confirm password field")
	public void user_enter_Confirmpassword_as_in_confirm_password_field(String cpw) {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpw);
		 System.out.println("enter confirm password");
	}

	@When("user select gender")
	public void user_select_gender() {
		WebElement radio1=driver.findElement(By.xpath("//input[@value='Female']"));
		radio1.click();
		 System.out.println("select gender");
	}

	@When("user enter E-mail as {string} in email field")
	public void user_enter_E_mail_as_in_email_field(String em) {
		driver.findElement(By.name("emailAddress")).sendKeys(em);
		 System.out.println("enter email");
	}

	@When("user enter mobileno as{string} in mobileno field")
	public void user_enter_mobileno_as_in_mobileno_field(String mn) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mn);
		 System.out.println("enter mobile no");
	}

	@When("user select DOB as{string} in dob field")
	public void user_select_DOB(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
		 System.out.println("enter dob");
	}

	@When("user enter address as {string} in address field")
	public void user_enter_address_as_in_address_field(String add) {
		driver.findElement(By.name("address")).sendKeys(add);
		 System.out.println("enter address");
	}

	/*@When("user select security question")
	public void user_enter_security_question_as_in_security_question_field(String String) {
		Select se=new Select(driver.findElement(By.name("securityQuestion")));
		//se.selectByVisibleText("What is your Birth Place?");
		se.selectByIndex(1);
		//driver.findElement(By.name("securityQuestion")).sendKeys(que);
		 System.out.println("enter security question");
	}*/

	@When("user enter answer as {string} in answer field")
	public void user_enter_answer_as_in_answer_field(String ans) {
		driver.findElement(By.name("answer")).sendKeys(ans);
		 System.out.println("enter answer");
	}

	@When("user click on Register button")
	public void user_click_on_Register_button() {
		driver.findElement(By.name("Submit")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		 System.out.println("click on registration button");
	}

	@Then("user validate Registration page successed")
	public void user_validate_Registration_page_successed() {
		//Assert.assertTrue(driver.getTitle().contains(""));
		//driver.close();
		 System.out.println("registration successfully");
	}

}
