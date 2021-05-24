package com.Flipkart.testscripts;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart.GenericRepository.BaseClass;
import com.Flipkart.ObjectRepository.Homepage;
import com.opencsv.CSVWriter;

public class FetchingDetailsIphone extends BaseClass {
	@Test
	public void detailsIphone() throws Exception
	{
		Homepage hp=PageFactory.initElements(driver, Homepage.class);
		hp.getLoginPopup().click();
		hp.getSearchBOXtxt().sendKeys("iphones less than 40000",Keys.ENTER);
		WebElement searchResult = hp.getContentVal();
		
		Assert.assertEquals(searchResult.isDisplayed(), true);
		List<WebElement> devicelist = hp.getIphonedevices();
		List<WebElement> pricelist = hp.getIphonePrice();
		List<WebElement> ratingslist = hp.getIphoneRatings();
		
		String[] header = {"Device Details", "Price", "Ratings"};
		ArrayList<String[]> list = new ArrayList<>();
		list.add(0,header);
		for(int i=0;i<devicelist.size();i++)
		{
			String[] row1 = {devicelist.get(i).getText(),pricelist.get(i).getText().substring(1),ratingslist.get(i).getText()};
			list.add(i, row1);
		}
		CSVWriter writecsv = new CSVWriter(new FileWriter("./TestOutputs/Iphonedetails9.csv"));
		writecsv.writeAll(list);
		writecsv.close();
		
	}
}
