package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{

	@FindBy (id="men-link")
	WebElement MenShopping;
	@FindBy (id="women-link")
	WebElement WomenShopping;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyHomeTitle() {
		return driver.getTitle();
	}
	
	public MenShoppingPage VerifyMenLink() {
		MenShopping.click();
		return new MenShoppingPage();
	}
}
