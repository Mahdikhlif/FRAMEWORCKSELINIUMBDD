package com.up2test.e2etest.automation.keeyjob.inscription;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.up2test.e2etest.automation.utils.CommonMethods;
import com.up2test.e2etest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InscriptionStepDefinition {
	WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	
	private InscrptionPage inscriptionPage = new InscrptionPage();
	public InscriptionStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver , InscrptionPage.class);
	}
	
	@Given("I navigate on URL")
	public void iNavigateOnURL() throws IOException, InterruptedException {
		Thread.sleep(2000);
		commonMethods.openURLWithConfigFile("url2");
	}
	
	@When("I click on botton inscription")
	public void iClickOnBottonInscription() {
		inscriptionPage.clickInscription();	
			}
	

	@When("I seize my first name and the second {string}")
	public void iSeizeMyFirstNameAndTheSecond(String string) throws InterruptedException {
		inscriptionPage.prenom(string);
	}
	
	@When("I seize my second name {string}")
	public void iSeizeMySecondName(String string) {
		inscriptionPage.nom(string);
	    	}
	
	@When("I select my birthday {string}")
	public void iSelectMyBirthday(String string) {
		inscriptionPage.day(string);
	   
	}
	
	@When("I select the month of my birth\"mars\"")
	public void iSelectTheMonthOfMyBirthMars(String string) {
		inscriptionPage.month(string);
	}
	@When("I select the year of my birth	\"{int}\"")
	public void iSelectTheYearOfMyBirth(String string) {
		inscriptionPage.year(string);
	   
	}
	@When("I select my coutry	\"Tunisie\"")
	public void iSelectMyCoutryTunisie(String string) {
		inscriptionPage.country(string);
	}
	
	@When("I select my coutry {string}")
	public void iSelectMyCoutry(String string) {
		inscriptionPage.country1(string);
	  
	}
	@When("I scheck the code of numbre of country {string}")
	public void iScheckTheCodeOfNumbreOfCountry(String string) {
		String messAge = inscriptionPage.codeCountryNumber(string);
		Assert.assertTrue(messAge.contains(string));
	   	}
	
	@When("I seize my fone number {string}")
	public void iSeizeMyFoneNumber(String string) {
		inscriptionPage.phoneNumber(string);
	  
	}
	@When("I seize my eamil {string}")
	public void iSeizeMyEamil(String string) {
		inscriptionPage.email(string);
	   
	}
	
	@When("I slelect my degree of scool {string}")
	public void iSlelectMyDegreeOfScool(String string) {
		inscriptionPage.scoolDegree(string);
	}
	
	@When("I selecht the numbre of years of experience {string}")
	public void iSelechtTheNumbreOfYearsOfExperience(String string) {
		inscriptionPage.yearsExperience(string);
	}
	
	@When("I seize my pasword {string}")
	public void iSeizeMyPasword(String string) {
		inscriptionPage.password(string); 
	}
	
	@When("I seize the confirm of my password {string}")
	public void iSeizeTheConfirmOfMyPassword(String string) {
		inscriptionPage.confirmPassword(string);
	    
	}
	
	@When("I select how I found this web site {string}")
	public void iSelectHowIFoundThisWebSite(String string) {
		inscriptionPage.singUpResources(string);
	}
	
	@When("I udate my resume")
	public void iUdateMyResume() {
	   
	}
	
	@When("I click  to accept the rools")
	public void iClickToAcceptTheRools() {
	   
	}
	
	@When("I click to accept the receve all offers")
	public void iClickToAcceptTheReceveAllOffers() {
	    
	}
	
	@When("I click on the botton s'inscrie")
	public void iClickOnTheBottonSInscrie() {
	    
	}








}
