package com.e2etests.automation.page_objects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SelectFromListUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.WebActionHelperMethods;

public class PatientPage {
	
	private ConfigFileReader configFileReader;
	private SelectFromListUtils selectFromListUtils;
	private WebActionHelperMethods webActionHelperMethods;

	JavascriptExecutor execute = (JavascriptExecutor) Setup.driver;

	/* @FindBy WebElement */

	@FindBy(how = How.ID, using = "input_71")
	public static WebElement patient_Gender;

	@FindBy(how = How.ID, using = "first_45")
	public static WebElement patient_FirstName;

	@FindBy(how = How.ID, using = "last_45")
	public static WebElement patient_lastName;

	@FindBy(how = How.ID, using = "input_46_month")
	public static WebElement patient_MonthBirth;

	@FindBy(how = How.ID, using = "input_46_day")
	public static WebElement patient_DayBirth;

	@FindBy(how = How.ID, using = "input_46_year")
	public static WebElement patient_YearBirth;

	@FindBy(how = How.ID, using = "input_72")
	public static WebElement patient_height;

	@FindBy(how = How.ID, using = "input_73")
	public static WebElement patient_weight;

	@FindBy(how = How.ID, using = "input_74")
	public static WebElement patient_Email;

	@FindBy(how = How.ID, using = "input_50")
	public static WebElement reason_Visit;

	@FindBy(how = How.ID, using = "input_51")
	public static WebElement patient_History;

	@FindBy(how = How.XPATH, using = "//input[@name='q52_haveYou52[]']")
	public static List<WebElement> list_Disease;

	@FindBy(how = How.ID, using = "input_55")
	public static WebElement other_illnesses;

	@FindBy(how = How.ID, using = "input_69")
	public static WebElement list_Operations;

	@FindBy(how = How.ID, using = "input_68")
	public static WebElement current_Medications;

	@FindBy(how = How.XPATH, using = "//input[@name='q80_exercise']")
	public static List<WebElement> list_Exercice;

	@FindBy(how = How.XPATH, using = "//input[@name='q81_eatingFollowing']")
	public static List<WebElement> diet_Style;

	@FindBy(how = How.XPATH, using = "//input[@name='q76_alcoholConsumption']")
	public static List<WebElement> alcohol_Consumption;

	@FindBy(how = How.XPATH, using = "//input[@name='q77_caffeineConsumption77']")
	public static List<WebElement> caffeine_Consumption;

	@FindBy(how = How.XPATH, using = "//input[@name='q78_doYou']")
	public static List<WebElement> smoke_Habits;

	@FindBy(how = How.ID, using = "input_17")
	public static WebElement patient_comments;

	@FindBy(how = How.ID, using = "input_14")
	public static WebElement btnSubmit;

	@FindBy(how = How.ID, using = "stage")
	public static WebElement text_Confirmation;

