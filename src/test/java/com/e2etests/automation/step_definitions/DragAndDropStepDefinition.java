package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.DragAndDropPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDropStepDefinition {
	
	private DragAndDropPage dragAndDropPage;
	public DragAndDropStepDefinition() {
		this.dragAndDropPage = new DragAndDropPage();
	}
	
	@Given("Je connecte a l application demoqadroppable {string}")
	public void jeConnecteALApplicationDemoqadroppable(String url2) {
		dragAndDropPage.goToURL(url2); 
	}
	
	@When("Je selectione l element1")
	public void jeSelectioneLElement1() {
		dragAndDropPage.selectioneElement1();
	}
	
	@When("Je deplacer la souris vers l element2")
	public void jeDeplacerLaSourisVersLElement2() {
		dragAndDropPage.selectioneElement2();
	}
	@Then("Je verifie que le text est change in drop")
	public void jeVerifieQueLeTextEstChangeInDrop() {
		dragAndDropPage.dragAndDropAction();
	}

}
