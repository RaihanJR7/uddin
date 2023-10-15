package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumHelpeer.Shared;

public class HomePage {
	WebDriver dr;
	
	@FindBy(xpath = "Main manu") WebElement menmanubar;
	@FindBy(xpath = "ShirtSubmanu") WebElement allShirtSubMenu;
	
	public HomePage (WebDriver x) {
		dr = x;
		PageFactory.initElements(dr, this);// for driver initilize that's why we use pageFactory.
	}
	public void hoverOverMainmanu() {
		
		Shared.hoverOver(menmanubar);
	}
	 public ShirtPage clickAllshirtSubManu() {
		 
		 Shared.clickonElement(menmanubar);
		 
		 return new ShirtPage(dr);
	 }
	 
}
