package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends BaseTest{

	@Test
	public static void addProductToCart() throws MalformedURLException {
		
		driver = BaseTest.getDriver("Android");
		HomePage hp = new HomePage(driver);
		//hp.isSearchIconDisplayed();
		//hp.searchItem();
		hp.searchIcon.click();
		hp.searchTextBox.sendKeys("Apple");
		hp.searchResultImage.click();
		hp.addToCartButton.click();
		hp.orderInputBox.click();
		hp.orderInputBox.sendKeys("1");
		hp.addButton.click();
		
		
	}


}
