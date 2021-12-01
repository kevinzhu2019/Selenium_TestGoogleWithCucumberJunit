package steps;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.ResultPage;

public class SearchFunction {

	String path = "/src/test/resources/drivers/chromedriver.exe";
	MainPage objMainPage;
	ResultPage objResultPage;
	WebDriver driver;
	
	@Given("user go to main page")
	public void user_go_to_main_page() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + path);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

	@When("user enters text in search page and press enter")
	public void user_enters_text_in_search_page_and_press_enter() {
		objMainPage = new MainPage(driver);
		objMainPage.enterContentsAndEnter("sega");
	}
	
	@When("user enters text in search page")
	public void user_enters_text_in_search_page() {
		objMainPage = new MainPage(driver);
		objMainPage.enterContents("sega");
	}

	@Then("user navigates to result page")
	public void user_navigates_to_result_page() {
		objResultPage = new ResultPage(driver);
		assertEquals(true, objResultPage.verifyExists());
	}

	@And("clicks search button")
	public void clicks_search_button() {
		objMainPage.clickSearch();
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
