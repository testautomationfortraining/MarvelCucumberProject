package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	WebDriver driver;
	
	@Given("^user is already in loginPage$")
	public void user_already_loggedin() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
	}
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
		WebElement username=driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		username.sendKeys("mngr402998");
		password.sendKeys("hupyqUr");
	}
	
	@Then("^user click on login button$")
	public void user_click_login_btn() {
		WebElement btnLogin=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btnLogin.click();
		driver.close();
	}
}
