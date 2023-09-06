@moketest
Feature: authentification
 ETQ utilisateur je veux me parcourir sur mon compte AMAZON	
 Background: 
	 Given je navigue sur URL
    When je clique sur accepter cookies
  @connexion
  Scenario: authetification avec des coordonnées valides
   
    When  je saisie  l'email "mahdi.khlif@yahoo.com"
    And  je clique sur continuer
   	Then je passe vers la page de MDP
   	When je saisie le MDP "M08897952"
   	And  je clique sur s'identifier
    Then je verifie que je suis sur ma page "Bonjour mahdi"
    
    @multicnx
    Scenario Outline: multi connection
   
    When  je saisie  l'email "<email>"
    And  je clique sur continuer
   	Then je passe vers la page de MDP
   	When je saisie le MDP "<password>"
   	And  je clique sur s'identifier
    Then je verifie que je suis sur ma page "Bonjour "
    Examples:
    |email|password|
    |mahdi.khlif@yahoo.com|M08897952|
    |nodeit.inc@gmail.com|Aloulou03022021|
    |formation.qa.test@gmail.com|formationQa@2022|
   
    
    

 