package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;

public class casestudy3 {
	WebDriver driver;
	@Given("user open the test me application")
	public void user_open_the_test_me_application() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp");
		System.out.println("open application");
	}

	@Given("user click on Signin")
	public void user_click_on_Signin() {
		driver.findElement(By.linkText("SignIn")).click();
		 System.out.println("click on sign");
	}

	@Given("user enter Username {string}")
	public void user_enter_Username(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@Given("user enter password {string}")
	public void user_enter_password(String pw) {
		driver.findElement(By.name("password")).sendKeys(pw);
	}

	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Given("user clicks on all categories")
	public void user_clicks_on_all_categories() {
		driver.findElement(By.xpath("//span[contains(text(),'All Categories')]")).click();
		 
	}

	@Given("user clicks on electronics")
	public void user_clicks_on_electronics() {
		driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
	}
	@Given("user clicks on headphones")
	public void user_clicks_on_headphones() {
		driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]")).click();
	}

	@Given("user enters {string} in search bar")
	public void user_enters_in_search_bar(String s) {
		driver.findElement(By.id("pname")).sendKeys(s,Keys.ENTER);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		//driver.findElement(By.name("pname")).sendKeys(Keys.ENTER);
	}
	
	@Given("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.findElement(By.linkText("Add to cart")).click();
	}

	@Given("user clicks on cart")
	public void user_clicks_on_cart() {
		driver.findElement(By.partialLinkText("Cart")).click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	}

	@Given("user clicks on checkout")
	public void user_clicks_on_checkout() {
		driver.findElement(By.linkText("Checkout")).click();
		driver.close();
	}

	/*@Given("user clicks on proceed to pay")
	public void user_clicks_on_proceed_to_pay() {
	    
	}*/

}
