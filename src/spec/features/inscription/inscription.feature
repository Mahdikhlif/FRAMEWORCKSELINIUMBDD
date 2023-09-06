@smoke
Feature: creat an accont as a condidat 
  I want to use this template for my feature file

  @inscription
  Scenario: creat an accont on TanitJobo 
    Given I navigate on URL
    When I click on botton inscription
    When I seize my first name and the second "Mohmaed Mahdi" 
    And I seize my second name "Khlif"
    And  I select my birthday "5"
		And I select the month of my birth"mars"
		And I select the year of my birth	"1991"
		And I select my coutry	"Tunisie"
		And I select my coutry "Tunisie"
		And I scheck the code of numbre of country "(+216)"
		And I seize my fone number " 27641885"
		And I seize my eamil "mahdi.khlif@yahoo.com"
		And I slelect my degree of scool " Bac + 5 "
		And I selecht the numbre of years of experience "Entre 2 et 5 ans "
		And I seize my pasword "M08897952"
		And I seize the confirm of my password "M08897952"
		And I select how I found this web site "1"
		And I udate my resume 
		And I click  to accept the rools 
		And I click to accept the receve all offers
		And I click on the botton s'inscrie 
		Then I check the message "Bienvenue, Mohamed mahdi"
		And I check the message "mohamed mahdi khlif"
		
  