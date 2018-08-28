package com.ibm.autotest.mockapplication.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ibm.autotest.utils.BrowserDriver;

public class LoginPageContainer {
	private String validationContainerCSS = "div.dijitValidationContainer";

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign In')]")
    public WebElement loginPageDiv;
	
	@FindBy(how = How.XPATH, using = "#LoginPage //input[@id='email']")
    public WebElement usernameInput;
	
	public WebElement getUsernameValidationDiv(){
		WebElement parent = BrowserDriver.getParent(BrowserDriver.getParent(usernameInput));
		return parent.findElement(By.cssSelector(validationContainerCSS));
	}
	
	@FindBy(how = How.XPATH, using = "#LoginPage //input[@id='password']")
    public WebElement passwordInput;
	
	public WebElement getPasswordValidationDiv(){
		WebElement parent = BrowserDriver.getParent(BrowserDriver.getParent(passwordInput));
		return parent.findElement(By.cssSelector(validationContainerCSS));
	}
	
	//this doesn't work due to the way dojo constructs buttons...need to find a better solution
//	@FindBy(how = How.CSS, using = "#LoginPage input[name=SubmitLogin]")
//    public WebElement submitButton;
	@FindBy(how = How.XPATH, using = "#LoginPage //button[@type='submit']")
    public WebElement submitButton;
}
