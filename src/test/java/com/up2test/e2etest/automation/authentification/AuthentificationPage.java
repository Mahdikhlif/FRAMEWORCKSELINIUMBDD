package com.up2test.e2etest.automation.authentification;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AuthentificationPage {
													/*Locators*/
	final static String ACCEPT_COOKIES = "sp-cc-accept";
	final static String CLIQUE_IDENTIFICATION ="nav-link-accountList";
	final static String EMAIL="ap_email";
	final static String CLIQUE_CONTINUER ="continue";
	final static String MOTDEPASSE="ap_password";
	final static String CLIQUE_IDENTIFIER="signInSubmit";
	final static String VERIFICATION="nav-link-accountList-nav-line-1";	
	/*@FindBy*/
	@FindBy(how = How.ID, using = ACCEPT_COOKIES )
	public static WebElement acceptCookiesBtn;
	@FindBy(how = How.ID, using = CLIQUE_IDENTIFICATION)
	public static WebElement cliqueIdentificationBtn;
	@FindBy(how = How.ID, using = EMAIL)
	public static WebElement email;
	@FindBy(how = How.ID, using = CLIQUE_CONTINUER)
	public static WebElement cliqueContinuerBtn;
	@FindBy(how = How.ID, using = MOTDEPASSE)
	public static WebElement mdp;
	@FindBy(how = How.ID, using = CLIQUE_IDENTIFIER)
	public static WebElement cliqueIdentifierBtn;
	@FindBy(how = How.ID, using = VERIFICATION)
	public static WebElement verification;
													/*Methods*/
	public void clickAcceptCookies()
	{
		acceptCookiesBtn.click();
	}
	public void clickIdentification()
	{
		cliqueIdentificationBtn.click();
	}
	public void email(String eMail)
	{
		email.sendKeys(eMail);
	}
	public void clickContinuer()
	{
		cliqueContinuerBtn.click();
	}
	public void mdp(String mDp) throws InterruptedException
	{
		Thread.sleep(1000);
		mdp.sendKeys(mDp);
	}
	public void clickIdentifier()
	{
		cliqueIdentifierBtn.click();
	}
	public String getAccontText() throws InterruptedException {
		Thread.sleep(1000);
		return verification.getText();
		
		
	}
		
	
	
}

