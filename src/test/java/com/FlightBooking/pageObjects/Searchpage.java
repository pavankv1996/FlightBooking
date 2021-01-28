package com.FlightBooking.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {

	WebDriver ldriver;
	
	public Searchpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//input[@name='flight_origin']")
	@CacheLookup
	WebElement dropdown;

	@FindBy(xpath="//div/p[text()='Bangalore ']")
	@CacheLookup
	WebElement From;
	
	@FindBy(xpath="//div/p[text()='New Delhi ']")
	@CacheLookup
	WebElement To;
	
	@FindBy(id="BE_flight_origin_date")
	@CacheLookup
	WebElement Date;
	
	@FindBy(id="30/01/2021")
	@CacheLookup
	WebElement Datepicker;
	
	@FindBy(xpath="//input[@id='BE_flight_flsearch_btn']")
	@CacheLookup
	WebElement Searchh;
	
	public void Dropdown()
	{
		dropdown.click();
	}
	
	public void clickFrom()
	{
		From.click();
	}
	
	
	public void clickTo()
	{
		To.click();
	}
	
	
	public void clickDate()
	{
		Date.click();
	}
	
	public void clickDatepicker()
	{
		Datepicker.click();
	}
	
	public void Searchres()
	{
		Searchh.click();
	}
	
	
	
}











