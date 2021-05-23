package com.Flipkart.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Homepage {
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement LoginPopup;
	
	@FindBy(name="q")
	private WebElement searchBOX;
	
	@FindBy(xpath="//span[contains(text(),'Showing 1 – 24 ')]")
	private WebElement ContentVal;
	
	@FindBys({
		@FindBy(xpath="//div[@class='_4rR01T']")
		
	})
	private List<WebElement> Iphonedevices;
	
	
	@FindBys({
		@FindBy(xpath="//span[contains(text(),'Ratings')]")
		
	})
	private List<WebElement> IphoneRatings;
	
	@FindBys({
		@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
		
	})
	private List<WebElement> IphonePrice;
	
	

	public WebElement getLoginPopup()
	{
		return LoginPopup;
	}

	public WebElement getSearchBOX() 
	{
		return searchBOX;
	}

	public WebElement getContentVal() 
	{
		return ContentVal;
	}

	public List<WebElement> getIphonedevices()
	{
		return Iphonedevices;
	}

	public List<WebElement> getIphoneRatings() {
		return IphoneRatings;
	}

	public List<WebElement> getIphonePrice() {
		return IphonePrice;
	}


	
	public WebElement getPopup()
	{
		return LoginPopup;
	}


	


}
