package com.up2test.e2etest.automation.inscriptionamazon;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.up2test.e2etest.automation.authentification.AuthentificationPage;
import com.up2test.e2etest.automation.utils.CommonMethods;
import com.up2test.e2etest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InscriptionAmazonStepDefinition {
	WebDriver driver; 
	private CommonMethods commonMethods = new CommonMethods();
	private InscriptionAmazonPage inscriptionAmazonPage = new InscriptionAmazonPage();
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	public InscriptionAmazonStepDefinition() {
		driver =Setup.driver;
		PageFactory.initElements(driver, authentificationPage);
		PageFactory.initElements(driver, inscriptionAmazonPage);
	}

	@Given("I navigate on URL de AMAZON")
	public void iNavigateOnURLDeAMAZON() throws IOException {
	    commonMethods.openURLWithConfigFile("url1");
	}
	
	@When("I accept les cookies")
	public void iAcceptLesCookies() {
		authentificationPage.clickAcceptCookies();
	    	}
	
	@When("je clique au bouton Bonjour Identifiez-vous")
	public void jeCliqueAuBouton() {
		authentificationPage.clickIdentification();
	   	}
	
	@Then("je Vérifier que le message {string} est s'affiche")
	public void jeVérifierQueLeMessageEstSAffiche(String string) throws InterruptedException {
	    String message= inscriptionAmazonPage.messageIdentificationText();
	    Assert.assertTrue(message.contains(string));
	}
	
	@When("je cliquer sur le bouton Crée votre compte Amazon")
	public void jeCliquerSurLeBouton() {
	inscriptionAmazonPage.creeVotreCompteAmazon();   
	}
	@Then("je vérifie que le message {string} s'affiche")
	public void jeVérifieQueLeMessageSAffiche(String string) throws InterruptedException {
		String text = inscriptionAmazonPage.creeVotreCompteText();
		Assert.assertTrue(text.contains(string));
	 	}
	
	@When("je saisie mon nom {string}")
	public void jeSaisieMonNom(String string) {
		inscriptionAmazonPage.nom(string);   
	}
	@When("je saisie mon adresse mail {string}")
	public void jeSaisieMonAdresseMail(String string) {
		inscriptionAmazonPage.email(string);
	}
	@When("je saisie mon mot de passe {string}")
	public void jeSaisieMonMotDePasse(String string) {
		inscriptionAmazonPage.password(string);
			}
	@When("je saisie mon confirm mot de passe {string}")
	public void jeSaisieMonConfirmMotDePasse(String string) {
		inscriptionAmazonPage.checkPassword(string);
	}
	@When("je clique sur le bouton continuer")
	public void jeCliqueSurLeBoutonContinuer() {
		inscriptionAmazonPage.continuer();
	}
	@Then("je verifie que le message {string} est s'affiche")
	public void jeVerifieQueLeMessageEstSAffiche(String string) throws InterruptedException {
	    String verificationText =inscriptionAmazonPage.Verification();
	    Assert.assertTrue(verificationText.contains(string));
	}
	@Given("I navigate on URL de Outlook")
	public void iNavigateOnURLDeOutlook() throws IOException {
		commonMethods.openURLWithConfigFile("url3");
	}
	@When("je clique sur le bouton connexion")
	public void jeCliqueSurLeBoutonConnexion() {
		inscriptionAmazonPage.connection();
	}
	@When("je saisie {string}")
	public void jeSaisie(String string) {
		inscriptionAmazonPage.emailOutlook(string);
	}
	@When("je clique sur le bouton suivant")
	public void jeCliqueSurLeBoutonSuivant() {
		inscriptionAmazonPage.suivantBtn();
	}
	@When("Je saisie mon mot de passe outlook {string}")
	public void jeSaisieMonMotDePasseOutlook(String string) {
		inscriptionAmazonPage.mdp(string);
	}
	@When("je clique sur le bouton Se connecter")
	public void jeCliqueSurLeBoutonSeConnecter() {
		inscriptionAmazonPage.connectionBtn();
	}
	@When("je clique sur le bouton non")
	public void jeCliqueSurLeBoutonNon() {
		inscriptionAmazonPage.nonBtn();
	}




}
