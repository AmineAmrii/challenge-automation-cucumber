package com.e2etests.automation.step_definitions;

//import java.util.List;

import org.junit.Assert;

import com.e2etests.automation.page_objects.PatientPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientStepDefinition {
	
	private PatientPage patientPage;

	public PatientStepDefinition() {
		this.patientPage = new PatientPage();
	}

	@Given("Je me rends sur le site Patient Medical History Form")
	public void jeMeRendsSurLeSitePatientMedicalHistoryForm() {
		patientPage.goToURL();
	}

	@When("Je choisis le sexe du patient tout en utilisant la liste déroulante Patient Gender {string}")
	public void jeChoisisLeSexeDuPatientToutEnUtilisantLaListeDéroulantePatientGender(String gender) {
		patientPage.ChoiceOfPatientGender(gender);
	}

	@When("Je saisis le prenom du patient {string}")
	public void jeSaisisLePrenomDuPatient(String f_name) {
		patientPage.fillFirstNameOfPatient(f_name);
	}

	@When("Je saisis le nom du patient {string}")
	public void jeSaisisLeNomDuPatient(String l_name) {
		patientPage.fillLastNameOfPatient(l_name);
	}

	@When("Je choisis le mois de la date de naissance du patient {string}")
	public void jeChoisisLeMoisDeLaDateDeNaissanceDuPatient(String month) {
		patientPage.choiceOfMonthBith(month);
	}

	@When("Je choisis le jour de la date de naissance du patient {string}")
	public void jeChoisisLeJourDeLaDateDeNaissanceDuPatient(String day) {
		patientPage.choiceOfDayBirth(day);
	}

	@When("Je choisis l annee de la date de naissance du patient {string}")
	public void jeChoisisLAnneeDeLaDateDeNaissanceDuPatient(String year) {
		patientPage.choiceOfYearBirth(year);
	}

	@When("Je saisis la longueur du patient en centimetres {string}")
	public void jeSaisisLaLongueurDuPatientEnCentimetres(String length) {
		patientPage.fillPatientHeight(length);
	}

	@When("Je saisis le poids du patient en Kg {string}")
	public void jeSaisisLePoidsDuPatientEnKg(String weight) {
		patientPage.fillPatientWeight(weight);
	}

	@When("Je saisis un valide E-mail du patient {string}")
	public void jeSaisisUnValideEMailDuPatient(String email) {
		patientPage.fillPatientEmail(email);
	}

	@When("Je saisis la raison de la visite du medecin {string}")
	public void jeSaisisLaRaisonDeLaVisiteDuMedecin(String reason) {
		patientPage.fillPatientReasonVisite(reason);
	}

	@When("Je saisis la liste des medicaments provoquant des allergies chez le patient {string}")
	public void jeSaisisLaListeDesMedicamentsProvoquantDesAllergiesChezLePatient(String liste) {
		patientPage.fillPatientHistory(liste);
	}

	@When("Je choisis les maladies dont le patient souffre {string}")
	public void jeChoisisLesMaladiesDontLePatientSouffre(String diseases) throws InterruptedException {
		patientPage.clickOnPatientDiseases(diseases);
		Thread.sleep(5000);
	}

	@When("Je saiis s il y a d autres maladies dont le patient souffre {string}")
	public void jeSaiisSIlYADAutresMaladiesDontLePatientSouffre(String other_illnesses) {
		patientPage.fillPatientOtherIllnesses(other_illnesses);

	}

	@When("Je saisis la liste des operations ainsi que les dates {string}")
	public void jeSaisisLaListeDesOperationsAinsiQueLesDates(String operations) {
		patientPage.fillPatientListOperations(operations);
	}

	@When("Je saisis la liste des medicaments recents {string}")
	public void jeSaisisLaListeDesMedicamentsRecents(String medications) {
		patientPage.fillPatientCurrentMedications(medications);
	}

	@When("Je choisis si le patient pratique du sport ainsi que la frequence {string}")
	public void jeChoisisSiLePatientPratiqueDuSportAinsiQueLaFrequence(String exercice) {
		patientPage.clickOnPatientExerciceFrequency(exercice);
	}

	@When("Je choisis si le patient suit un regime santaire {string}")
	public void jeChoisisSiLePatientSuitUnRegimeSantaire(String diet) {
		patientPage.clickOnPatientDietStyle(diet);
	}

	@When("Je choisis si le patient est alcoholique {string}")
	public void jeChoisisSiLePatientEstAlcoholique(String alcohol) {
		patientPage.clickOnPatientAlcoholConsumption(alcohol);
	}

	@When("Je choisis si le patient consomme de la cafeine {string}")
	public void jeChoisisSiLePatientConsommeDeLaCafeine(String cafeine) {
		patientPage.clickOnPatientCaffeineConsumption(cafeine);
	}

	@When("Je choisis si le patient est un fumeur {string}")
	public void jeChoisisSiLePatientEstUnFumeur(String smoke) {
		patientPage.clickOnPatientSmokeHabits(smoke);
	}

	@When("Je saisis un commentaire concernant l historique du patient {string}")
	public void jeSaisisUnCommentaireConcernantLHistoriqueDuPatient(String comments) {
		patientPage.fillPatientComments(comments);
	}

	@When("Je clique sur le bouton Submit afin de valider le formulaire")
	public void jeCliqueSurLeBoutonSubmitAfinDeValiderLeFormulaire() {
		patientPage.clickOnBtnSubmit();
	}

	@Then("Je me redirige vers la page de confirmation de la soumission du formulaire {string}")
	public void jeMeRedirigeVersLaPageDeConfirmationDeLaSoumissionDuFormulaire(String message) {
		String txt_message = PatientPage.text_Confirmation.getText();
		Assert.assertTrue(txt_message.contains(message));
	}

	@When("Je me redirige sur le site Patient Medical History Form")
	public void jeMeRedirigeSurLeSitePatientMedicalHistoryForm() {
		patientPage.navigateBack();
	}


}
