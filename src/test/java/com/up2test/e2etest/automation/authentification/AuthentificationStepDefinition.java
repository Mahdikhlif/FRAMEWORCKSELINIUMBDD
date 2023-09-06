package com.up2test.e2etest.automation.authentification;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.up2test.e2etest.automation.utils.CommonMethods;
import com.up2test.e2etest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {
	WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private AuthentificationPage authentificationPage =new AuthentificationPage();
		public AuthentificationStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationPage.class);
	}
	
	@Given("je navigue sur URL")
	public void jeNavigueSurURL() throws IOException {
		commonMethods.openURLWithConfigFile("url1");
		
	}

	@When("je clique sur accepter cookies")
	public void jeCliqueSurAccepterCookies() {
		authentificationPage.clickAcceptCookies();
		authentificationPage.clickIdentification();
	}

	@When("je saisie  l'email {string}")
	public void jeSaisieLEmail(String string) {
		authentificationPage.email(string);
	}

	@When("je clique sur continuer")
	public void jeCliqueSurContinuer() {
		authentificationPage.clickContinuer();
	}

	@Then("je passe vers la page de MDP")
	public void jePasseVersLaPageDeMDP() {

	}

	@When("je saisie le MDP {string}")
	public void jeSaisieLeMDP(String string) throws InterruptedException {
		authentificationPage.mdp(string);
	
	}

	@When("je clique sur s'identifier")
	public void jeCliqueSurSIdentifier() {
		authentificationPage.clickIdentifier();
	}

	@Then("je verifie que je suis sur ma page {string}")
	public void jeVerifieQueJeSuisSurMaPage(String text) throws InterruptedException {
	String message =authentificationPage.getAccontText();
	Assert.assertTrue(message.contains(text));
	  
	}

}
