package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass {
	
	@FindBy (id="header-shopping-bag")
	WebElement CartLink;
	
	public CartPage () {
		PageFactory.initElements(driver, this);
	}
	
	public void openCart() {
		CartLink.click();
	}

}
