@smoketest
Feature: crée un nouveau compte Amazon
ETQ utilisateur je peut crée un nouveau compte sur AMAZON

  @Inscriptionamazon
  Scenario: je crée un nouveau compte sur Amazon 
Given I navigate on URL de AMAZON
When I accept les cookies
And  je clique au bouton Bonjour Identifiez-vous
Then je Vérifier que le message "S'identifier" est s'affiche 
When je cliquer sur le bouton Crée votre compte Amazon 
When je saisie mon nom "Mohamed Mahdi Khlif"
And  je saisie mon adresse mail "mahdi.khlif@hotmail.com"
And je saisie mon mot de passe "TestAutomatique@2023"
And je saisie mon confirm mot de passe "TestAutomatique@2023"
And je clique sur le bouton continuer 
Given I navigate on URL de Outlook
When je clique sur le bouton connexion
And je saisie "mahdi.khlif@hotmail.com"
And je clique sur le bouton suivant
And Je saisie mon mot de passe outlook "M08897952"
And je clique sur le bouton Se connecter
And je clique sur le bouton non
