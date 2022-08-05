@patient_form_test
Feature: Je me rends sur le site Patient Medical History Form
  En tant qu utilisateur, je souhaite me rendre sur le site de Patient Medical History afin de consulter l historique des patients

  @fill_complete_Form_OK
  Scenario Outline: Remplissage le formulaire du patient avec succes
    Given Je me rends sur le site Patient Medical History Form
    When Je choisis le sexe du patient tout en utilisant la liste déroulante Patient Gender "<patient_gender>"
    And Je saisis le prenom du patient "<first_Name>"
    And Je saisis le nom du patient "<last_Name>"
    And Je choisis le mois de la date de naissance du patient "<month_birth>"
    And Je choisis le jour de la date de naissance du patient "<day_birth>"
    And Je choisis l annee de la date de naissance du patient "<year_birth>"
    And Je saisis la longueur du patient en centimetres "<height_Patient>"
    And Je saisis le poids du patient en Kg "<weight_Patient>"
    And Je saisis un valide E-mail du patient "<e-mail_Patient>"
    And Je saisis la raison de la visite du medecin "<reason_Visit>"
    And Je saisis la liste des medicaments provoquant des allergies chez le patient "<drug_Allergies>"
    And Je choisis les maladies dont le patient souffre list_diseases
    #    And Je choisis les maladies dont le patient souffre "<list1_diseases>"
    And Je saiis s il y a d autres maladies dont le patient souffre "<other_illness>"
    And Je saisis la liste des operations ainsi que les dates "<list_Operations_Date>"
    And Je saisis la liste des medicaments recents "<current_Medications>"
    And Je choisis si le patient pratique du sport ainsi que la frequence "<patient_Exercice>"
    And Je choisis si le patient suit un regime santaire "<patient_Diet>"
    And Je choisis si le patient est alcoholique "<patient_Alcohol>"
    And Je choisis si le patient consomme de la cafeine "<patient_caffeine>"
    And Je choisis si le patient est un fumeur "<patient_Smoke>"
    And Je saisis un commentaire concernant l historique du patient "<patient_Historic>"
    And Je clique sur le bouton Submit afin de valider le formulaire
    Then Je me redirige vers la page de confirmation de la soumission du formulaire "Thank You!"
    When Je me redirige sur le site Patient Medical History Form

    Examples: 
      | patient_gender | first_Name | last_Name | month_birth | day_birth | year_birth | height_Patient | weight_Patient | e-mail_Patient        | reason_Visit | drug_Allergies | list_diseases   | other_illness | list_Operations_Date | current_Medications | patient_Exercice | patient_Diet             | patient_Alcohol | patient_caffeine | patient_Smoke | patient_Historic |
      | Female         | Yosra      | WELHAZI   | August      |        28 |       1990 |            160 |             55 | yosrawelhazi@yahoo.fr | tooth pain   | nothing        | Anemia,  Asthma | nothing       | nothing              | nothing             | Never            | I don't have a diet plan | I don't drink   | 5+ cups/day      | No            | nothing          |
  #   | Female         | Rim        | FROUI      | September   |        29 |       1992 |            161 |             62 | friouirim@gmail.com   | tooth pain   | nothing        |               | nothing       | nothing              | nothing             | 1-2 days         | I have a loose diet      | I don't drink   | I don't use caffeine | No            | nothing          |
  #   | Male           | Amine      | AMRI       | November    |         5 |       1988 |            170 |             70 | amineamri@gmail.com   | nothing      | nothing        | Asthma        | nothing       | nothing              | Never               | 3-4 days         | I have a strict diet     | I don't drink   | I don't use caffeine | No            | nothing          |
  #   | Female         | Samah      | AOUICHAOUI | August      |         2 |       1991 |            170 |             60 | samah@yahoo.fr        | tooth pain   | nothing        | Sleep Apnea   | nothing       | nothing              | nothing             | 5+ days          | I have a strict diet     | I don't drink   | 5+ cups/day          | No            | nothing          |
