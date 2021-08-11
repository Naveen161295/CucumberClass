package org.pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClassCreation;

public class Pom2 extends BaseClassCreation{
	public Pom2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNos;
	@FindBy(id="datepick_in")
	private WebElement fromDate;
	@FindBy(id="datepick_out")
	private WebElement toDate;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(id="Submit")
	private WebElement submit;
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement title;
	@FindBy(id="location_span")
	private WebElement errormsg;
	@FindBy(id="checkin_span")
	private WebElement checkin;
	@FindBy(id="checkout_span")
	private WebElement checkout;
	
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNos() {
		return roomNos;
	}
	public WebElement getFromDate() {
		return fromDate;
	}
	public WebElement getToDate() {
		return toDate;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	
	public WebElement getTitle() {
		return title;
	}
	public WebElement getErrormsg() {
		return errormsg;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public void clickSubmit() {
		getSubmit().click();
	}
	public void verifyTitle(String expectedResult) {
		String actualValue=get_Text(getTitle());
		Assert.assertEquals("Search Hotel", expectedResult, actualValue);
	}
	public void errorMsg(String expectedResult) {
		String actualValue=get_Text(getErrormsg());
		Assert.assertEquals("Please Select a Location", expectedResult, actualValue);
	}
	public void checkIncheckOut(String expectedResult) {
		String actualValue=get_Text(getCheckin());
		Assert.assertEquals("Check-Out Date shall be after than Check-In Date", expectedResult, actualValue);
		
	}
	public void checkout(String expectedresult1) {
		String actualValue1=get_Text(getCheckout());
		Assert.assertEquals("Check-In Date shall be before than Check-Out Date", expectedresult1, actualValue1);
	
	}
	public void clickSearchHotel(String location, String noOfroom,
			String checkIn, String checkOut, String adultPerroom) {
		
		getRoomNos().sendKeys(noOfroom);
		getAdultRoom().sendKeys(adultPerroom);
		clickcheck(location, checkIn, checkOut);
	}
	public void searchHotel(String location, String hotel, String roomtype, String noOfroom,
			String checkIn, String checkOut, String adultPerroom, String childPerroom) {
		getHotels().sendKeys(hotel);
		getRoomType().sendKeys(roomtype);
		getChildRoom().sendKeys(childPerroom);
		clickSearchHotel(location, noOfroom, checkIn, checkOut, adultPerroom);
	}
	public void clickcheck(String location,String checkOut,String checkIn) {
		getLocation().sendKeys(location);
		javaScriptExecutor1(checkIn, getToDate());
		javaScriptExecutor1(checkOut, getFromDate());
		clickSubmit();
		
	}
	
}
