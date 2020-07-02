package pageTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.HomePage;

public class HomePageTest extends BaseClass{
	
	public HomePage home_page;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		init();
		home_page=new HomePage();
	}
    @Test
    public void CheckTitle() {
    	String title= home_page.VerifyHomeTitle();
    	Assert.assertEquals("Luxury fashion & independent designers | SSENSE", title);
    }
    
    @Test
    public void CheckMenLink() {
    	home_page.VerifyMenLink();
    }
    
    @AfterMethod
    public void teardown() {
    	driver.quit();
    }
}
