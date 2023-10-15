package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumHelpeer.Shared;

public class ShirtPage {
	
	WebDriver dr;
	@FindBy(xpath = "ShirtSubmanu") WebElement FristShrit;
	
	public ShirtPage (WebDriver x ) {
		 dr = x;
		PageFactory.initElements(dr, this);
	
	}
	
	
	public ProductDetailPage clickOnFirstShrit() {
		Shared.clickonElement(null);
		
		return new ProductDetailPage();
		
	}

}
