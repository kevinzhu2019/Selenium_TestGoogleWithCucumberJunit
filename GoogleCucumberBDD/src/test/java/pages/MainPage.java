package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	@FindBy(xpath="//input[@name='q']")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@class='lJ9FBc']//input[@value='Google Search']")
	WebElement searchBtn;
	
	WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterContentsAndEnter(String str) {
		searchBox.sendKeys(str + Keys.ENTER);
	}
	
	public void enterContents(String str) {
		searchBox.sendKeys(str);
	}
	
	public void clickSearch() {
		searchBtn.submit();
	}
}
