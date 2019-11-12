package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;

public class casestudy_4 {
	WebDriver driver;
	@Given("user open the testme application")
	public void user_open_the_testme_application() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp");
		System.out.println("open application");
	}

	@Given("user clicks on Signin")
	public void user_clicks_on_Signin() {
		driver.findElement(By.linkText("SignIn")).click();
		 System.out.println("click on sign");
	}

	@Given("user enters UserName {string}")
	public void user_enters_UserName(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@Given("user enters password {string}")
	public void user_enters_password(String pw) {
		driver.findElement(By.name("password")).sendKeys(pw);
	}

	@Given("user click on Login button")
	public void user_click_on_Login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Given("user click on all categories")
	public void user_click_on_all_categories() {
		driver.findElement(By.xpath("//span[contains(text(),'All Categories')]")).click();
	}

	@Given("user click on electronics")
	public void user_click_on_electronics() {
		driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
	}

	@Given("user click on headphones")
	public void user_click_on_headphones() {
		driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]")).click();
	}

	@Given("user enter {string} in search bar")
	public void user_enter_in_search_bar(String s) {
		driver.findElement(By.id("pname")).sendKeys(s,Keys.ENTER);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	}

	@Given("user click on add to cart")
	public void user_click_on_add_to_cart() {
		Assert.assertTrue(driver.equals("Cart"));
		driver.close();
	}


}