	public PatientPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
		this.selectFromListUtils = new SelectFromListUtils();
		this.webActionHelperMethods = new WebActionHelperMethods();
	}

	/* Create Methods */

	public void goToURL() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}

	/* Select Gender's Patient */
	public void ChoiceOfPatientGender(String patient_Sexe) {
		selectFromListUtils.selectDropDownListByVisibleText(patient_Gender, patient_Sexe);
	}

	/* Fill Patient's First Name */
	public void fillFirstNameOfPatient(String txt_firstname) {
		webActionHelperMethods.writeText(patient_FirstName, txt_firstname);
	}

	/* Fill Patient's Last Name */
	public void fillLastNameOfPatient(String txt_lastname) {
		webActionHelperMethods.writeText(patient_lastName, txt_lastname);
	}

	/* Select Patient's Month Birth */
	public void choiceOfMonthBith(String month_Birth) {
		selectFromListUtils.selectDropDownListByVisibleText(patient_MonthBirth, month_Birth);
	}

	/* Select Patient's Day Birth */
	public void choiceOfDayBirth(String day_Birth) {
		selectFromListUtils.selectDropDownListByVisibleText(patient_DayBirth, day_Birth);
	}

	/* Select Patient's Year Birth */
	public void choiceOfYearBirth(String year_Birth) {
		selectFromListUtils.selectDropDownListByVisibleText(patient_YearBirth, year_Birth);
	}

	/* Fill Patient's Height */
	public void fillPatientHeight(String height_Pt) {
		webActionHelperMethods.writeText(patient_height, height_Pt);
	}

	/* Fill Patient's Weight */
	public void fillPatientWeight(String weight_Pt) {
		webActionHelperMethods.writeText(patient_weight, weight_Pt);
	}

	/* Fill Patient's E-mail */
	public void fillPatientEmail(String txt_mail) {
		webActionHelperMethods.writeText(patient_Email, txt_mail);
	}

	/* Fill the Reason for Seeing the Doctor */
	public void fillPatientReasonVisite(String reason) {
		webActionHelperMethods.writeText(reason_Visit, reason);
	}

	/* Fill the Patient's History */
	public void fillPatientHistory(String history) {
		webActionHelperMethods.writeText(patient_History, history);
	}

	/* Click Patient's Disease */
	public void clickOnPatientDiseases(String disease_patient) {
		for (WebElement disease : list_Disease) {
			if (disease.getAttribute("value").equalsIgnoreCase(disease_patient)) {
				execute.executeScript("arguments[0].click();", disease);
			}
		}

//		for (WebElement disease : list_Disease) {
//			for (String strg : diseases) {
//				if (disease.getAttribute("value").equalsIgnoreCase(strg)) {
//					execute.executeScript("arguments[0].click();", disease);
//				}
//			}
//		}
//		System.out.println("********  "+list_Disease);
	}

	/* Fill Patient's Other Illnesses */
	public void fillPatientOtherIllnesses(String illnesses) {
		webActionHelperMethods.writeText(other_illnesses, illnesses);
	}

	/* Fill Patient's List of Operations */
	public void fillPatientListOperations(String operations) {
		webActionHelperMethods.writeText(list_Operations, operations);
	}

	/* Fill Patient's Current Medications */
	public void fillPatientCurrentMedications(String medications) {
		webActionHelperMethods.writeText(current_Medications, medications);
	}

	/* Fill Patient's Exercise Practice Frequency */
	public void clickOnPatientExerciceFrequency(String exercice) {
		for (WebElement element_exercice : list_Exercice) {
			if (element_exercice.getAttribute("value").equalsIgnoreCase(exercice)) {
				execute.executeScript("arguments[0].click();", element_exercice);
			}
		}

	}

	/* Fill Patient's Diet Style */
	public void clickOnPatientDietStyle(String diet) {
		for (WebElement element_diet : diet_Style) {
			if (element_diet.getAttribute("value").equalsIgnoreCase(diet)) {
				execute.executeScript("arguments[0].click();", element_diet);
			}
		}

	}

	/* Fill Patient's Alcohol Consumption Frequency */
	public void clickOnPatientAlcoholConsumption(String alcohol) {
		for (WebElement element_alcohol : alcohol_Consumption) {
			if (element_alcohol.getAttribute("value").equalsIgnoreCase(alcohol)) {
				execute.executeScript("arguments[0].click();", element_alcohol);
			}
		}

	}

	/* Fill Patient's Caffeine Consumption Frequency */
	public void clickOnPatientCaffeineConsumption(String caffeine) {
		for (WebElement element_caffeine : caffeine_Consumption) {
			if (element_caffeine.getAttribute("value").equalsIgnoreCase(caffeine)) {
				execute.executeScript("arguments[0].click();", element_caffeine);
			}
		}

	}

	/* Fill Patient's Smoke Habits */
	public void clickOnPatientSmokeHabits(String smoke) {
		for (WebElement element_smoke : smoke_Habits) {
			if (element_smoke.getAttribute("value").equalsIgnoreCase(smoke)) {
				execute.executeScript("arguments[0].click();", element_smoke);
			}
		}

	}

	/* Fill Patient comments */
	public void fillPatientComments(String comments_patient) {
		webActionHelperMethods.writeText(patient_comments, comments_patient);
	}

	public void clickOnBtnSubmit() {
		btnSubmit.submit();
	}
	
	public void navigateBack () {
		Setup.driver.navigate().back();
	}

}
