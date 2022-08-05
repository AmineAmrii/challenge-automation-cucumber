@draganddrop
Feature: Je me connect a l application  demoqadroppable
  Je souhaite faire l action dropanddrag avec cucumber

  @draganddrop_ok
  Scenario: Connexion a l application  demoqadroppable
    Given Je connecte a l application demoqadroppable "https://demoqa.com/droppable/"
    When Je selectione l element1
    And Je deplacer la souris vers l element2
    Then Je verifie que le text est change in drop
