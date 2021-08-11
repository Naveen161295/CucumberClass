package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClassCreation;

public class Pom1 extends BaseClassCreation{
	
	public Pom1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "username")
	private WebElement textuserName;
	@FindBy(id= "password")
	private WebElement textPassword;
	@FindBy(id="login")
	private WebElement btnLogIn;
	public WebElement getTextuserName() {
		return textuserName;
	}
	public WebElement getTextPassword() {
		return textPassword;
	}
	public WebElement getBtnLogIn() {
		return btnLogIn;
	}
	public void login(String username,String password) {
		getTextuserName().sendKeys(username);
		getTextPassword().sendKeys(password);
		getBtnLogIn().click();

	}
	
}
