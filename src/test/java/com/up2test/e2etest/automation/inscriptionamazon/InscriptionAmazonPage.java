package com.up2test.e2etest.automation.inscriptionamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InscriptionAmazonPage {
																						/*Locators*/
	//on the site AMAZON.com
final static String MESSAGE_IDENTIFICATION= "//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div/h1"; //WPATH
final static String CREE_VOTRE_COMPTE_AMAZON = "createAccountSubmit";//id
final static String CREE_UN_COMPTE="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/h1"; //XPATH
final static String NOM= "ap_customer_name";//ID
final static String EMAIL="ap_email";//ID
final static String PASSWORD="ap_password";//ID
final static String PASSWORD1="ap_password_check";//ID
final static String CONTINUER="continue";
final static String VERIFICATION="//*[@id=\"verification-code-form\"]/div[1]/div[1]/h1";//Xpath
// on site outlook.com
final static String CONNECTION_EMAIL="/html/body/header/div/aside/div/nav/ul/li[2]/a"; //XPATH
final static String EMAIL_OUTLOOK ="i0116"; //Id
final static String SUIVANT ="idSIButton9";//Id
final static String MDP = "i0118";//id
final static String CONNECTER="idSIButton9";//id
final static String NON ="idBtn_Back";//id
																						/*@FindBy*/
@FindBy(how = How.XPATH, using = MESSAGE_IDENTIFICATION  )
public static WebElement messageIdentificationText;
@FindBy(how = How.ID, using = CREE_VOTRE_COMPTE_AMAZON  )
public static WebElement creeVotreCompteAmazonBtn;
@FindBy(how = How.XPATH, using = CREE_UN_COMPTE )
public static WebElement creeUnCompteText;

@FindBy(how = How.ID, using = NOM  )
public static WebElement nom;

@FindBy(how = How.ID, using =EMAIL  )
public static WebElement email;

@FindBy(how = How.ID, using = PASSWORD  )
public static WebElement password;

@FindBy(how = How.ID, using =PASSWORD1  )
public static WebElement checkPassword;

@FindBy(how = How.ID, using = CONTINUER  )
public static WebElement continuerBtn;

@FindBy(how = How.XPATH, using =VERIFICATION  )
public static WebElement verficationText;

@FindBy(how = How.XPATH, using = CONNECTION_EMAIL  )
public static WebElement connextionBtn;

@FindBy(how = How.ID, using = EMAIL_OUTLOOK  )
public static WebElement emailOutlook ;

@FindBy(how = How.ID, using =SUIVANT  )
public static WebElement suivantBtn;

@FindBy(how = How.ID, using =MDP  )
public static WebElement mdp ;

@FindBy(how = How.ID, using = CONNECTER )
public static WebElement connecterBtn;

@FindBy(how = How.ID, using = NON )
public static WebElement nonBtn;

																						/*Methods*/
public String messageIdentificationText() throws InterruptedException {
	Thread.sleep(1000);
	return messageIdentificationText.getText();
}

public void creeVotreCompteAmazon() {
	creeVotreCompteAmazonBtn.click();
}

public String creeVotreCompteText() throws InterruptedException {
	Thread.sleep(1000);
	return creeUnCompteText.getText();
}
public void nom(String nOm ) {
	nom.sendKeys(nOm);
}
public void email(String eMail) {
	email.sendKeys(eMail);
}
public void password(String passWord) {
	password.sendKeys(passWord);
}
public void checkPassword(String checkPassWord) {
	checkPassword.sendKeys(checkPassWord);
}
public void continuer() {
	continuerBtn.click();
}
public String Verification() throws InterruptedException{
	Thread.sleep(1000);
	return verficationText.getText();
}
// verfication message dans la boite eamil
public void connection()
{
	connextionBtn.click();
}
public void emailOutlook (String eMail) {
	emailOutlook.sendKeys(eMail);
}
public void suivantBtn() {
	suivantBtn.click();
}
public void mdp(String mDp)
{
	mdp.sendKeys(mDp);
}
public void connectionBtn() {
	connextionBtn.click();
}
public void nonBtn() {
	nonBtn.click();
}



























}

