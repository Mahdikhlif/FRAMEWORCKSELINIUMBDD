package com.up2test.e2etest.automation.keeyjob.inscription;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class InscrptionPage {
													/*Locators*/
	final static String INSCRIPTION ="//*[@id=\"top-navigation\"]/div/ul[2]/input[2]";
	final static String MESSEGE_CREE_UN_COMPTE = ".base";
	final static String PRENOM ="//*[@id=\"id_first_name\"]";
	final static String NOM = "id_last_name";
	final static String DAY="id_birth_date_day";
	final static String MONTH="id_birth_date_month";
	final static String YEAR="id_birth_date_year";
	final static String COUNTRY="id_country";
	final static String	COUNTRY1="//*[@id=\"phonenumber0\"]/div/div/div[1]/select"	;
	final static String CODE_COUNTRY_NUMBER="//*[@id=\"phonenumber0\"]/div/div/div[2]/span[1]";
	final static String PHONE_NUMBER="//*[@id=\"phonenumber0\"]/div/div/div[2]/input";
	final static String EMAIL="id_email";
	final static String SCOOL_DEGREE="id_degree_level";
	final static String EXPERIENCE_YEARS="id_experience_level";
	final static String PASSWORD="id_password1";
	final static String CONFIRM_PASSWORD="id_password2";
	final static String SING_UP_SOURCES="id_signup_source";
	final static String RESUME="id_cv";
	final static String ACCEPT_ROOLS="id_opt_in_jobs_alerts";
	final static String ACCEPT_RECEIVE_OFFRES="id_opt_in_promotions";
	final static String INSCRIRE="//*[@id=\"form\"]/input[2]";
													/*@FindBy*/
	@FindBy (how = How.XPATH, using= INSCRIPTION)
	public static WebElement inscriptionBtn;
	
	@FindBy (how = How.CSS, using= MESSEGE_CREE_UN_COMPTE)
	public static WebElement messageCreeUnCompteText;
	
	@FindBy (how = How.XPATH, using= PRENOM )
	public static WebElement prenom  ;
	
	@FindBy (how = How.ID, using=NOM)
	public static WebElement nom  ;
	
	@FindBy (how = How.ID, using=DAY )
	public static WebElement day ;
	
	@FindBy (how = How.ID, using= MONTH )
	public static WebElement  month;
	
	@FindBy (how = How.ID, using= YEAR )
	public static WebElement  year ;
	
	@FindBy (how = How.ID, using= COUNTRY)
	public static WebElement country;
	
	@FindBy (how = How.XPATH, using= COUNTRY1 )
	public static WebElement country1;
	
	@FindBy (how = How.XPATH, using=CODE_COUNTRY_NUMBER )
	public static WebElement codeCountryNumber ;
	
	@FindBy (how = How.XPATH, using=PHONE_NUMBER )
	public static WebElement phoneNumber;
	
	@FindBy (how = How.ID, using=EMAIL )
	public static WebElement email;
	
	@FindBy (how = How.ID, using= SCOOL_DEGREE)
	public static WebElement scoolDegree ;
	
	@FindBy (how = How.ID, using= EXPERIENCE_YEARS )
	public static WebElement experienceYears ;
	
	@FindBy (how = How.ID, using= PASSWORD)
	public static WebElement password ;
	

	@FindBy (how = How.ID, using=CONFIRM_PASSWORD )
	public static WebElement confirmPassword  ;
	
	@FindBy (how = How.ID, using=SING_UP_SOURCES )
	public static WebElement singUpResources  ;
	
	@FindBy (how = How.ID, using= RESUME)
	public static WebElement resume  ;
	
	
	@FindBy (how = How.ID, using=ACCEPT_ROOLS )
	public static WebElement acceptRools  ;
	
	@FindBy (how = How.ID, using=ACCEPT_RECEIVE_OFFRES )
	public static WebElement acceptReceive_offres ;
	
	@FindBy (how = How.XPATH, using= INSCRIRE )
	public static WebElement inscrireBtn ;
	
													/*Methods*/
	WebDriver driver;
	
	public void clickInscription() {
		inscriptionBtn.click();
	}
	public String creeUnCompteText() {
		
		return messageCreeUnCompteText.getText();
	}
	public void prenom(String pRenom) throws InterruptedException {
		Thread.sleep(1000);
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value = ",pRenom)		;
	}
	public void nom(String nOm) {
		Actions action = new Actions(driver);
	 action.sendKeys(nom,nOm).perform();
	
 }
	public void day(String daY) {
		  
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,250);");
		Select dAy = new Select(day);
		dAy.selectByVisibleText(daY);
						
	}
	public void month(String moNth) {
		Select mOnth= new Select(month);
		mOnth.selectByVisibleText(moNth);
	}
	public void year(String yeAr) {
		Select yEar= new Select(year);
		yEar.selectByVisibleText(yeAr);
	}
	public void country(String cOuntry ) {
		Select coUntry= new Select(country);
		coUntry.selectByVisibleText(cOuntry);
	}
	public void country1(String cOuntry1 ) {
		Select coUntry1= new Select(country1);
		coUntry1.selectByVisibleText(cOuntry1);
	}
	public String codeCountryNumber(String cOde) {
	return codeCountryNumber.getText();
}

	public void phoneNumber(String pHone) {
		phoneNumber.sendKeys(pHone);
	}
	public void email(String eMail) {
		email.sendKeys(eMail);
	}
	public void scoolDegree(String deGree ) {
		Select scoolDeGree= new Select(scoolDegree);
		scoolDeGree.selectByVisibleText(deGree);
	}
	public void yearsExperience(String yeaRs ) {
		Select yearsExPerience= new Select(experienceYears);
		yearsExPerience.selectByVisibleText(yeaRs);
	}
	public void password(String passWord) {
		password.sendKeys(passWord);
	}
	public void confirmPassword(String confirmPass) {
			confirmPassword.sendKeys(confirmPass);
		}
	public void singUpResources(String singUp ) {
		Select singUpResOurces= new Select(singUpResources);
		singUpResOurces.selectByValue(singUp);
	}
	
}
